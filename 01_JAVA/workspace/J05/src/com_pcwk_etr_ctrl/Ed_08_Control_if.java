/**
 * <pre>
 *  Class name : Ed_08_Control_if.java
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
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class Ed_08_Control_if {

	public static void main(String[] args) {
		/*
		 * 화면에서 문자를 하나 입력 받고, 입력받은 문자가 영문자(소문자) 인지 판단!
		 * 영문 소문자
		 * 영문 소문자가 아닙니다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 하나 입력하세요.");	
		String input = scanner.nextLine();
		System.out.printf("input = %s\n", input);
		
		char ch = input.charAt(0);
		System.out.printf("ch=%c\n", ch);
		
		if (ch>='a'&& ch<='z') {
			System.out.println("입력하신 문자는 소문자 입니다.");
		}
		if (!(ch>='a'&& ch<='z')) {
			System.out.println("입력하신 문자는 소문자가 아닙니다.");
		}
		System.out.println("프로그램 종료!");
	

	}
}
