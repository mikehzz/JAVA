package com_pcwk_ehr03;

import java.io.Serializable;

public class UserDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String name; //이름
	private int age; 	 //나이
	private String password; //비번 : 직열화에서 제외
	
	UserDTO(){}
	
	
	public UserDTO(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	
}
