package com_pcwk_ehr08;

import java.util.Vector;

public class BoardDao implements WorkDiv {

	@Override
	public Vector<DTO> doRetrive(DTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSave(DTO obj) {
		// obj를 받아, Database에 데이터 입력
		BoardDTO inParam = (BoardDTO) obj;
		System.out.println("inParam : "+inParam);
		
		//DB 저장 : JDBC
		return 0;
		
	}
	
	@Override
	public int doUpdate(DTO obj) {
		// obj를 받아, database에 데이터 기존 데이터를 수정
		return 0;
	}
	
	@Override
	public int doDelete(DTO obj) {
		// obj를 받아, database에 기존 데이터를 삭제
		return 0;
	}

	@Override
	public DTO doSelectOne(DTO obj) {
		// obj를 받아, database에 기존 데이터를 조회
		return null;
	}

}
