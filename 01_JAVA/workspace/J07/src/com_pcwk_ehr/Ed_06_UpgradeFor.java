package com_pcwk_ehr;

public class Ed_06_UpgradeFor {

	public static void main(String[] args) {
		int []ageArray = {12,14,15,16,27};
		
		//기존 for문
		for(int i=0; i<ageArray.length; i++) {
			System.out.printf("i : %d\n", ageArray[i]);
		}
		
		//향상된 for
		for (int i : ageArray) {
			System.out.printf("i : %d\n", i);
		}
		
		
	}

}
