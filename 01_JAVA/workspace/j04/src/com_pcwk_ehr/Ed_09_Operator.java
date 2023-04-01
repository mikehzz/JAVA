/**
 * <pre>
 *  Class name : Ed_09_Operator.java
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
public class Ed_09_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long x = 1_000_000 * 1_000_000;
		long y = 2_000_000 * 2_000_000L;
		System.out.println("x =" + x); // 오버플로우 발생 
		System.out.println("y =" + y);
		
	}

}