/**
 * <pre>
 *  Class name : Ed_14_Operator.java
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
public class Ed_14_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float pi = 3.141592f;// 3.141

		//int/int = int
		float shortPi = (int)(pi * 1000)/1000f;
		System.out.println("shortPi :" + shortPi);
		//1. 3.141592 * 1000 -> 3141.592
		//2. (int)3141.592 -> 33141
		//3. 3141/1000f -> 3.141f
		
		//%.3f -> 소수점 3자리 반올림 format
		System.out.printf("소수점 3자리 반올림 pi = %.3f", pi);
		
		
		
		
	}

}
