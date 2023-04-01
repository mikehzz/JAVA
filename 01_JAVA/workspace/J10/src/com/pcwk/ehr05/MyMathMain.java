package com.pcwk.ehr05;

public class MyMathMain {

	public static void main(String[] args) {
		// 클래스 메소드 호출
		System.out.println("MyMath02.add(12, 14)= "+MyMath02.add(12, 14));
		System.out.println("MyMath02.multiply(12, 15)= "+MyMath02.multiply(12, 15));
		
		// 인스턴스 메소드 호출
		MyMath02 A = new MyMath02();
		A.a = 12;
		A.b = 17;
	
		System.out.println("A.add()= "+A.add());
		System.out.println("A.multiply()= "+A.multiply());

	}

}
