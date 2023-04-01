/**
 * <pre>
 *  Class name : Ed_07_Control_if.java
 *  Description:
 *  Author: hbi
 *  Create date : 2023-03-15
 *  Version : 0.5
 *  Copyright (c) by H.Z.KIM All right reserved.
 *  Modification information
 *    수정일	수정자	수정내용
 *  --------------------------------------------------
 *
 *  --------------------------------------------------
 *  </pre>
 */
package com_pcwk_etr_ctrl;

public class Ed_07_Control_if {

	public static void main(String[] args) {
		// 조건문
		// 특정조건을 만족하면 수행할 작업을 정해놓고
		// 만족할때만 출력

		int age = 23;
		System.out.printf("age>23 \t %b\n", age>20);
		
		if (age>20){
			System.out.println("it 교육을 배운다.");
			System.out.println("프로그램 종료!");
		}
		
		
		
		
		
	}
}