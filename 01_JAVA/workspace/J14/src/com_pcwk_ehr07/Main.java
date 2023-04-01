package com_pcwk_ehr07;

public class Main {

	public static void main(String[] args) {
		//익명 클래스 : 클래스 정의와 객체를 동시에 생성
		//코드를 줄이는 일종의 기법
		//UI이벤트 처리, 스레드 객체, ...
		Animal dog = new Animal() {
			public String bark() {
				return "개가 짖습니다.";
			}
			
			//신규 메서드
			public String run() {
				return "Go-Go";
			}
		};
		
		//익명 클래스 호출
		System.out.println(dog.bark());
		
		//
		//dog.run();//외부에서는 호출 할 수 없다.
	}

}
