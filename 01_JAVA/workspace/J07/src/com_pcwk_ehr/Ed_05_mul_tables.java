package com_pcwk_ehr;

public class Ed_05_mul_tables {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			
			for(int j=1;j<10;j++) {
				System.out.printf("%d단 -> %d * %d = %d\n", i,i,j,i*j);
			}
			System.out.println("============================");
		}
	}
}


//1단 -> 1 * 1 = 1
//1단 -> 1 * 2 = 2
//1단 -> 1 * 3 = 3
//1단 -> 1 * 4 = 4
//1단 -> 1 * 5 = 5
//1단 -> 1 * 6 = 6
//1단 -> 1 * 7 = 7
//1단 -> 1 * 8 = 8
//1단 -> 1 * 9 = 9