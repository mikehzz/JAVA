package com_pcwk_ehr04;

import com_pcwk_ehr_cmn.DTO;

public class BoardDTO extends DTO {
	private	int boardId;			//보드Id			
	private	String title;			//제목				
	private	String contents;		//내용				
	private	String regId;			//글쓴이				
	private	String regDate;			//작성일				
	private	int  recommend;			//추천				
	private	int  readCnt;			//조회
	
	//default 생성자
	public BoardDTO() {
		
	}
	
	public BoardDTO(int boardId, String title, String contents, String regId, String regDate, int recommend,
			int readCnt) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.contents = contents;
		this.regId = regId;
		this.regDate = regDate;
		this.recommend = recommend;
		this.readCnt = readCnt;
	}
	
	
	//getter
	public int getBoardId() {
		return boardId;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public String getRegId() {
		return regId;
	}

	public String getRegDate() {
		return regDate;
	}

	public int getRecommend() {
		return recommend;
	}

	public int getReadCnt() {
		return readCnt;
	}
	
	//setter
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", title=" + title + ", contents=" + contents + ", regId=" + regId
				+ ", regDate=" + regDate + ", recommend=" + recommend + ", readCnt=" + readCnt + "]";
	}
	
	
	
}
