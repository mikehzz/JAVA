package com_pcwk_ehr07;

public class PcwkThreadMain {

	public static void main(String[] args) {
		
		PcwkThread th01 = new PcwkThread();
		th01.start();
		
		for(int i=1;i<=300;i++) {
			System.out.print("-");
		}
		
		
	}

}
