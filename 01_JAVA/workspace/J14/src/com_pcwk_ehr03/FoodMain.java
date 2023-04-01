package com_pcwk_ehr03;

public class FoodMain {

	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		Person person = new Person(chicken);
		person.startEat();
		
		Pizza pizza = new Pizza();
		Person person02 = new Person(pizza);
		person02.startEat();
		
	}

}
