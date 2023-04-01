package com_pcwk_ehr05;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Marin 이동 x=%d, y=%d\n",x,y);
	}
	void steamPack() {
		System.out.println("steamPack 사용!");
	}
	
	
}
