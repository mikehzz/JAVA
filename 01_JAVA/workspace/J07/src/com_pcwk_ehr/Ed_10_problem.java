package com_pcwk_ehr;

public class Ed_10_problem {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + 5 + (-6) ... ->
		// 몇 까지 더해야 총합이 100이 되는지 구하시오.
		int i = 1;
		int sum = 0;
		while(i<=1000) {
			
			if(i%2==0) {//2의 배수이면 -1을 곱해 양수->음수로 변환
				sum += i*(-1);
			}else {//그 외는 양수
				sum += i;
			}
			if(sum==100) {// 총합이 100이면 끝
				break;
			}
			i++;
		}
		System.out.printf("총합이 %d이 되는 i값은 %d 입니다.\n", sum,i);
	}
}