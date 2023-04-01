package com.pcwk.ehr;

public class Ed02_Array {

	public static void main(String[] args) {
		int []arr = new int[5];
		
		// int type 초기값 = 0으로 초기화
		System.out.printf("arr[0]=%d%n",arr[0]);
		
		//int []A = new int[] {33,44,55,66,77};
		//int []A = {33,44,55,66,77};
		// 위아래 모두 같은 배열의 초기화 방법 (new int[] 생략가능)
		
		int []A = {33,44,55,66,77};
		
		// A.length는 A의 배열의 길이
		System.out.println("A.length = "+A.length);
		
		// A의 모든 값 확인
		// i값의 조건식을 정수로 표현할 경우 배열의 증감을 반영 못함!
		for(int i=0;i<A.length;i++) {
			System.out.printf("A[%d] = %d%n",i,A[i]);
			
		}
		
		System.out.println("=========================");
		//  A 합계와 평균
		int sum = 0;
		
		for(int i=0;i<A.length;i++) {
			sum += A[i];
		}
		
		System.out.printf("sum = %d%n",sum);
		System.out.printf("평균 = %4.2f%n",(sum/(A.length*1.0)));
		// %4.2f = 4자리중 2자리는 소숫점이하
			
	}

}
/*
arr[0]=0
A.length = 5
A[0] = 33
A[1] = 44
A[2] = 55
A[3] = 66
A[4] = 77
=========================
sum = 275
평균 = 55.00
*/