package com_pcwk_ehr;

public class Ed_02_For {

	public static void main(String[] args) {
		//1~10 홀수의 합 구하기
		int sum = 0;
		for(int i=1;i<=10;i+=2) {
			sum += i;
			System.out.printf("i = %d\n", i);
		}
		System.out.printf("1~10 홀수의 합은 = %d", sum);
	}

}
