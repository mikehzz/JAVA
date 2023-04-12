package com_pcwk_ehr06;

public class PcwkThreadMain {

	public static void main(String[] args) {
		//Thread를 상속받은 클래스 생성
		PcwkThread threadClass = new PcwkThread();
		//Runnable 인터페이스를 구현
		Thread runnableInter = new Thread(new PcwkRunnable());
		
		threadClass.start();
		runnableInter.start();
		
		
	}

}
