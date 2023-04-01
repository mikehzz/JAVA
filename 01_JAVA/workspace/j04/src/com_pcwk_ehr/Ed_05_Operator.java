/**
 * <pre>
 *  Class name : Ed_05_Operator.java
 *  Description: 사칙연산 예제 입니다.
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
public class Ed_05_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 4;
		
		System.out.printf("%d + %d = %d\n", x, y, (x+y));
		System.out.printf("%d - %d = %d\n", x, y, (x-y));
		System.out.printf("%d * %d = %d\n", x, y, (x*y));
		System.out.printf("%.0f / %d = %.1f\n", (float)x, y, (float)x/y);
		//int / float -> float / float -> float
		
		// 0으로 나누기
		// Error
		// System.out.println(x/0);
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
			at com_pcwk_ehr.Ed_05_Operator.main(Ed_05_Operator.java:38)
		 */
		System.out.println(x/0.0);
		
		
		
	}
}
