/**
 * <pre>
 *  Class name : Ed_04_Operator.java
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
public class Ed_04_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.printf("i = %d\n", i);//i=-10
		i = -10;
		i = -i;
		
		System.out.printf("i = %d\n", i);

	}

}