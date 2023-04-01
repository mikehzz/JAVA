package com_pcwk_ehr03;

public class Person {
	private Food food;
	
	public Person(Food food) {
		this.food = food;
	}
	
	public void startEat() {
		food.eat();
	}
}
