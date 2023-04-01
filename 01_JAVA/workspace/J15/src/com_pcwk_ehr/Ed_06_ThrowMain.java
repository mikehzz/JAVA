package com_pcwk_ehr;

public class Ed_06_ThrowMain {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			Exception ex = new Exception("개발자가 예외 발생 시킨다.");
			if(true) {
				throw ex;
			}
			System.out.println("3");
		}catch(Exception e) {
			System.out.println("4");
			System.out.println(e.getMessage());
		}
		System.out.println("End--------------------------");
	}

}