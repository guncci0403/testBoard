package kr.co.systemgate.board.vo;

import java.util.Date;

// 공통분류코드
public class ClCodeVO {
	
	// 분류코드
	private String cl_code;
	
	// 분류코드명
	private String cl_code_nm;
	
	// 분류코드설명
	private String cl_code_dc;
	
	// 사용여부
	private String use_at;
	
	// 최초등록시점
	private Date frst_regist_pnttm;
	
	// 최초등록자ID
	private String frst_register_id;
	
	// 최종수정시점
	private Date last_updt_pnttm;
	
	// 최종수정자ID
	private String last_updusr_id;

	public String getCl_code() {
		return cl_code;
	}

	public void setCl_code(String cl_code) {
		this.cl_code = cl_code;
	}

	public String getCl_code_nm() {
		return cl_code_nm;
	}

	public void setCl_code_nm(String cl_code_nm) {
		this.cl_code_nm = cl_code_nm;
	}

	public String getCl_code_dc() {
		return cl_code_dc;
	}

	public void setCl_code_dc(String cl_code_dc) {
		this.cl_code_dc = cl_code_dc;
	}

	public String getUse_at() {
		return use_at;
	}

	public void setUse_at(String use_at) {
		this.use_at = use_at;
	}

	public Date getFrst_regist_pnttm() {
		return frst_regist_pnttm;
	}

	public void setFrst_regist_pnttm(Date frst_regist_pnttm) {
		this.frst_regist_pnttm = frst_regist_pnttm;
	}

	public String getFrst_register_id() {
		return frst_register_id;
	}

	public void setFrst_register_id(String frst_register_id) {
		this.frst_register_id = frst_register_id;
	}

	public Date getLast_updt_pnttm() {
		return last_updt_pnttm;
	}

	public void setLast_updt_pnttm(Date last_updt_pnttm) {
		this.last_updt_pnttm = last_updt_pnttm;
	}

	public String getLast_updusr_id() {
		return last_updusr_id;
	}

	public void setLast_updusr_id(String last_updusr_id) {
		this.last_updusr_id = last_updusr_id;
	}

	@Override
	public String toString() {
		return "ClCodeVO [cl_code=" + cl_code + ", cl_code_nm=" + cl_code_nm + ", cl_code_dc=" + cl_code_dc
				+ ", use_at=" + use_at + ", frst_regist_pnttm=" + frst_regist_pnttm + ", frst_register_id="
				+ frst_register_id + ", last_updt_pnttm=" + last_updt_pnttm + ", last_updusr_id=" + last_updusr_id
				+ "]";
	}
}
