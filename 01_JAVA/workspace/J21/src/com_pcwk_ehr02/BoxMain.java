package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;

public class BoxMain implements pcwLog{

	public static void main(String[] args) {
		Box<String> stringBox = new Box<String>();
		
		stringBox.setContent("즐거운 목요일 점심");
		//int는 담을 수 없다.
		//stringBox.setContent(1);
		
		String content = stringBox.getContent();
		LOG.debug("content : "+content);
		
		Box<Integer> integerBox = new Box<>();
		integerBox.setContent(12);
		
		int intcontent = integerBox.getContent();
		LOG.debug("intcontent : "+intcontent);//숫자 출력
		
		
		
		
	}

}
