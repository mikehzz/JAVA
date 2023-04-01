package com_pcwk_ehr;

//ctrl+shift+o : import 정리
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2Main {
	
	//ctrl+shift+f : 소스정렬
	static final Logger LOG = LogManager.getLogger(Log4j2Main.class);
	
	//문자열의 길이를 알려 준다.
	public static void pcwkLength() {
		String str = "Hello";
		LOG.debug("length():"+str.length());
		
	}
	
	//앞뒤 공백 제거
	public static void pcwkTrim() {
		String str = " Hello World ";
		LOG.debug("trim()"+str.trim());
	}
	
	//지정된 문자열이 포함되어 있는지 검사
	public static void pcwkContains() {
		String str = "abcdefghi";
		LOG.debug(str.contains("hi"));
	}
	
	//문자열을 지정된 문자열로 나누어 배열로 변환
	public static void pcwkSplit() {
		String str = "010-1242-1255";
		String []strArray = str.split("-");
		StringBuilder sb = new StringBuilder();
		for(String strNum : str.split("-")) {
			sb.append(strNum);
		}
		LOG.debug(sb.toString());
	}
	
	public static void main(String[] args) {
		LOG.debug("오늘은 즐거운 금요일~");
		pcwkLength();
		pcwkTrim();
		pcwkContains();
		pcwkSplit();
		
		
		
	}
}
