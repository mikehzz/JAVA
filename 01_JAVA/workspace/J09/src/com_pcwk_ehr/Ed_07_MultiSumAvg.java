package com_pcwk_ehr;

public class Ed_07_MultiSumAvg {

	public static void main(String[] args) {
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{40,40,40},
				{60,60,60},
				{90,90,90}
		};
		final int ROW = score.length;
		final int COL = score[0].length;
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		//System.out.printf("ROW:%d\n",ROW);
		//System.out.printf("COL:%d\n",COL);
		
		System.out.println("번호     국어     영어     수학     총점     평균");
		System.out.println("============================");
		for(int i=0;i<ROW;i++) {
			int sum = 0;//개인별 총점
			float avg = 0.0f;
			System.out.printf("%3d", (i+1));////1,2,3,4,5
			for(int j=0;j<COL;j++) {
				sum += score[i][j];
				avg = sum/COL;
				System.out.printf("%5d",score[i][j]);//국어 영어 수학
			}
			System.out.printf("%5d %.1f\n", sum,avg);
		}
		
	
	}

}
