/**
 * <pre>
 *  Class name : Ed_17_Operator.java
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
public class Ed_17_Operator {
	public static void main(String[] args) {
		// \t는 스페이스 4번
		
		System.out.printf("10 == 10.0f\t%b\n", 10==10.0f);
		//1. 10 == 10.0f
		//2. 10.0f == 10.0f
		
		System.out.printf("'0'== 0	\t%b\n", '0'==0);
		//1. '0' == 0
		//2. 48 == 0 -> false
		
		System.out.printf("'A'== 65\t%b\n", 'A'==65);
		//'A' == 65 -> 65 == 65 --> true
		
		System.out.printf("'A' > 'B'\t%b\n", 'A' > 'B');
		//'A' > 'B' -> 65 > 66 -> false
		
		System.out.printf("'A' + 1 != 'B'\t%b\n", 'A'+1 !='B');
		//1. 'A' + 1 != 'B'
		//2. 65 + 1 ! = 66
		//3. 66 != 66
		
		
	}
}
