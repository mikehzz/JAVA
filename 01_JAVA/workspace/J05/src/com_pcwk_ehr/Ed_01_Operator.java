/**
 * <pre>
 *  Class name : Ed_01_Operator.java
 *  Description: 논리연산자
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
package com_pcwk_ehr;
import java.util.Scanner;


public class Ed_01_Operator {

	public static void main(String[] args) {
		//console에서 문자 하나를 입력 받는다.
		//숫자, 문자인지 판단
		
		
		Scanner scanner = new Scanner(System.in);
		//scaner method 활용
		
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력 하세요. :");
		String input = scanner.nextLine();
		
		System.out.println("input : " + input);
		
		ch = input.charAt(0);
		System.out.println("ch="+ch);
		
		
		if('0'<=ch && ch<='9') {
			System.out.println("입력 하신 문자는 숫자입니다.");
		}
		
		//소문자 인지 판단 
		if (('a'<=ch && ch<='z')) {
			System.out.println("입력하신 문자는 소문자 입니다.");
		}
		
		//소문자 인지 판단 || 대문자 인지
		if (('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){			
			System.out.println("입력하신 문자는 영문자 입니다.");
		}
					
	}

}
