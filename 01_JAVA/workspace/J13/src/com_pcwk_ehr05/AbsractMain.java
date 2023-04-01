package com_pcwk_ehr05;

public class AbsractMain {

	public static void main(String[] args) {
		//Unit 배열로 각각 객체 생성
		
		Unit[] unitArray = new Unit[4];
		unitArray[0] = new Marine();
		unitArray[1] = new Tank();
		unitArray[2] = new DropShip();
		unitArray[3] = new Marine();
		
		//Unit이동
		for(int i=0;i<unitArray.length;i++) {
			unitArray[i].move(100, 180);
			
		}
		
		//모든 자바 클래스의 조상 Object
		Object[] objArray = new Object[4];
		objArray[0] = new Marine();
		objArray[1] = new Tank();
		objArray[2] = new DropShip();
		objArray[3] = new Marine();
		
		for(int i=0;i<objArray.length;i++) {
			Unit u = (Unit) objArray[i];
			u.move(200, 200);
			
		}
		
	}	
		
}
