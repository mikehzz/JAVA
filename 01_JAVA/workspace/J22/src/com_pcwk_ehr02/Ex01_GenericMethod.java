package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex01_GenericMethod implements pcwLog {
	
	//Integer, Double, String...배열을 받아 내부 element 모두 출력
	//배열의 출력 일반환
	
	public static <T> T printArrayAll(T[] arr) {
		for(T n : arr) {
			System.out.print(n + ",");
		}
		System.out.println();
		return arr[0];
	}
	
	
	
	
	public static void main(String[] args) {
		Integer[] intArray = {12,14,17,46};
		printArrayAll(intArray);
		
		Double[] doubleArray = {1.0,2.2,3.3,4.4};
		printArrayAll(doubleArray);
		
		String[] stringArray = {"one","two","three","four","five"};
		String strFirst = printArrayAll(stringArray);
		System.out.println("strFirst : "+strFirst);
		
	}

}
