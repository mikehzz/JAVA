package com_pcwk_ehr03;
import java.io.Serializable;

public class Person implements Serializable{


	private static final long serialVersionUID = 6681108767799760097L;
	private String name; //이름
	private int age; 	 //나이
	
	Person(){}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
