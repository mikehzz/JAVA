package com_pcwk_ehr08;

public class MemberDTO extends DTO {

	
	private String memberID;//회원ID
	private String name;//이름
	private String passWd;//비밀번호
	private String email;//이메일
	private String cellPhone;//핸드폰
	private String regDate;//등록일
	private String regId;//등록자
		
	public MemberDTO() {
	}

	public MemberDTO(String memberID, String name, String passWd, String email, String cellPhone, String regDate,
			String regId) {
		super();
		this.memberID = memberID;
		this.name = name;
		this.passWd = passWd;
		this.email = email;
		this.cellPhone = cellPhone;
		this.regDate = regDate;
		this.regId = regId;
	}

	
	public String getMemberID() {
		return memberID;
	}

	public String getName() {
		return name;
	}

	public String getPassWd() {
		return passWd;
	}

	public String getEmail() {
		return email;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public String getRegDate() {
		return regDate;
	}

	public String getRegId() {
		return regId;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberID=" + memberID + ", name=" + name + ", passWd=" + passWd + ", email=" + email
				+ ", cellPhone=" + cellPhone + ", regDate=" + regDate + ", regId=" + regId + "]";
	}
	
	
}
