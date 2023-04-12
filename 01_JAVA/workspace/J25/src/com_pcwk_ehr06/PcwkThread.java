package com_pcwk_ehr06;

public class PcwkThread extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			//현재 실행 중인 쓰레드를 이름 변환
			System.out.println(getName());
			
			//쓰레드 멈춤
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}
}
