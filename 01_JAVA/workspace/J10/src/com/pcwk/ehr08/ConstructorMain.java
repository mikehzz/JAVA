package com.pcwk.ehr08;

public class ConstructorMain {

	public static void main(String[] args) {
		
		Data01 d01 = new Data01();
		
		Data02 d02 = new Data02(1);
		//The constructor Data02() is undefined
		//개발자가 생성자를 하나라도 만들면, 컴파일러가 기본생성자를 만들지 않음
		

	}

}
