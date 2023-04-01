/**
 * <pre>
 *  Class name : Ed_02_Operator.java
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

public class Ed_02_Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int i    =  2;
		
		//논리 곱(&&)은 두 항이 모두 true일 때만 결과가 true
		//앞 하이 false 이면 뒤항이 결과를 실행하지 않는다.
		
		boolean flag = ((i=i+2)<10) && ((num1=num1+10) < 11);
		System.out.println("flag :" + flag);
		System.out.println("num1 = "+num1);
		System.out.println("i:"+i);
		
		
		
	}

}
