package com_pcwk_ehr;

public class ProductMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buy(new Computer());
		buyer.buy(new Tv());
		
		//buyer.buy(new Tv());
		
		System.out.println("잔고 :"+buyer.money+"입니다.");
		System.out.println("보너스 포인트는"+buyer.bonusPoint+"입니다.");
		buyer.buy(new Audio());

		System.out.println("잔고 :"+buyer.money+"입니다.");
		System.out.println("보너스 포인트는"+buyer.bonusPoint+"입니다.");
		
		
	}

}
