package com_pcwk_ehr;

public class Ed_14_Break {

	public static void main(String[] args) {
		//break문은 자신이 속한 가장 가까운 반복문(1개)를 벗어난다.
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			System.out.printf("i=%d\n",i);
			sum += i;
			i++;
			if(sum>=88) {
				break;
			}
		}
		System.out.printf("sum = %d\n",sum);
		System.out.printf("i = %d\n",i);
		
	}	
	

}
