package com_pcwk_ehr;
import java.util.Scanner;

public class Ed_05_Switch {

	public static void main(String[] args) {
		// break문을 만날때 까지 위에서 아래로 계속 내려옴
		int score = 100;
		char grade = ' ';
		
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
		case 8:
			grade = 'B';
		case 7:
			grade = 'C';
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
