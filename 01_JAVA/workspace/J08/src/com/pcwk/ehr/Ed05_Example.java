package com.pcwk.ehr;

public class Ed05_Example {

	public static void main(String[] args) {
		// 최대값 구하기
		
		int []Score = {79,88,55,100,77};
		
		int max = Score[0];
		int min = Score[0];
		
		for(int i=1;i<Score.length;i++) {
			if(Score[i]>max) {// 두 값을 비교하여 더 큰값을 max값으로 변경
			max = Score[i];
			} else if(Score[i]<min) {// 두 값을 비교하여 더 작은값을 min값으로 변경
				min = Score[i];
			}
		
		}// for end
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
			
	}

}
/*
최대값 : 100
최소값 : 55
*/