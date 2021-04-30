package kr.co.systemgate.board.vo;

// 권한정보
public class InfoVO {
	
	// 권한코드
	private String author_code;
	
	// 권한명
	private String author_nm;
	
	// 권한설명
	private String author_dc;
	
	// 권한생성일
	private String author_creat_de;

	public String getAuthor_code() {
		return author_code;
	}

	public void setAuthor_code(String author_code) {
		this.author_code = author_code;
	}

	public String getAuthor_nm() {
		return author_nm;
	}

	public void setAuthor_nm(String author_nm) {
		this.author_nm = author_nm;
	}

	public String getAuthor_dc() {
		return author_dc;
	}

	public void setAuthor_dc(String author_dc) {
		this.author_dc = author_dc;
	}

	public String getAuthor_creat_de() {
		return author_creat_de;
	}

	public void setAuthor_creat_de(String author_creat_de) {
		this.author_creat_de = author_creat_de;
	}

	@Override
	public String toString() {
		return "InfoVO [author_code=" + author_code + ", author_nm=" + author_nm + ", author_dc=" + author_dc
				+ ", author_creat_de=" + author_creat_de + "]";
	}
	
}
