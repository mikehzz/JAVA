package com_pcwk_ehr06;

public class InterfaceMain {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
//		instanceof연산자																
//		참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용한다.															
//		주로 조건문에 사용되며, instanceof연산자 왼쪽에 참조변수를 오른쪽에 타입(클래스명)이 피연산자로 온다.															
//		연산결과로 true/false가 나온다.
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit의 자손이다.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable interface를 구현");
		}
		
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable interface를 구현!");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는Moavable interface를 구현");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 자손이다.");
		}
	}

}
