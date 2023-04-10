package com_pcwk_ehr08;

public class BoardMain {
	public static void main(String[] args) {
	BoardDTO boardDTO = new BoardDTO(1, "화요일 점심", "카레돈까스", "이상무", "2023/03/28", 0,0);
		
	BoardDao boardDao = new BoardDao();
	int flag = boardDao.doSave(boardDTO);
	
	
	}
}
