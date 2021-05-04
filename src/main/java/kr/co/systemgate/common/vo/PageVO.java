package kr.co.systemgate.common.vo;

public class PageVO {

	
	private int colNo;
	private int page;
	private int pageSize;
	
	
	public PageVO(int colNo, int pageSize) {
		this.colNo = colNo;
		this.pageSize = pageSize;
	}

	
	public int getColNo() {
		return colNo;
	}


	public void setColNo(int colNo) {
		this.colNo = colNo;
	}


	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	@Override
	public String toString() {
		return "PageVO [page=" + page + ", pageSize=" + pageSize + "]";
	}

}
