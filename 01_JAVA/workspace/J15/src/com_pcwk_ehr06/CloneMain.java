package com_pcwk_ehr06;

public class CloneMain {

	public static void main(String[] args) {
		Pointer p =new Pointer(12,14);
		Pointer p02 = (Pointer) p.clone();
		
		System.out.println("원본 :"+p.toString());
		System.out.println("Copy본 :"+p02.toString());
		System.out.println("=====================");
		
		//copy본 값 변경
		p02.x = 17;
		System.out.println("원본 :"+p.toString());
		System.out.println("Copy본 :"+p02.toString());
		
	}

}
