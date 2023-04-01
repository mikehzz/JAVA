package com_pcwk_ehr;
import java.util.Scanner;
public class Ed_06_Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("월을 입력 하세요 :");
		int month = scanner.nextInt();
		System.out.println("month :" + month);
		
		switch (month) {
		case 3:case 4:case 5://if(month.equals(3)||month.equals(4)||month.equals(5)
			System.out.println("봄입니다");
			break;
		case 6:case 7:case 8:
			System.out.println("여름입니다");
			break;
		case 9:case 10:case 11:
			System.out.println("가을입니다");
			break;
		case 12:case 1:case 2:
			System.out.println("겨울입니다");
			break;
		default :
			System.out.println("1~12의 숫자만을 입력해주세요.");
			break;
		}
	}
}