package com_pcwk_ehr07;

public class SingleThread {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		for(int i=1;i<=500;i++) {
			System.out.print("-");
		
		}
		//경과 시간
		System.out.println("경과시간1:"+(System.currentTimeMillis() - start));
		
		for(int i=1;i<=500;i++) {
			System.out.print("|");
		}
		System.out.println("경과시간2:"+(System.currentTimeMillis() - start));
	}

}
