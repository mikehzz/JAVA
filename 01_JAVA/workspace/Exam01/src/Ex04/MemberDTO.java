package Ex04;

import com_pcwk_ehr_cmn.DTO;

public class MemberDTO extends DTO {
	private String memberId;//회원ID
	private String name;//이름
	private String passwd;//비밀번호
	private String email;//이메일
	private String cellPhone;//핸드폰
	private String regDate;//등록일
	private String regId;//등록자
		
	public MemberDTO() {
	}

	public MemberDTO(String memberId, String name, String passwd, String email, String cellPhone, String regDate,
			String regId) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.passwd = passwd;
		this.email = email;
		this.cellPhone = cellPhone;
		this.regDate = regDate;
		this.regId = regId;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public String getPasswd() {
		return passwd;
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

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
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
		return "MemberDTO [memberId=" + memberId + ", name=" + name + ", passwd=" + passwd + ", email=" + email
				+ ", cellPhone=" + cellPhone + ", regDate=" + regDate + ", regId=" + regId + "]";
	}
	
	
	
	
	
	
	
	
}
