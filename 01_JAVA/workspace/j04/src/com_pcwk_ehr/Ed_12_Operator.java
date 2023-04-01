/**
 * <pre>
 *  Class name : Ed_12_Operator.java
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
public class Ed_12_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = 'a'; //97
		//소문자 'a' ~ 'z'
		for(int i=0;i<26;i++) {
			System.out.print(c++);
		}
		
		System.out.println();
		
		//대문자 'A' ~'Z'
		c = 'A';
		for(int i=0;i<26;i++) {
			System.out.print(c++);
		}
		
		System.out.println();
		
		//숫자 '0' ~ '9'
		c = '0';
		for(int i=0;i<10;i++) {
			System.out.print(c++);
		}
		
		
		
	}

}
