package com_pcwk_ehr08;

public class BoardDTO extends DTO{
	//Capsual화 : 멤버변수는 private,
	//				get/setter 메서드 통해 접근
	
	private int boardId;//보드ID
	private String title;//제목
	private String contents;//내용
	private String regId;//글쓴이
	private String regDate;//작성일
	private int recommend;//추천수
	private int redCnt;//조회
	
	
	//default 생성자
	public BoardDTO() {
		
	}
	
	public BoardDTO(int boardId, String title, String contents, String regId, String regDate, int recommend,
			int redCnt) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.contents = contents;
		this.regId = regId;
		this.regDate = regDate;
		this.recommend = recommend;
		this.redCnt = redCnt;
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

	public int getRedCnt() {
		return redCnt;
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

	public void setRedCnt(int redCnt) {
		this.redCnt = redCnt;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", title=" + title + ", contents=" + contents + ", regId=" + regId
				+ ", regDate=" + regDate + ", recommend=" + recommend + ", redCnt=" + redCnt + "]";
	}
	

	
	
	

	
	
	
	
	
}
