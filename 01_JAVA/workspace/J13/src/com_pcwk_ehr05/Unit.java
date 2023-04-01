package com_pcwk_ehr05;
//추상클래스
public abstract class Unit {
	int x;//좌표 x
	int y;//좌표 y
	
	/**
	 * unit이동
	 * @param x
	 * @param y
	 */
	abstract void move(int x, int y);
	
	
	void stop() {
		System.out.println("현재 위치에 정지 !");
	}
}