package com_pcwk_ehr;

public class Ed_13_Break {

	public static void main(String[] args) {
		//break문은 자신이 속한 가장 가까운 반복문(1개)를 벗어난다.
		
		int sum = 0;
		int i = 0;
		for(i=1; true;i++) {
			System.out.printf("i = %d\n",i);
			sum += i;
			if(sum>=88) {
				break;
			}
		}
		System.out.printf("sum = %d\n",sum);
		System.out.printf("i = %d\n",i);
		
	}	
	

}
