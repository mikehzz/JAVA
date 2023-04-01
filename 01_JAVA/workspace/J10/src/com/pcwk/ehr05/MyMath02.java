package com.pcwk.ehr05;

public class MyMath02 {
	/** 인스턴스 변수 a */
	long a;
	/** 인스턴스 변수 b */
	long b;
	
	//인스턴스 메소드
	/**
	 * 인스턴스 method 덧셈
	 * @return a+b
	 */
	long add() {
		return a+b;
	}
	
	/**
	 * 인스턴스 method 곱셈
	 * @return a*b
	 */
	long multiply() {
		return a*b;
	}
	
	//클래스 메소드
	/**
	 * static 덧셈
	 * @param x
	 * @param y
	 * @return x+y
	 */
	static long add(long x, long y) {
		return x+y;
	}
	
	/**
	 * static 곱셈
	 * @param x
	 * @param y
	 * @return x*y
	 */
	static long multiply(long x, long y) {
		return x*y;
	}

}
