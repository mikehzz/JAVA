package com_pcwk_ehr08;

import com_pcwk_ehr_cmn.pcwLog;

public class FruitBoxMain implements pcwLog {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		LOG.debug(Juicer.makeJuice(fruitBox));
		
		FruitBox<Apple> appleBox=new FruitBox<Apple>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Grape));
		LOG.debug(Juicer.makeJuice(appleBox));
		
	}

}
