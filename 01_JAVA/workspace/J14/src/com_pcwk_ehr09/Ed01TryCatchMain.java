package com_pcwk_ehr09;

public class Ed01TryCatchMain {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		
		try {
			System.out.println("3");
			System.out.println(0/0);
			System.out.println("4");
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 메시지 :" + ae.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("5");
	}

}
//1
//2 
//3
//java.lang.ArithmeticException: / by zero
//	at com_pcwk_ehr09.Ed01TryCatchMain.main(Ed01TryCatchMain.java:11)
//예외 메시지 :/ by zero
//5
