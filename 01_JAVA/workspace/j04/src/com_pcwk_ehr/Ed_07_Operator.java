/**
 * <pre>
 *  Class name : Ed_07_Operator.java
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
public class Ed_07_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 연산 이후 오버플로
		byte x = 10;
		byte y = 30;
		//byte -128 ~ 127 이므로 오버플로우 발생
		byte result = (byte)(x*y);
		
		System.out.printf("result = %d\n", result);

	}

}
