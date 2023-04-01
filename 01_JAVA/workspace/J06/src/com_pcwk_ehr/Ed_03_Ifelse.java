package com_pcwk_ehr;

public class Ed_03_Ifelse {

	public static void main(String[] args) {
		int x = 88;
		int y = 89;
		
		int max = 0;
		
		if(x>y) {
			max=x;
		}else {
			max=y;
		}
		
		System.out.printf("x=%d, y=%d, max=%d\n", x,y,max);
		System.out.println("============삼항 연산자============");
		
		max = (x>y)?x:y;
		System.out.printf("x=%d, y=%d, max=%d\n", x,y,max);
		
		
		
		
		
	}

}
