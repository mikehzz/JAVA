package com.pcwk.ehr;

public class Ed03_ArrayCopy {

	public static void main(String[] args) {
		int [] A = {4,5,6,7,8};
		
		System.out.println("======before======");
		for(int i=0;i<A.length;i++) {
			System.out.printf("A[%d] = %2d%n",i,A[i]);
		}
		
		System.out.println("======after======");
		int []tmp = new int[A.length*2];
		System.out.println("tmp.length = "+tmp.length);
		
		// A -> tmp에 값을 복사한다.
		for(int i=0;i<A.length;i++) {
			tmp[i] = A[i];
		}
		
		A = tmp;
		for(int i=0;i<A.length;i++) {
			System.out.printf("A[%d] = %2d%n",i,A[i]);
		}

	}

}
/*
======before======
A[0] =  4
A[1] =  5
A[2] =  6
A[3] =  7
A[4] =  8
======after======
tmp.length = 10
A[0] =  4
A[1] =  5
A[2] =  6
A[3] =  7
A[4] =  8
A[5] =  0
A[6] =  0
A[7] =  0
A[8] =  0
A[9] =  0
*/