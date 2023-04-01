package com_pcwk_ehr;
import java.util.Scanner;
public class Ed_07_Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("월을 입력 하세요 :");
		int month = scanner.nextInt();
		System.out.println("month :" + month);
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("해당 월은 31일 입니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("해당 월은 30일 입니다.");
			break;
		case 2:
			System.out.println("해당 월은 28일 입니다.");
			break;
		default :
			System.out.println("1~12의 숫자만을 입력해주세요.");
			break;
		}
	}
}