package kr.co.systemgate.board.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.systemgate.board.mapper.InfoMapper;
import kr.co.systemgate.board.vo.InfoVO;
import kr.co.systemgate.common.vo.PageVO;

@Service("infoService")
public class InfoService {
	private static final Logger logger = LoggerFactory.getLogger(InfoService.class);
	
	@Resource(name="infoMapper")
	private InfoMapper infoMapper;
	
	//권한 정보 페이징 처리
	public Map<String, Object> selectPagingInfo(PageVO pageVO) throws Exception{
		Map<String, Object>map = new HashMap<>();
		map.put("infoList", infoMapper.selectPagingInfo(pageVO));
		map.put("cnt", infoMapper.selectInfoCnt());
		return map;
	}
	
	//권한 정보 등록
	public int insertInfo(InfoVO infoVO) throws Exception{
		return infoMapper.insertInfo(infoVO);
	}
	
	
	
	
	
}
