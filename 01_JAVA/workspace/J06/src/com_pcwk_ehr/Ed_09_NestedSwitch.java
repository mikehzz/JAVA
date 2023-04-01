package com_pcwk_ehr;

import java.util.Scanner;

public class Ed_09_NestedSwitch {

	public static void main(String[] args) {
		//1. 주민 번호를 입력 받는다.
		//2. 성별 char를 추출한다.
		//3. 중첩 switch문으로 비교한다.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 :");
		String regNo = scanner.nextLine();
		
		char ch = regNo.charAt(7);//charAt(index) 해당 문자열의 index번호에 맞는 char 출력
		System.out.printf("ch=%c\n", ch);
		
		switch (ch) {
		case '1':
		case '3':
			
			switch (ch) {
			case '1':
				System.out.println("당신은 1900~1999년에 태어난 남자 입니다.");
				break;
			case '3':
				System.out.println("당신은 2000~2099년에 태어난 남자 입니다.");
				break;	
			}
			break;
			
		case '2':
		case '4':
			switch (ch) {
			case '2':
				System.out.println("당신은 1900~1999년에 태어난 여자 입니다.");
				break;
			case '4':
				System.out.println("당신은 2000~2099년에 태어난 여자 입니다.");
				break;	
			}
			break;
		default:
			System.out.println("주민 번호를 다시 입력 하세요.");
			break;
		}
	}
}
