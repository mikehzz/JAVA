/**
 * <pre>
 *  Class name : Ed_10_Park_Cash.java
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


public class Ed_10_Park_Cash {

	public static void main(String[] args) {
		int kidCash = 1000;//취학전 아동 이용료
		int eleCash = 2000;//초등학교 이용료
		int highCash = 2500;//중,고등학교 이용료
		int adultCash = 3000;//성인 이용료
		int charge = 0;// 공원 이용료
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력 하세요. :");
		String tmpAge = scanner.nextLine();
		
		int age = Integer.parseInt(tmpAge);

		if (age < 8) {
			charge=kidCash;
		}
		else if (age < 14) {
			charge=eleCash;
		}
		else if (age < 20) {
			charge=highCash;
		}
		else {
			charge=adultCash;
		}
		System.out.printf("당신의 공원 입장료는 %d원 입니다.", charge);
		
	}

}
