package com.pcwk.ehr04;

public class FactorialMain {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.printf("result = %d%n",result);

	}
	
	// 4! = 4*3*2*1
	//객체 생성 없이 호출 : static
	static int factorial(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1); // 재귀호출 (메소드 자신을 호출)
		}
		
		
		return result;
	}
// 위와 같은 식을 간략하게 표현	
/*	static int factorial(int n) {
		if(n==1) return 1;{
			
		}
		return n * factorial(n-1);
	}
*/
}
// result = 24