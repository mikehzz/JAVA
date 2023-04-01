package com_pcwk_ehr11;

import com_pcwk_ehr10.Car;
import com_pcwk_ehr10.FireEngine;

public class InstanceofMain {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This(fe) is a FireEngine instance");
			
		}
		
		// fe Car로 캐스팅가능한지
		System.out.println("fe instanceof Car:"+(fe instanceof Car));
		if(fe instanceof Car) {
			System.out.println("This(fe) is a Car instance");
		}
		
		//Fe Object로 캐스팅 가능한지
		if(fe instanceof Object) {
			System.out.println("This(fe) is a Object instance");
		}
		
		
	}
}