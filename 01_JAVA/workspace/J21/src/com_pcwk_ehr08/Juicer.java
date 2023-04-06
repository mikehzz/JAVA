package com_pcwk_ehr08;

public class Juicer {
	
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f :box.getList()) {
			tmp+=box.toString()+" ";
			
		}
		return new Juice(tmp);
		
	}
}
