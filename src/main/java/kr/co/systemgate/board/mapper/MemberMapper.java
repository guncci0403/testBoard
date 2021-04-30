package kr.co.systemgate.board.mapper;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import kr.co.systemgate.board.vo.MemVO;

@Mapper("memberMapper")
public interface MemberMapper {
	
	/**
	 * 조건 별 회원을 조회하는 메서드
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<MemVO> selectAllMember(Map<String, Object> map) throws Exception;
	
	/**
	 * 회원 목록 총 수를 구하는 메서드
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int memberTotalCnt(Map<String, Object> map) throws Exception;
	
	/**
	 * 하나의 회원 정보를 조회하는 메서드
	 * @param mber_id
	 * @return
	 * @throws Exception
	 */
	public MemVO selectMember(String mber_id) throws Exception;
	
	/**
	 * 회원을 등록하기 위한 메서드
	 * @param memVO
	 * @return
	 * @throws Exception
	 */
	public int insertMember(MemVO memVO) throws Exception;
	
	/**
	 * 회원 정보를 수정하기 위한 메서드
	 * @param memVO
	 * @return
	 * @throws Exception
	 */
	public int updateMember(MemVO memVO) throws Exception;
	
	/**
	 * 회원 정보를 삭제하기 위한 메서드
	 * @param mber_id
	 * @return
	 * @throws Exception
	 */
	public int deleteMember(String mber_id) throws Exception;
}
