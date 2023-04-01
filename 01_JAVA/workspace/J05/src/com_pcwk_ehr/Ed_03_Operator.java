/**
 * <pre>
 *  Class name : Ed_03_Operator.java
 *  Description:
 *  Author: hbi
 *  Create date : 2023-03-15
 *  Version : 0.5
 *  Copyright (c) by H.Z.KIM All right reserved.
 *  Modification information
 *    수정일	수정자	수정내용
 *  --------------------------------------------------
 *
 *  --------------------------------------------------
 *  </pre>
 */
package com_pcwk_ehr;

public class Ed_03_Operator {

	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		System.out.printf("b = %b\n", b);
		System.out.printf("!b  %b\n", !b);
		System.out.printf("!!b = %b\n", !!b);
		
		System.out.println("=======================");
		System.out.printf("ch = %c", ch);
		
		System.out.printf("ch <'a' || ch > 'z' = %b\n", ch <'a' || ch > 'z');
		System.out.printf("!('a'<=ch && ch >= 'z') = %b\n", !('a'<=ch && ch >= 'z'));
		
		
		
	}

}
