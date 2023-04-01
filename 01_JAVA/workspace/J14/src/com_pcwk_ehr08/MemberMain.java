package com_pcwk_ehr08;

public class MemberMain {

	public static void main(String[] args) {
		MemberDTO memberDTO = new MemberDTO("KIM","이상무","1234","procss2696@gmail.com","010-1234-5678","2023/03/28","admin");
		MemberDao memberDao = new MemberDao();
		int flag = memberDao.doSave(memberDTO);
		
	}

}
