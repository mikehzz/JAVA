package com.pcwk.ehr;

public class Car {
	
	String color;		//색상
	String gearType;	//변속기 종류 (Auto/Manual)
	int door;			//차량 문 개수
	

	public Car() { 		//Default 생성자
		
	}
	
	public Car (String c, String g, int d) { //매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}

}
