package com_pcwk_ehr10;

public class CastingMain {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe01 = new FireEngine();
		
		//자손타입 -> 조상타입(Up-casting) : 형변환 생략가능
		car = fe01;
		
		car.drive();
		//car.water(); 컴파일 오류
		
		//자손타입 <- 조상타입(Down-castiong) : 형변환 생략 불가
		FireEngine fe02=new FireEngine();
		
		fe02 = (FireEngine) car;
		fe02.water();
		
		//형제간 형변환
		Ambulance ab=new Ambulance();
		
		//ab = fe01;
		//Type mismatch: cannot convert from FireEngine to Ambulance
		//형제간 형변환은 안됨
		
		
	}

}
