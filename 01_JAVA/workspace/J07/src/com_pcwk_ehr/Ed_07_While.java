package com_pcwk_ehr;

public class Ed_07_While {

	public static void main(String[] args) {
		//1부터 100까지의 합
		
		int i=1;
		int sum=0;
		
		while(i<=100) {
			sum += i;
			System.out.printf("i=%3d \t sum=%d\n", i, sum);
			i++;
		}
		
		System.out.printf("1부터 100까지의 합은 %d 입니다.",sum);
	}
}
