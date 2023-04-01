package com_pcwk_ehr08;

import java.util.Vector;

public class MemberDao implements WorkDiv {

	@Override
	public Vector<DTO> doRetrive(DTO obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int doSave(DTO obj) {
		// obj를 받아, Database에 데이터 입력
		MemberDTO inParam = (MemberDTO) obj;
		System.out.println("inParam : "+inParam);
			
		//DB 저장 : JDBC
		return 0;
	}

	@Override
	public int doUpdate(DTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDelete(DTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DTO doSelectOne(DTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
