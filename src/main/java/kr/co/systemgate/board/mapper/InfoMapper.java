package kr.co.systemgate.board.mapper;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import kr.co.systemgate.board.vo.InfoVO;
import kr.co.systemgate.common.vo.PageVO;

@Mapper("infoMapper")
public interface InfoMapper {
	//test
	public InfoVO selectInfo(InfoVO infoVO) throws Exception;
	//authorinfo 페이징 처리
	public List<InfoVO> selectPagingInfo(PageVO pageVO) throws Exception;
	
	public int selectInfoCnt() throws Exception;
}
