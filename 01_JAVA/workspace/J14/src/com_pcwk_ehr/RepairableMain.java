package com_pcwk_ehr;

public class RepairableMain {

	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();

		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		
		/*ERROR marine은 메소드가 없음. */
		//scv.repair(marine);
		
		
	}

}
