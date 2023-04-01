package com.pcwk.ehr02;

public class CarThisMain {

	public static void main(String[] args) {
		Car c01 = new Car();
		Car c02 = new Car("tealgreen");
		
		System.out.println("c01의 color : "+c01.color);
		System.out.println("c01의 gearType : "+c01.gearType);
		System.out.println("c01의 door : "+c01.door+"개");
		System.out.println();
		System.out.println("c02의 color : "+c02.color);
		System.out.println("c02의 gearType : "+c02.gearType);
		System.out.println("c02의 door : "+c02.door+"개");
		// 개별인자 drag > ctrl + c > ctrl + f = 자동으로 변경
		// 꼭 Replace/Find 버튼 사용!!
		

	}

}
