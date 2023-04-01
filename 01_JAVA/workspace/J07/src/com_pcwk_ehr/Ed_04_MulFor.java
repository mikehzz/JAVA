package com_pcwk_ehr;

public class Ed_04_MulFor {

	public static void main(String[] args) {
		//이중 for문
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("$\t");
			}
			
			System.out.println();
		}
	}
}

//$	
//$	$	
//$	$	$	
//$	$	$	$	
//$	$	$	$	$	