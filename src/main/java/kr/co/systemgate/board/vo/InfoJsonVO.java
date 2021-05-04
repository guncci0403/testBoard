package kr.co.systemgate.board.vo;

import java.util.List;

// 권한정보
public class InfoJsonVO {
    // 다음의 이름은 jqGrid에 정해진 이름이기에 jqGrid를 사용시 꼭 지켜야 한다.
    private int total; // jqGrid에 표시할 전체 페이지 수
    private int page; // 현재 페이지
    private int records; // 전체 레코드(row)수
    private List<InfoVO> rows; // 목록
    
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	public List<InfoVO> getRows() {
		return rows;
	}
	public void setRows(List<InfoVO> rows) {
		this.rows = rows;
	}

}
