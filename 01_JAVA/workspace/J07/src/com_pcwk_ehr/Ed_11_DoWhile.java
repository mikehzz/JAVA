package com_pcwk_ehr;

public class Ed_11_DoWhile {

	public static void main(String[] args) {
		int sum =0;//합계
		int i =1;//증가
		
		do {
			System.out.println("i:"+i);
			sum=sum+i; //sum+=1;
			i++;
		}while(i<=100);//do~while 문장 끝에 ':' 주의
		System.out.printf("sum=%d",sum);
	}
	
}
