package com.pcwk.ehr02;

public class MyMathMain {

	public static void main(String[] args) {
		MyMath myMath = new MyMath();
		
		long addResult = myMath.add(17, 15);
		long subResult = myMath.substract(19, 7);
		long mulResult = myMath.multiply(12, 5);
		double divResult = myMath.divine(63.0, 9.0);
		
		
		System.out.printf("%d + %d = %d%n",17,15,addResult);
		System.out.printf("%d - %d = %d%n",19,7,subResult);
		System.out.printf("%d * %d = %d%n",12,5,mulResult);
		System.out.printf("%3.1f / %3.1f = %3.1f%n",63.0,9.0,divResult);
		

	}

}
/*
17 + 15 = 32
19 - 7 = 12
12 * 5 = 60
63.0 / 9.0 = 7.0
*/