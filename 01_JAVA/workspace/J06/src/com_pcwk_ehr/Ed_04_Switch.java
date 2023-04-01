package com_pcwk_ehr;
import java.util.Scanner;

public class Ed_04_Switch {

	public static void main(String[] args) {
		// 1.8 버전의 java는  switch 함수의 문자열이 안됨.
		
		int score = 100;
		char grade = ' ';
		
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			
			break;
		}	
		System.out.printf("점수 : %d\n", score);
		System.out.printf("학점 : %c\n", grade);
			
	}
}





