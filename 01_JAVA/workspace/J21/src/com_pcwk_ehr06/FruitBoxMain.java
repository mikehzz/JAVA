package com_pcwk_ehr06;

import com_pcwk_ehr_cmn.pcwLog;

public class FruitBoxMain implements pcwLog {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<Fruit>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		Box<Toy> toyBox = new Box<Toy>();
		toyBox.add(new Toy());
		//appleBox.add(new Apple());
		
		//Type mismatch: cannot convert from Box<Apple> to Box<Grape>
		//Box<Grape> grapeBox = new Box<Apple>
		//appleBox.add(new Toy());
		
		LOG.debug("fruitBox : "+fruitBox);
		LOG.debug("appleBox : "+appleBox);
		LOG.debug("toyBox : "+toyBox);

		
		
		
	}

}
