/**
 * <pre>
 *  Class name : Ed_02_Operator.java
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
public class Ed_02_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//전위, 후위 연산자가 수식에 포함되거나, 메서드의 매개변수로 사용된 경우
		//전위, 후위의 결과는 다르다.
		
		int i = 12;
		int j = 0; 
		j= i++;//i=i+1, i값을  j에 할당 하고 i++
		
		System.out.printf("i++ = %d, j = %d\n", i, j);
		
		//변수에 초기값 할당
		i = 12;
		j = 0;
		
		j = ++i;//i값을 증가 시킨 이후, j에 할당
		System.out.printf("++i = %d, j = %d\n", i, j);
		

	}

}
