package com_pcwk_ehr02;

public class Person {
	Chicken chicken;
	
	public Person() {
		this.chicken = new Chicken();
	}
	
	public void startEat() {
		chicken.eat();
		
	}
}
