package com.pcwk.ehr;

import java.util.Arrays;

public class Ed09_Array_Frequency {

	public static void main(String[] args) {
		// int []numArray = {4,4,4,7,2,8,2,9,3,8};
		// 숫자의 반복횟수를 출력하세요
		
		int []numArray = {4,4,4,7,2,8,2,9,3,8};
		
		// 빈도수 저장 배열
		int counter[] = new int[10];
		
		//System.out.println(Arrays.toString(numArray));
		
		for(int i=0;i<numArray.length;i++) {
			//System.out.println(numArray[1]);
			counter[numArray[i]]++; 
			//counter[4]++ = {0,0,0,0,1,0,0,0,0,0,0}
			//counter[4]++ = {0,0,0,0,2,0,0,0,0,0,0}
			//counter[4]++ = {0,0,0,0,3,0,0,0,0,0,0}
			//counter[7]++ = {0,0,0,0,3,0,0,1,0,0,0}
			//counter[2]++ = {0,0,1,0,3,0,0,1,0,0,0}
			
		}
		System.out.println(Arrays.toString(counter));
		
		for(int i=0;i<counter.length;i++) {
			System.out.printf("%d의 개수 : %d%n",i,counter[i]);
		}
		
	}

}
