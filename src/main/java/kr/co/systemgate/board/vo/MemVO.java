package kr.co.systemgate.board.vo;

import java.util.Date;

// 회원
public class MemVO {
	
	// 회원일련번호
	private String mber_seq;
	
	// 회원ID
	private String mber_id;
	
	// 비밀번호
	private String pwd;
	
	// 회원명 
	private String mber_nm;
	
	// 회원영문명
	private String mber_eng_nm;
	
	// 생년월일
	private String brn_ymd;
	
	// 성별구분코드
	private String gndr_dsnc_cd;
	
	// 사원코드
	private String empl_cd;
	
	// 회원우편번호
	private String mber_zip;
	
	// 회원주소
	private String mber_adrs;
	
	// 회원상세주소
	private String mber_dtl_adrs;
	
	// 전화번호
	private String tel_no;
	
	// 휴대전화번호
	private String clph_no;
	
	// 회원이메일
	private String mber_eml;
	
	// 가입일시
	private Date join_dt;
	
	// 탈퇴여부
	private String secsn_yn;
	
	// 탈퇴일시
	private Date secsn_dt;
	
	// 등록일시
	private Date rgst_dt;
	
	// 등록자ID
	private String rgst_id;
	
	// 수정일시
	private Date edtr_dt;
	
	// 수정자ID
	private String edtr_id;
	
	// 회원유형코드
	private String mber_ty_cd;
	
	// 이메일수신여부
	private String eml_recv_yn;
	
	// 로그인실패회수
	private int login_fail_cnt;
	
	// 최종로그인일시
	private Date last_login_dt;
	
	// 비밀번호변경일시
	private Date pwd_mdfc_dt;

	public String getMber_seq() {
		return mber_seq;
	}

	public void setMber_seq(String mber_seq) {
		this.mber_seq = mber_seq;
	}

	public String getMber_id() {
		return mber_id;
	}

	public void setMber_id(String mber_id) {
		this.mber_id = mber_id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMber_nm() {
		return mber_nm;
	}

	public void setMber_nm(String mber_nm) {
		this.mber_nm = mber_nm;
	}

	public String getMber_eng_nm() {
		return mber_eng_nm;
	}

	public void setMber_eng_nm(String mber_eng_nm) {
		this.mber_eng_nm = mber_eng_nm;
	}

	public String getBrn_ymd() {
		return brn_ymd;
	}

	public void setBrn_ymd(String brn_ymd) {
		this.brn_ymd = brn_ymd;
	}

	public String getGndr_dsnc_cd() {
		return gndr_dsnc_cd;
	}

	public void setGndr_dsnc_cd(String gndr_dsnc_cd) {
		this.gndr_dsnc_cd = gndr_dsnc_cd;
	}

	public String getEmpl_cd() {
		return empl_cd;
	}

	public void setEmpl_cd(String empl_cd) {
		this.empl_cd = empl_cd;
	}

	public String getMber_zip() {
		return mber_zip;
	}

	public void setMber_zip(String mber_zip) {
		this.mber_zip = mber_zip;
	}

	public String getMber_adrs() {
		return mber_adrs;
	}

	public void setMber_adrs(String mber_adrs) {
		this.mber_adrs = mber_adrs;
	}

	public String getMber_dtl_adrs() {
		return mber_dtl_adrs;
	}

	public void setMber_dtl_adrs(String mber_dtl_adrs) {
		this.mber_dtl_adrs = mber_dtl_adrs;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getClph_no() {
		return clph_no;
	}

	public void setClph_no(String clph_no) {
		this.clph_no = clph_no;
	}

	public String getMber_eml() {
		return mber_eml;
	}

	public void setMber_eml(String mber_eml) {
		this.mber_eml = mber_eml;
	}

	public Date getJoin_dt() {
		return join_dt;
	}

	public void setJoin_dt(Date join_dt) {
		this.join_dt = join_dt;
	}

	public String getSecsn_yn() {
		return secsn_yn;
	}

	public void setSecsn_yn(String secsn_yn) {
		this.secsn_yn = secsn_yn;
	}

	public Date getSecsn_dt() {
		return secsn_dt;
	}

	public void setSecsn_dt(Date secsn_dt) {
		this.secsn_dt = secsn_dt;
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

	public String getMber_ty_cd() {
		return mber_ty_cd;
	}

	public void setMber_ty_cd(String mber_ty_cd) {
		this.mber_ty_cd = mber_ty_cd;
	}

	public String getEml_recv_yn() {
		return eml_recv_yn;
	}

	public void setEml_recv_yn(String eml_recv_yn) {
		this.eml_recv_yn = eml_recv_yn;
	}

	public int getLogin_fail_cnt() {
		return login_fail_cnt;
	}

	public void setLogin_fail_cnt(int login_fail_cnt) {
		this.login_fail_cnt = login_fail_cnt;
	}

	public Date getLast_login_dt() {
		return last_login_dt;
	}

	public void setLast_login_dt(Date last_login_dt) {
		this.last_login_dt = last_login_dt;
	}

	public Date getPwd_mdfc_dt() {
		return pwd_mdfc_dt;
	}

	public void setPwd_mdfc_dt(Date pwd_mdfc_dt) {
		this.pwd_mdfc_dt = pwd_mdfc_dt;
	}

	@Override
	public String toString() {
		return "MemVO [mber_seq=" + mber_seq + ", mber_id=" + mber_id + ", pwd=" + pwd + ", mber_nm=" + mber_nm
				+ ", mber_eng_nm=" + mber_eng_nm + ", brn_ymd=" + brn_ymd + ", gndr_dsnc_cd=" + gndr_dsnc_cd
				+ ", empl_cd=" + empl_cd + ", mber_zip=" + mber_zip + ", mber_adrs=" + mber_adrs + ", mber_dtl_adrs="
				+ mber_dtl_adrs + ", tel_no=" + tel_no + ", clph_no=" + clph_no + ", mber_eml=" + mber_eml
				+ ", join_dt=" + join_dt + ", secsn_yn=" + secsn_yn + ", secsn_dt=" + secsn_dt + ", rgst_dt=" + rgst_dt
				+ ", rgst_id=" + rgst_id + ", edtr_dt=" + edtr_dt + ", edtr_id=" + edtr_id + ", mber_ty_cd="
				+ mber_ty_cd + ", eml_recv_yn=" + eml_recv_yn + ", login_fail_cnt=" + login_fail_cnt
				+ ", last_login_dt=" + last_login_dt + ", pwd_mdfc_dt=" + pwd_mdfc_dt + "]";
	}
	
}
