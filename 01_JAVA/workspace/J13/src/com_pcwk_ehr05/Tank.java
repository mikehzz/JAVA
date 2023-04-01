package com_pcwk_ehr05;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Tank 이동 x=%d, y=%d\n",x,y);
	}
	
	void changeMode() {
		System.out.printf("Tank cangeMode\n");
	}

}
