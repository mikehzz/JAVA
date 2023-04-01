package com.pcwk.ehr;

import java.util.Arrays;

public class Ed04_System_ArrayCopy {

	public static void main(String[] args) {
		int A[] = {2,3,5,7,11};
		int B[] = {13,17,19,23,29};
		
		// A배열에 들어 있는 값
		for(int i=0;i<A.length;i++) {
			System.out.printf("A[%d] = %d%n",i,A[i]);
		}
		System.out.println("===============================");
		// API를 통한 배열요소 전체출력
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println("===============================");
		
		System.arraycopy(A, 0, B, 0, B.length);
		System.out.println("B = "+Arrays.toString(B));
		System.out.println("===============================");
		
		// 5,7,11 copy
		//System.arraycopy(A, 2, B, 2, 3);
		//System.out.println("B = "+Arrays.toString(B)); 
		//B = [13, 17, 5, 7, 11]
		
		
		
	}

}
/*
A[0] = 2
A[1] = 3
A[2] = 5
A[3] = 7
A[4] = 11
===============================
[2, 3, 5, 7, 11]
[13, 17, 19, 23, 29]
===============================
B = [2, 3, 5, 7, 11]
===============================
*/