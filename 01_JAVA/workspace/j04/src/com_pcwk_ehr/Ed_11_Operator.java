/**
 * <pre>
 *  Class name : Ed_11_Operator.java
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
public class Ed_11_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c01 = 'a'; //a의 ASCII코드 97
		char c02 = c01; //c02에 c01 할당
		char c03 = ' '; //공백으로 초기화
		
		int i = c01 + 1; //'a' + 1 -> 97 + 1 ->98
		c02++;
		
		c03 = (char)(c01 + 2);
		System.out.printf("%c + %d = %d\n", c01, 1, i);
		System.out.printf("c02 = %c\n", c02);
		System.out.printf("c03 = %c\n", c03);
		
	}

}
