package com_pcwk_ehr02;

public class UserExceptionMain {

	public static void main(String[] args) {
		try {
			ticketing(17);
		} catch (AgeException e) {
			System.out.println("===========");
			System.out.println("AgeException"+e.getMessage());
			System.out.println("===========");
		}
		
	}
	
	public static void ticketing(int age) throws AgeException{
		if(age<18) {
			System.out.printf("나이는 %d 이상이어야 합니다.\n",age);
			throw new AgeException("나이를 확인 하세요"+age);
			
		}
	}
}
