/**
 * <pre>
 *  Class name : Ed_13_Operator.java
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
public class Ed_13_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ASCII코드의 대소문자 변환
		
		char lowerCase = 'a';
		System.out.printf("%c\n", lowerCase);
		
		char upperCase = (char)(lowerCase-32);
		System.out.printf("%c\n", upperCase);
		
	}

}
