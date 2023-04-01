package com_pcwk_ehr05;

//Public final class String : final 클레스
public final class FileTest {
	final int MA_SIZE = 10; //멤버에 final이 붙으면 상수가 된다.
	
	final void getMaxSize() {//더이상 오버리이딩 할 수 없다.
		final int MIN_SIZE = 0;
		System.out.println("더이상 오버라이딩 할 수 없다.");
		
	}
	
}
