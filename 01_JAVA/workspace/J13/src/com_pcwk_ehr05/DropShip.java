package com_pcwk_ehr05;

public class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Dropship 이동 x=%d, y=%d\n",x,y);
	}
	
	/**
	 * 선택된 unit load
	 */
	void load() {
		System.out.printf("Dropship load !\n");
	}
	
	/**
	 * 선택된 unit unload
	 */
	void unload() {
		System.out.printf("Dropship unload !\n");
	}
}
