package com_pcwk_ehr;

public class Buyer {//소비자 : 
	int money = 1000;//소비 금액
	int bonusPoint = 10;//보너스 포인트
	public Buyer() {
		
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔고가 부족합니다. 잔고를 확인해 주세요");
			return;
		}
		
		money -= p.price;//가진 돈에서 제품 구입, 소유금액에서 제품 금액 빼기
		p.bonusPoint += p.bonusPoint;//제품의 보너스 포인트 추가
		System.out.println(p+"을/를 구매하셨습니다.");
		
	}
}
