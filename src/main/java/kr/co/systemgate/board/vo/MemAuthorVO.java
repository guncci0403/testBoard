package kr.co.systemgate.board.vo;

import java.util.Date;

// 회원권한
public class MemAuthorVO {
	
	// 회원일련번호
	private String mber_seq;
	
	// 권한코드
	private String author_code;
	
	// 대표권한여부
	private String rprs_author_yn;
	
	// 등록일시
	private Date rgst_dt;
	
	// 등록자ID
	private String rgst_id;
	
	// 수정일시
	private Date edtr_dt;
	
	// 수정자
	private String edtr_id;

	public String getMber_seq() {
		return mber_seq;
	}

	public void setMber_seq(String mber_seq) {
		this.mber_seq = mber_seq;
	}

	public String getAuthor_code() {
		return author_code;
	}

	public void setAuthor_code(String author_code) {
		this.author_code = author_code;
	}

	public String getRprs_author_yn() {
		return rprs_author_yn;
	}

	public void setRprs_author_yn(String rprs_author_yn) {
		this.rprs_author_yn = rprs_author_yn;
	}

	public Date getRgst_dt() {
		return rgst_dt;
	}

	public void setRgst_dt(Date rgst_dt) {
		this.rgst_dt = rgst_dt;
	}

	public String getRgst_id() {
		return rgst_id;
	}

	public void setRgst_id(String rgst_id) {
		this.rgst_id = rgst_id;
	}

	public Date getEdtr_dt() {
		return edtr_dt;
	}

	public void setEdtr_dt(Date edtr_dt) {
		this.edtr_dt = edtr_dt;
	}

	public String getEdtr_id() {
		return edtr_id;
	}

	public void setEdtr_id(String edtr_id) {
		this.edtr_id = edtr_id;
	}

	@Override
	public String toString() {
		return "MemAuthorVO [mber_seq=" + mber_seq + ", author_code=" + author_code + ", rprs_author_yn="
				+ rprs_author_yn + ", rgst_dt=" + rgst_dt + ", rgst_id=" + rgst_id + ", edtr_dt=" + edtr_dt
				+ ", edtr_id=" + edtr_id + "]";
	}
	
}
