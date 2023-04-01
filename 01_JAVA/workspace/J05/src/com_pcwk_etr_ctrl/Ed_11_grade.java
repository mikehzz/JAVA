/**
 * <pre>
 *  Class name : Ed_11_grade.java
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

import java.util.Scanner;

public class Ed_11_grade {

	public static void main(String[] args) {
		char grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력 하세요. :");
		
		String grade_score = scanner.nextLine();
		int score = Integer.parseInt(grade_score);
		
		if (score >=90) {
			grade = 'A';
		}
		else if(score >=80) {
			grade = 'B';
		}
		else if(score >=70) {
			grade = 'C';
		}
		else if(score >=60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.printf("당신의 등급은 %c입니다.\n", grade);
		
		
		
	}

}
