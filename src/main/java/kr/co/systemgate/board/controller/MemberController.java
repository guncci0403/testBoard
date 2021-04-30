package kr.co.systemgate.board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.systemgate.board.service.MemberService;
import kr.co.systemgate.board.vo.MemVO;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping(value="/admin")
	public String selectAllMember(@RequestParam(name = "page", required = false, defaultValue = "1") int page,
				@RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
				@RequestParam(name = "searchOption", required = false, defaultValue = "1") String searchOption, String keyWord, Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("pageSize", pageSize);
		map.put("searchOption", searchOption);
		map.put("keyWord", keyWord);
		map.put("pages", map.get("pages"));
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		try {
			map2 = memberService.selectAllMember(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.debug("map2 {}", map2);
		
		model.addAttribute("page", page);
		model.addAttribute("pages", map2.get("pages"));
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("searchOption", searchOption);
		model.addAttribute("memberList", map2.get("memberList"));
		model.addAttribute("totalCnt", map2.get("totalCnt"));
		model.addAttribute("keyWord", keyWord);
		
		return "/admin/member";
	}
	
	@RequestMapping(path="/admin/selectMember")
	public String selectMember(String mber_id, Model model) {
		
		MemVO memVO = new MemVO();
		try {
			memVO = memberService.selectMember(mber_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("memVO", memVO);
		return "/admin/member/member";
	}
	
	@RequestMapping(path="/admin/deleteMember")
	public String deleteMember(String mber_id) {
		
		try {
			memberService.deleteMember(mber_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:selectAllMember?searchOption=1&keyWord=&page=1";
	}
}
