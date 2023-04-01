package com_pcwk_ehr04;

public abstract class Player {
	/**
	 * 일시정지
	 */
	boolean pause;
	
	/**
	 * 현재 위치
	 */
	int currentPost;
	
	/**
	 * 추상 메서드 play()
	 * @param pos
	 */
	abstract void play(int pos);
	
	/**
	 * 추상메서드 stop()
	 */
	
	abstract void stop();
	
	/**
	 * 일반메서드 disp()
	 */
	
	void disp() {
		System.out.println("disp()");
	}
	
	
	
	
	
	
}
