package com.pcwk.ehr;

import java.util.Arrays;
// API : 'Arrays.toString();' 사용하기 위해 설정

public class Ed06_ArrayShuffle {

	public static void main(String[] args) {
		
		int []A = {1,2,3,4,5,6,7,8,9,10};
		// Math.random = 0.0<= x < 1.0
		int rd = 0;
		for(int i=1;i<=10;i++) {
			rd = (int)(Math.random()*10);
			System.out.println(rd);
		}
		System.out.println("===================================");
		// 지정배열요소와 난수로 발생된 랜덤요소를 자리 바꾸기
		System.out.println(Arrays.toString(A));
		for(int i=0;i<=50;i++) {
			int n = (int)(Math.random()*10);
			int empty = 0;
			empty = A[0];
			A[0] = A[n];
			A[n] = empty;
			
			/*
			  1. for문으로 정수 0~9까지의 임의의 수를 int n으로 생성
			  2. empty에 배열 A의 첫번째 값 저장
			  3. 배열 A의 첫번째 값을 배열 A의 n번째 숫자로 저장
			  4. 배열 A의 n번째 숫자에는 다시 empty의 값을 대입
			  5. A.length번까지 반복 or 더 많은 수 반복 (수가 높을수록 섞는 횟수 증가)
			 */
			
		}
		System.out.println(Arrays.toString(A));
		
	}

}
/*
9
4
7
5
8
4
3
1
7
6
===================================
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[7, 8, 6, 1, 10, 9, 5, 2, 4, 3]
*/
