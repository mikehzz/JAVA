package com_pcwk_ehr;

public class SCV extends GroundUnit implements Repairable{
	public SCV(){
		super(60);//SCV HP 60
		hitPoint = 60;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			
			Unit u = (Unit) r;
			
			while(u.hitPoint != u.MAX_HP) {
				/*Unit의 체력을 증가 시킨다. */
				u.hitPoint++;
				
			}
			System.out.println(u.toString()+" 의 수리가 완료되었습니다.");
		}
		
	}
	
}
