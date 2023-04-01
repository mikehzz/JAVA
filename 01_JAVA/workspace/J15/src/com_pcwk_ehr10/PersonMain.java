package com_pcwk_ehr10;

public class PersonMain {

	public static void main(String[] args) {
		Person p01 = new Person(1234567890);
		Person p02 = new Person(1234567890);
		
		System.out.println(p01.equals(p02));//값을 저장한 주소가 달라서 false
		System.out.println("p01 : " + p01);
		System.out.println("p02 : " + p02);
		
		
	}

}

//false
//p01 : com_pcwk_ehr09.Person@15db9742
//p02 : com_pcwk_ehr09.Person@6d06d69c
