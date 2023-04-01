package com_pcwk_ehr;

public class Ed_06_MultiDim {

	public static void main(String[] args) {
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{40,40,40},
				{60,60,60},
				{90,90,90},	
		};
		
		//5행 3열 배열 index조회
		System.out.printf("score배열의 5행 3열의 값 ->score[4][2] :%d\n",score[4][2]);
		
		//for문으로 조회하기
		int sum = 0;//총점
		System.out.printf("5행의 개수는 %d\n",score.length);//5 행의 개수
		System.out.printf("1행의 열 개수는 %d\n",score[0].length);//1 행의 열 개수
		
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				sum += score[i][j];
			}			
		}
		System.out.println("총점은 \n" + sum);	
		System.out.println("=======향산된 for ==================");
		for(int []tmp : score) {
			for(int i :tmp) {
				System.out.printf("%d \n",i); // tmp는 주소
			}			
		}
	}
}
