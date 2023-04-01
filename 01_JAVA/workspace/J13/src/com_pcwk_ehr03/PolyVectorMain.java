package com_pcwk_ehr03;

import com_pcwk_ehr.*;

public class PolyVectorMain {

	public static void main(String[] args) {
		Buyer buyer=new Buyer();
		
		Tv tv=new Tv();
		Computer com01 = new Computer();
		Computer com02 = new Computer();

		buyer.buy(tv);
		buyer.buy(com01);
		buyer.buy(com02);
		System.out.println("====================");
		buyer.summary();
		System.out.println("====================");
		buyer.refund(tv);
		buyer.summary();
	}
}
//Tv을/를 구매하셨습니다.
//Computer을/를 구매하셨습니다.
//Computer을/를 구매하셨습니다.
//====================
//구입한 물품의 총 금액은 600입니다.
//구입한 제품 목록은 Tv,Computer,Computer입니다.
//====================
//Tv을 반품하셨습니다.
//구입한 물품의 총 금액은 500입니다.
//구입한 제품 목록은 Computer,Computer입니다.