package kr.co.systemgate.board.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.systemgate.board.service.InfoService;
import kr.co.systemgate.board.vo.InfoVO;
import kr.co.systemgate.common.vo.PageVO;

@Controller
public class InfoController {
	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@Resource(name="infoService")
	private InfoService infoService;
	
	@RequestMapping(value="/selectinfo")
	public String SelectInfo(InfoVO infoVO, Model model) throws Exception{
		infoVO = infoService.selectInfo(infoVO);
		model.addAttribute("InfoVO", infoVO);
//		logger.debug("infoVO: {}", infoVO);
		logger.debug("==============map====================: {}");
		return "/info";
	}

	@RequestMapping(value="/selectpaginginfo")
	public String selectPagingInfo(@RequestParam(defaultValue = "1") int page, 
	@RequestParam(defaultValue = "3") int pageSize, Model model) throws Exception{
		
		PageVO pageVO = new PageVO(page, pageSize);
		logger.debug("pageVO_1: {}", pageVO);
		int paging = (page - 1) * pageSize;
		pageVO.setPage(paging);
		pageVO.setPageSize(pageSize);
		logger.debug("pageVO_2: {}", pageVO);
		
		Map<String, Object> map = infoService.selectPagingInfo(pageVO);
		int cnt = (int)map.get("cnt");
		model.addAttribute("pagination", (int)Math.ceil((double)cnt/5));
		model.addAttribute("infoList", map.get("infoList"));
		return "/info";
	}
	
	
}
