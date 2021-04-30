package kr.co.systemgate.board.vo;

import java.util.Date;

// 공통코드
public class CodeVO {
	
	// 코드ID
	private String code_id;
	
	// 분류코드
	private String cl_code;
	
	// 코드ID명
	private String code_id_nm;
	
	// 코드ID설명
	private String code_id_dc;
	
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

	public String getCode_id() {
		return code_id;
	}

	public void setCode_id(String code_id) {
		this.code_id = code_id;
	}

	public String getCl_code() {
		return cl_code;
	}

	public void setCl_code(String cl_code) {
		this.cl_code = cl_code;
	}

	public String getCode_id_nm() {
		return code_id_nm;
	}

	public void setCode_id_nm(String code_id_nm) {
		this.code_id_nm = code_id_nm;
	}

	public String getCode_id_dc() {
		return code_id_dc;
	}

	public void setCode_id_dc(String code_id_dc) {
		this.code_id_dc = code_id_dc;
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
		return "CodeVO [code_id=" + code_id + ", cl_code=" + cl_code + ", code_id_nm=" + code_id_nm + ", code_id_dc="
				+ code_id_dc + ", use_at=" + use_at + ", frst_regist_pnttm=" + frst_regist_pnttm + ", frst_register_id="
				+ frst_register_id + ", last_updt_pnttm=" + last_updt_pnttm + ", last_updusr_id=" + last_updusr_id
				+ "]";
	}
	
}
