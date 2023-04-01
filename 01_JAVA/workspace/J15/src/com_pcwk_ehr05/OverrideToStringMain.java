package com_pcwk_ehr05;

import java.lang.*;//Default 패키지 : 컴파일러가 자동으로 추가
import java.util.Date;

public class OverrideToStringMain {

	public static void main(String[] args) {
		//toString()오버라이딩한 클래스 :String.Date
		String str = new String("Coffee");
		
		System.out.println(str);
		System.out.println(str.toString());
		
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		System.out.println(today.toString());	
		
	}
}

//Coffee
//Coffee
//Wed Mar 29 14:14:11 KST 2023
//Wed Mar 29 14:14:11 KST 2023