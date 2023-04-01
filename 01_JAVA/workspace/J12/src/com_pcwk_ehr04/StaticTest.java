package com_pcwk_ehr04;

public class StaticTest {
	
	// 멤버변수
	static int width = 200;//클래스 변수(공유 변수)
	
	static {
		//static변수의 초기화
	}
	
	//메서드
	static int min(int x, int y) {//클래스 메서드:StaticTest.min(1,2)
		return x<y?x:y;
		
	}
}
