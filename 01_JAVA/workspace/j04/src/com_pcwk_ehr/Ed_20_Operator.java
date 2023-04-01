/**
 * <pre>
 *  Class name : Ed_20_Operator.java
 *  Description:
 *  Author: hbi
 *  Create date : 2023-03-14
 *  Version : 0.5
 *  Copyright (c) by H.R.KIM All right reserved.
 *  Modification information
 *    수정일	수정자	수정내용
 *  --------------------------------------------------
 *
 *  --------------------------------------------------
 *  </pre>
 */
package com_pcwk_ehr;

/**
 * @author hbi
 *
 */
public class Ed_20_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 0;
		char ch = ' ';
		
		//x는 10보다 크고 20보다 작다
		x = 9;
		//x 10<x %% x<20 = true
		System.out.printf("x=%2d, 10<x && x<20 = %b\n", x, (10<x && x<20));
		
		x = 6;
		//x는 2의 배수 또는 3의 배수
		System.out.printf("x=%-3d, (x%%2==0)&&(x%%3==0) = %b\n", x, (x%2==0)&&(x%3==0));
		
		//문자 ch는 숫자('0' ~'9')
		ch = '2';
		System.out.printf("ch = '%c', ch<=9 && ch>=0 %b",ch, (ch<=9 && ch>=0));	
	}
}
