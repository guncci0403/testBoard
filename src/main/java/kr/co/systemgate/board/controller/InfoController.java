package kr.co.systemgate.board.controller;

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

import kr.co.systemgate.board.service.InfoService;
import kr.co.systemgate.board.vo.InfoJsonVO;
import kr.co.systemgate.board.vo.InfoVO;
import kr.co.systemgate.common.vo.PageVO;

@Controller
public class InfoController {
	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@Resource(name="infoService")
	private InfoService infoService;
	
	//권한 정보 페이징 처리
	@RequestMapping(path="/selectPagingInfo", method = RequestMethod.GET)
	public String selectPagingInfo(@RequestParam(defaultValue = "1") int colNo, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int pageSize,
			Model model  /*,@ModelAttribute InfoJsonVO infoJsonVO, HttpServletRequest request, HttpServletResponse response */) throws Exception{

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
        
		int startNo = (colNo - 1) * pageSize;
		PageVO pageVO = new PageVO(startNo, pageSize);
		pageVO.setPage(page);
		
		logger.debug("pageVO: {}", pageVO);
		
		Map<String, Object> map = infoService.selectPagingInfo(pageVO);
//		List<InfoVO> list = (List<InfoVO>) map.get("infoList");

		int cnt = (int)map.get("cnt");
		int total = (int)Math.ceil((double)cnt/(double)pageSize);
		
		model.addAttribute("pagination", total);
		model.addAttribute("pageVO", pageVO);
		model.addAttribute("cnt", cnt);
		model.addAttribute("infoList", map.get("infoList"));
		logger.debug("infoList: {}",  map.get("infoList"));
		
//		Map<String, Object> jsonMap = new HashMap<String, Object>();
//		
//		jsonMap.put("total", total);
//		jsonMap.put("page", page);
//		jsonMap.put("records", cnt);
//		jsonMap.put("rows", list);
//		
//		Gson gson = new GsonBuilder().create();
//        String json = gson.toJson(infoJsonVO);
//		
//		model.addAttribute("json", jsonMap);
		return "/info";
	}
	

	
	/**
	 * 동화 선배님 소스 - jqgrid
	 */
//	Map<String, Object> map = new HashMap<String, Object>();
//	//param 재할당
//	EvltTechRvVO techRvVO = new EvltTechRvVO();
//	int outRows = new Integer(rows) != null ? rows : 0;
//	int outPage = new Integer(page) != null ? page : 0;
//	String outSidx = sidx != null ? sidx : "";
//	String outSord = sord != null ? sord : "";
//	if(paramVO != null) {
//		techRvVO = paramVO;
//	}
//	
//	LoginVO loginVO = (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
//	if(loginVO != null) {
//		//로그인 사용자가 사업담당자 일 때 경우 본인 사업만 조회
//		if(EgovProperties.AUTHOR_CODE_사업담당자.equals(loginVO.getAthrCd())) {
//			techRvVO.setAthrCd(loginVO.getAthrCd() != null ? loginVO.getAthrCd() : "");
//			techRvVO.setMberSeq(loginVO.getUniqId() != null ? loginVO.getUniqId() : "");
//		}
//	}
//	
//	techRvVO.setPageUnit(propertyService.getInt("pageUnit"));
//	techRvVO.setPageSize(propertyService.getInt("pageSize"));
//	int resultCount = -1;
//	if(techRvVO != null) {
//		resultCount = techRvService.selectTechRvListCount(techRvVO);
//	}
//	
//	PaginationInfo paginationInfo = new PaginationInfo();
//	paginationInfo.setTotalRecordCount(resultCount);
//	paginationInfo.setCurrentPageNo(outPage);
//	paginationInfo.setRecordCountPerPage(outRows);
//	
//	techRvVO.setRecordCountPerPage(outRows);
//	techRvVO.setFirstIndex(new Integer(paginationInfo.getFirstRecordIndex()) != 0 ? paginationInfo.getFirstRecordIndex() : 0);
//	techRvVO.setLastIndex(new Integer(paginationInfo.getLastRecordIndex()) != 0 ? paginationInfo.getLastRecordIndex() : 0);
//	techRvVO.setSortName(outSidx);
//	techRvVO.setSortMethod(outSord);
//	
//	List<?> resultList = new ArrayList<EvltTechRvVO>();
//	if(techRvVO != null) {
//		resultList = techRvService.selectTechRvList(techRvVO);
//	}
//	
//	map.put("total", paginationInfo.getTotalPageCount());
//	map.put("records", paginationInfo.getTotalRecordCount());
//	map.put("rows",  resultList);
//	map.put("page",  paginationInfo.getCurrentPageNo());
//	
//	ModelAndView modelAndView = new ModelAndView("jsonView",map);
//	
//	return modelAndView;
	
	//권한 정보 페이징 처리
	@RequestMapping(path="/insertInfo", method = RequestMethod.GET)
	public String insertInfo(Model model) throws Exception{
		return "/insertInfo";
	}
	@RequestMapping(path="/insertInfo", method = RequestMethod.POST)
	public String insertInfo(InfoVO infoVO, Model model) throws Exception{
		logger.debug("infoVO : {}", infoVO);
		
		int insertCnt = 0;
		try {
			insertCnt = infoService.insertInfo(infoVO);
		} catch (Exception e) {
			e.printStackTrace();
			insertCnt = 0;
		}
		if (insertCnt == 1) {
			model.addAttribute("msg", "추가 성공!!");
			return "redirect:/selectPagingInfo";
		} else {
			model.addAttribute("msg", "추가 실패!!");
			return "redirect:/insertInfo";
		}
	}

}
