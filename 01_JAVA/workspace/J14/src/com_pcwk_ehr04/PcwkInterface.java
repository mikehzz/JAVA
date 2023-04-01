package com_pcwk_ehr04;

public interface PcwkInterface {
	/**
	 * 일반메소드 처럼 body부분을 생성할 수 있다.
	 */
	default void pcwkMethod01() {
		System.out.println("pcwkMethod01() in PcwkInterface");
	}
	
	default void pcwkMethod02() {
		System.out.println("pcwkMethod02() in PcwkInterface");
	}
	
	static void pcwkStaticMethod() {
		System.out.println("pcwkStaticMethod() in PcwkInterface");
	}
}
