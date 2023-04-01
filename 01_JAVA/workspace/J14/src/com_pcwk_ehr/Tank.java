package com_pcwk_ehr;

public class Tank extends GroundUnit implements Repairable{
	
	Tank(){
		super(150);//Tank HP 150
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}
