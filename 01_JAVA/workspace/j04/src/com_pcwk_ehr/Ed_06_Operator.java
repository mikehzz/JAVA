/**
 * <pre>
 *  Class name : Ed_06_Operator.java
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
public class Ed_06_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
		
		byte result = (byte)(x + y);// 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
		System.out.println("result = " + result);
		
		
	}

}