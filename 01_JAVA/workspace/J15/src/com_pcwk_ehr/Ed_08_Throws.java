package com_pcwk_ehr;

public class Ed_08_Throws {
	public static void main(String[] args) {
		try {
			checkAge(5);
		}catch(ArithmeticException e) {
			System.out.println("===============");
			System.out.println(e.getMessage());
			System.out.println("===============");
		}
	}
	static void checkAge(int age) throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("나이는 18세 이상 이어야 합니다.");
		}else {
			System.out.println("사이트에 access 가능 합니다.");
		}
	}
}

//===============
//나이는 18세 이상 이어야 합니다.
//===============