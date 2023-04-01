package com_pcwk_ehr;

public class Ed_09_problem {

	public static void main(String[] args) {
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
		//for문
		int sum = 0;
		for(int i=1;i<=20;i++) {
			if (!(i%2 == 0||i%3 == 0)) {// !(2또는 3의 배수)
				System.out.printf("%d\n", i);
				sum +=i;
			}
		}
		System.out.printf("정답은 : %d\n", sum);
		
		
		//while문
		int i = 1;
		sum=0;
		while(i <= 20) {
			if (!(i%2 == 0||i%3 == 0)) {
				System.out.printf("%d\n", i);
				sum +=i;
			}
			i++;
		}
		System.out.printf("정답은 : %d\n", sum);	
	}
}

