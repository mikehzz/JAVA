package com.pcwk.ehr06;

public class OverloadingMain {

	public static void main(String[] args) {
		MyMath03 m3 = new MyMath03();
		
		System.out.println("m3.add(12, 15) = "+m3.add(12, 15));
		// int / int 인스턴스 메소드 호출
		System.out.println("m3.add(12, 15) = "+m3.add(12, 15L));
		// int / long 인스턴스 메소드 호출
		
		int []a = {14, 18, 20};
		System.out.println("m3.add(a) = "+m3.add(a));
		// add(int []a) 인스턴스 메소드 호출
		
	}

}
/*
m3.add(12, 15) = 27
m3.add(12, 15) = 27
m3.add(a) = 52
*/