package com_pcwk_ehr06;

public class PcwkRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			//현재 실행 중인 쓰레드의 이름 반환
			System.out.println(Thread.currentThread().getName());
		}
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
