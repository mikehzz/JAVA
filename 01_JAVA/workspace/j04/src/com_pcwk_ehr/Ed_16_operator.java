/**
 * <pre>
 *  Class name : Ed_16_operator.java
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
public class Ed_16_operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//함수 사용 소수 4째 자리에서 반올림
		double pi = 3.141592;
		
		double shortPi = Math.round(pi * 1000)/1000.0;
		//1. (pi * 1000) -> 3141.592
		//2. Math.round(3141.592)/1000.0
		//3. 3142/1000.0 -> 3.142
		
		System.out.println("shortPi :" + shortPi);
		
		
		
		
	}

}
