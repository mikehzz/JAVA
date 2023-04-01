package com.pcwk.ehr;

import java.util.Arrays;

public class Ed08_BubbleSort {

	public static void main(String[] args) {
		// 서로 인접한 두 숫자를 비교하여 정렬하는 알고리즘
		// 인접한 2개의 숫자를 비교하여 크기가 순서대로 되어 있지 않다면 서로 교환한다.
		
		int []Line = {8,5,4,9,2};
		
		System.out.println("before sort");
		for(int i=0;i<Line.length;i++) {
			System.out.print(Line[i]+",");
		}
		System.out.println();
		System.out.println("=======================");
		
		//sort
		for(int i=0;i<Line.length;i++) {
			
			for(int j=0;j<Line.length-i-1;j++) {
				if(Line[j]>Line[j+1]) { //앞뒤를 비교하여 앞자리 수가 크면 자리 교환
					// 부등호 방향 > : ASC (작-큰)
					// 부등호 방향 < : DESC (큰-작)
					int tmp = Line[j];
					Line[j] = Line[j+1];
					Line[j+1] = tmp;
				}
			}
			System.out.println(Arrays.toString(Line));
		}
		System.out.println("=======================");
		System.out.println("After sort");
		System.out.println(Arrays.toString(Line));
	}

}
