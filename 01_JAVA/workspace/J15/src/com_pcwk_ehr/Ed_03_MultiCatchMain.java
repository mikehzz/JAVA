package com_pcwk_ehr;

public class Ed_03_MultiCatchMain {
	public static void main(String[] args) {
		
		System.out.println("1");
		int intArray[] = {1,2,0,3};
		
		try {
			System.out.println("2");
			System.out.println("= for문 실행 =");
			for(int i=0;i<intArray.length;i++) {
				System.out.println(1/intArray[i]);
			}
				System.out.println("3");
				
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException) {	
				// 0으로 나눗셈시 발생
				System.out.println(e.getMessage());
				System.out.println("4-1");
			} else if(e instanceof ArrayIndexOutOfBoundsException) {
				//	배열인덱스 초과시 발생
				System.out.println(e.getMessage());
				System.out.println("4-2");
			}
			
			
		} finally {
			System.out.println("5 - finally");
			
		}
		
		System.out.println("End");
		
	}
}