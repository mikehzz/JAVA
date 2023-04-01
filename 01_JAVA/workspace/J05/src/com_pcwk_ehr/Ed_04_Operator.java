/**
 * <pre>
 *  Class name : Ed_04_Operator.java
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

public class Ed_04_Operator {

	
	public static void main(String[] args) {
		//조건?식1 :식2'
		
		int fatherAge = 58;
		int motherAge = 57;
		
		char ch = ' ';
		
		ch = (fatherAge > motherAge)?'T' :'F';
		System.out.println("ch = " + ch);
		
		
		
	}

}
