package com.pcwk.ehr;

public class CarMain {

	public static void main(String[] args) {
		Car c01 = new Car(); 
		//default 생성자를 통한 멤버변수 초기화
		c01.color = "white";
		c01.gearType = "Auto";
		c01.door = 4;
		
		Car c02 = new Car("cobaltblue","manual",2);
		//매개변수가 있는 생성자
		
		
		System.out.println("c01의 color : "+c01.color);
		System.out.println("c01의 gearType : "+c01.gearType);
		System.out.println("c01의 door수 : "+c01.door+"개");
		System.out.println();
		System.out.println("c02의 color : "+c02.color);
		System.out.println("c02의 gearType : "+c02.gearType);
		System.out.println("c02의 door수 : "+c02.door+"개");

	}

}
