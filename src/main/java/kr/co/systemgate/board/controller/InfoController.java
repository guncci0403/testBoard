package kr.co.systemgate.board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.systemgate.board.service.InfoService;
import kr.co.systemgate.board.vo.InfoVO;
import kr.co.systemgate.board.vo.JqGridVO;
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
		return "/info";
	}

	//info 페이징 처리
	@RequestMapping(path="/selectpaginginfo", method = RequestMethod.GET)
	public String selectPagingInfo(@RequestParam(defaultValue = "2") int page, 
	@RequestParam(defaultValue = "3") int pageSize, Model model,  @ModelAttribute JqGridVO jqgridVO, HttpServletRequest request, HttpServletResponse response) throws Exception{

//        PrintWriter out = null;
//        response.setCharacterEncoding("UTF-8");
//        String quotZero = request.getParameter("param");
//        logger.debug("quotZero : {}", quotZero);
//        quotZero = quotZero.replaceAll(""", "\"");
//        logger.debug("quotZero : {}", quotZero);
//		
//        Map<String, Object> castMap = new HashMap<String, Object>();
//        
//        castMap = JsonUtil.JsonToMap(quotZero);
//        
//        jqgridVO.setServiceImplYn((String) castMap.get("serviceImplYn"));
//        
//        List<EgovMap> jqGridList = jqgridService.selectJqgridList(jqgridVO);
//        
//        EgovMap jqGridListCnt = jqgridService.selectJqgridListCnt(jqgridVO);
//        
//        HashMap<String, Object> resMap = new HashMap<String, Object>();
//        
//        resMap.put("records", jqGridListCnt.get("totaltotcnt"));
//        resMap.put("rows", jqGridList);
//        resMap.put("page", request.getParameter("page"));
//        resMap.put("total", jqGridListCnt.get("totalPage"));
//        
//        out = response.getWriter();
//        System.out.println(resMap);
//        System.out.println(JsonUtil.HashMapToJson(resMap).toString());
//        out.write(JsonUtil.HashMapToJson(resMap).toString());
        
        
        
		int paging = (page - 1) * pageSize;
		PageVO pageVO = new PageVO(paging, pageSize);
		logger.debug("pageVO: {}", pageVO);
		
//		EgovMap egovMap = infoService.selectPagingInfo(pageVO);
//		
//		logger.debug("0:{}", egovMap.get(0));
//		System.out.println(egovMap.get(0)+ "1123");
//		logger.debug("123");
		Map<String, Object> map = infoService.selectPagingInfo(pageVO);
		int cnt = (int)map.get("cnt");
		
		int total = (int)Math.ceil((double)cnt/(double)pageSize);
		model.addAttribute("pagination", total);
//		List<InfoVO> list = (List<InfoVO>) map.get("infoList");
		
		model.addAttribute("infoList", map.get("infoList"));
		logger.debug("infoList: {}",  map.get("infoList"));
		
//		InfoJsonVO infoJsonVO = new InfoJsonVO();
//		infoJsonVO.setTotal(total);
//		infoJsonVO.setRecords(cnt);
//		infoJsonVO.setPage(page);
//		infoJsonVO.setRows(list);
//		
//		Gson gson = new GsonBuilder().create();
//        String json = gson.toJson(infoJsonVO);
//		
//		model.addAttribute("json", json);
		return "/info";
	}
	
	@RequestMapping(path="/selectpaginginfo", method = RequestMethod.POST)
	public String selectPagingInfo(@RequestParam(defaultValue = "2") int page, 
	@RequestParam(defaultValue = "3") int pageSize, String code, Model model, RedirectAttributes ra) throws Exception{
		List<String> authorCode = new ArrayList<String>();
		authorCode.add(code);
		logger.debug("author_code: {}", authorCode);
		
		/*ra.addAttribute(author_code);*/
		model.addAttribute("authorCode", authorCode);
		return "/info";
	}
	
	
}
