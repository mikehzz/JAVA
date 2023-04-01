package com_pcwk_ehr02;

import com_pcwk_ehr.Computer;
import com_pcwk_ehr.Tv;
public class PolyArrayMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buy(new Computer());
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		System.out.println("========================");
		
		buyer.summary();
		
	}

}
