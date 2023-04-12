package com_pcwk_ehr08;

public class PcwkMain {

	public static void main(String[] args) {
		PcwkRunnable pcwkRun = new PcwkRunnable();
				
				
		new Thread(pcwkRun).start();		
		new Thread(pcwkRun).start();
				
				
				
				
	}
	

}
