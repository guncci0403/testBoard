package kr.co.systemgate.board.vo;

import java.util.Date;

// 공통상세코드
public class DeCodeVO {
	
	// 코드
	private String code;
	
	// 코드ID
	private String code_id;
	
	// 코드명
	private String code_nm;
	
	// 코드설명
	private String code_dc;
	
	// 사용여부
	private String use_at;
	
	// 항목값1
	private String item_val1;
	
	// 항목값2
	private String item_val2;
	
	// 최초등록시점
	private Date frst_regist_pnttm;
	
	// 최초등록자ID
	private String frst_register_id;
	
	// 최종수정시점
	private Date last_updt_pnttm;
	
	// 최종수정자ID
	private String last_updusr_id;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode_id() {
		return code_id;
	}

	public void setCode_id(String code_id) {
		this.code_id = code_id;
	}

	public String getCode_nm() {
		return code_nm;
	}

	public void setCode_nm(String code_nm) {
		this.code_nm = code_nm;
	}

	public String getCode_dc() {
		return code_dc;
	}

	public void setCode_dc(String code_dc) {
		this.code_dc = code_dc;
	}

	public String getUse_at() {
		return use_at;
	}

	public void setUse_at(String use_at) {
		this.use_at = use_at;
	}

	public String getItem_val1() {
		return item_val1;
	}

	public void setItem_val1(String item_val1) {
		this.item_val1 = item_val1;
	}

	public String getItem_val2() {
		return item_val2;
	}

	public void setItem_val2(String item_val2) {
		this.item_val2 = item_val2;
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
		return "DeCodeVO [code=" + code + ", code_id=" + code_id + ", code_nm=" + code_nm + ", code_dc=" + code_dc
				+ ", use_at=" + use_at + ", item_val1=" + item_val1 + ", item_val2=" + item_val2
				+ ", frst_regist_pnttm=" + frst_regist_pnttm + ", frst_register_id=" + frst_register_id
				+ ", last_updt_pnttm=" + last_updt_pnttm + ", last_updusr_id=" + last_updusr_id + "]";
	}
	
}
