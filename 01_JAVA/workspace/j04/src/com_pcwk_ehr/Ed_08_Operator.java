/**
 * <pre>
 *  Class name : Ed_08_Operator.java
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
public class Ed_08_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1_000_000;
		int y = 2_000_000;
		//int * int -> int
		long c = x * y;// 2_000_000_000_000 나오지 않고 쓰레기 값 발생
		System.out.println(c);
		//System.out.printf("%d * %d = %d\n", x, y, (x*y));
		
		

	}

}