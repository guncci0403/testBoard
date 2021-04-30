package kr.co.systemgate.board.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.systemgate.board.mapper.MemberMapper;
import kr.co.systemgate.board.vo.MemVO;

@Service("memberService")
public class MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Resource(name="memberMapper")
	private MemberMapper memberMapper;
	
	public Map<String, Object> selectAllMember(Map<String, Object> map) throws Exception{
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("memberList", memberMapper.selectAllMember(map));
		logger.debug("뀨");
		
		int cnt = memberMapper.memberTotalCnt(map);
		
		int pages = (int) Math.ceil((double)cnt/(int) map.get("pageSize"));
		map2.put("pages", pages);
		map2.put("totalCnt", cnt);
		return map2;
	}
	
	public MemVO selectMember(String mber_id) throws Exception{
		return memberMapper.selectMember(mber_id);
	}
	
	public int insertMember(MemVO memVO) throws Exception{
		return memberMapper.insertMember(memVO);
	}
	
	public int updateMember(MemVO memVO) throws Exception{
		return memberMapper.updateMember(memVO);
	}
	
	public int deleteMember(String mber_id) throws Exception{
		return memberMapper.deleteMember(mber_id);
	}
	
}
