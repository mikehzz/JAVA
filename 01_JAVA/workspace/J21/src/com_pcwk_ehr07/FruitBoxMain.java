package com_pcwk_ehr07;

import com_pcwk_ehr_cmn.pcwLog;

public class FruitBoxMain implements pcwLog {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		appleBox.add(new Apple());
		//appleBox.add(new Grape());형제 자매간 관계 없음!
		
		//Toy
		//Bound mismatch: The type Toy is not a valid substitute 
		//for the bounded parameter <T extends Fruit> of the type FruitBox<T>
		//FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		FruitBox<Grape> grapeBox=  new FruitBox<Grape>();
		grapeBox.add(new Grape());
		//grapeBox.add(new Fruit());
		
		LOG.debug("fruitBox : "+fruitBox);
		LOG.debug("appleBox : "+appleBox);
		LOG.debug("grapeBox : "+grapeBox);

	}

}
