package com_pcwk_ehr;

public class DropShip extends AirUnit implements Repairable{
	
	public DropShip() {
		super(125);//Dropship HP 125
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "DropShip";
	}
	
}
