package com_pcwk_ehr07;

public class PcwkThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.print("|");
		}
	}
	
}
