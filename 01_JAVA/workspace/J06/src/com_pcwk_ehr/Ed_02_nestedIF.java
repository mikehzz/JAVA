package com_pcwk_ehr;
import java.util.Scanner;

public class Ed_02_nestedIF {

	public static void main(String[] args) {
		int score = 98;//점수
		char grade = ' ';//학점
		char option = ' ';//추가
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 :");
		String tmpScore = scanner.nextLine();
		score = Integer.parseInt(tmpScore);
		
		if(score >=90) {
			grade = 'A';
			if(score >=98) {
				option = '+';
			}
		}
		else if(score >=80) {
			grade = 'B';
			if(score >=88) {
				option = '+';
			}
		}
		else if(score >=70) {
			grade = 'C';
			if(score >=78) {
				option = '+';
			}
		}
		else if(score >=60) {
			grade = 'D';
			if(score >=68) {
				option = '+';
			}
		}
		else{
			grade = 'F';
		}
		System.out.printf("점수:%d\n", score);
		System.out.printf("학점:%c%c\n",grade,option);
	}
}
