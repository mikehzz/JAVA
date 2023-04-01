package com_pcwk_ehr;

public class Ed_08_Array {

	public static void main(String[] args) {
		int [][]score = {
			{100,100,100,100},
			{20,20,20},
			{40,40},
			{60,60,60},
			{90,90,90,90}
		};
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("score[%d][%d]=%d ",i,j,score[i][j]);
			}
			System.out.println();
		}
			
	}

}