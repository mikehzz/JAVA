/**
 * <pre>
 *  Class name : Ed_15_Operator.java
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
public class Ed_15_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pi = 3.141592;//3.142
		double shortPi = (int)(pi * 1000+0.5)/1000.0;
		
		//1. 3.141592 * 1000 -> 3141.592 + 0.5 -> -> 3142.092
		//2. (int)(3142.092) -> 3142
		//3. 3142 / 1000.0 -> 3.142
		
		System.out.println("shortPi :" + shortPi);
		
		
		
	}

}
