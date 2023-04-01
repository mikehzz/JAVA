package com.pcwk.ehr08;
/**
 * child 클래스
 * @author hbi
 *
 */
public class Child extends Parent{
	/**
	 * child 멤버변수
	 */
	
	int x=20;
	
	/**
	 * child method
	 */
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);//this 는 child
		System.out.println("super.x="+super.x);//super는 Parent
		
	}
}