/**
 * <pre>
 *  Class name : Ed_19_Operator.java
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
public class Ed_19_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
		
		System.out.println("=======================");
		
		System.out.println("abc" == "abc");//true
		System.out.println(str1 == "abc");//true
		System.out.println(str2 == "abc");//주소가 달라서 false 
		
		System.out.println("=======================");
		
		System.out.println(str1.equals("abc"));//true
		System.out.println(str2.equals("abc"));//true
		
		
		
	}

}