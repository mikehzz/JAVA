package com_pcwk_ehr;

//scanner클래스를 사용하겠다.
import java.util.Scanner;


public class Ed_08_scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 두자리를 입력하세요.>");
		//입력을 문자로 입력 받음
		String input = scanner.nextLine();
		
		System.out.printf("input : %s\n", input);
		
		Integer.parseInt(input);
		
		//문자열을 숫자로 변환
		
		int num = Integer.parseInt(input);
		
		//숫자로 변환된 값을 출력
		
		System.out.printf("num : %d\n", num);
		
	}

}
