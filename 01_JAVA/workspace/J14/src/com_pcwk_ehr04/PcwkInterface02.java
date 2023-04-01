package com_pcwk_ehr04;

public interface PcwkInterface02 {
	
	default void pcwkMethod01() {
		System.out.println("pcwkMethod01() in PcwkInterface");
	}
	static void pcwkStaticMethod() {
		System.out.println("pcwkStaticMethod() in PcwkInterface02");
	}
}
