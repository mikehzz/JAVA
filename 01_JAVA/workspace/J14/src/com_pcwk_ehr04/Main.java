package com_pcwk_ehr04;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.pcwkMethod01();
		child.pcwkMethod02();
		
		PcwkInterface.pcwkStaticMethod();
		PcwkInterface02.pcwkStaticMethod();
	}

}
