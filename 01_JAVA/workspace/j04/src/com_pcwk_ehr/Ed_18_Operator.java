/**
 * <pre>
 *  Class name : Ed_18_Operator.java
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
public class Ed_18_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float f = 0.1f;
		
		double d = 0.1;
		
		System.out.printf("10.0 == 10.0f \t%b\n", 10.0 == 10.0f);
		//1. 10.0 == 10.0f
		//2. 10.0 == 10.0 -> 2진수로 저장 되므로 오차가 발생한다.
		
		System.out.printf("0.1 == 0.1f \t %b\n", 0.1 == 0.1f);
		System.out.println("------------------------");
		System.out.printf("f=%19.17f\n", f);
		System.out.printf("d=%19.17f\n", d);
		
		
		
		
	}

}
