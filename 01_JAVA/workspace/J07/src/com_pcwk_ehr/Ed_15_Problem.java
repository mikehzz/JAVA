package com_pcwk_ehr;

public class Ed_15_Problem {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+ ... +(1+2+3+4+...+10)의 결과는?
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<=i;j++) {
				sum +=j;
				System.out.printf("j = %d\n",j);
			}
			
		}
		System.out.printf("총합은 %d 입니다.",sum);
	}	
}