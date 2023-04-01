package com.pcwk.ehr;

import java.util.Arrays;

public class Ed07_ArrayShuffle_Lotto {

	public static void main(String[] args) {
		// 1~46의 숫자에서 임의의 6개 숫자 추출
		int []Lotto = new int[45];
		
		for(int i=0;i<Lotto.length;i++) {
			Lotto[i]=i+1;
		}
		//System.out.println(Arrays.toString(Lotto));
		
		for(int i=0;i<1994;i++) {
			int N = (int)(Math.random()*45);
			//System.out.println(N);
			int tmp = Lotto[0];
			Lotto[0] = Lotto[N];
			Lotto[N] = tmp;
		}
		System.out.println(Arrays.toString(Lotto));
		
		//앞의 숫자 6개 추출
		for(int i=0;i<6;i++) {
			System.out.printf("ball[%d] = %d%n",i,Lotto[i]);
			
		}
		System.out.println("=======================================");
		// System.arraycopy()
		int []NewArray = new int[6];
		System.arraycopy(Lotto, 0, NewArray, 0, 6);
		
		//sort
		for(int i=0;i<NewArray.length;i++) {	
			for(int j=0;j<NewArray.length-i-1;j++) {
				if(NewArray[j]>NewArray[j+1]) { //앞뒤를 비교하여 앞자리 수가 크면 자리 교환
					// 부등호 방향 > : ASC (작-큰)
					// 부등호 방향 < : DESC (큰-작)
					int tmp = NewArray[j];
					NewArray[j] = NewArray[j+1];
					NewArray[j+1] = tmp;
				}
			}
			System.out.println(Arrays.toString(NewArray));
		
		}

	}// end of main

}// end of class
