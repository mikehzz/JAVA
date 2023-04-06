package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;

public class BoxMain implements pcwLog{

	public static void main(String[] args) {
		Box stringBox = new Box();
		
		stringBox.setContent("즐거운 목요일 점심");
		//int는 담을 수 없다.
		//stringBox.setContent(1);
		
		String content = (String) stringBox.getContent();
		LOG.debug("content : "+content);
		
		Box integerBox = new Box();
		integerBox.setContent(12);
		
		int intcontent = (int) integerBox.getContent();
		LOG.debug("intcontent : "+intcontent);//숫자 출력
		
		
		
		
	}

}
