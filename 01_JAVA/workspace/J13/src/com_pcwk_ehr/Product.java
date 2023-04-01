package com_pcwk_ehr;

public class Product {
	public int price;//제품가격
	public int bonusPoint;//제품구매 보너스 포인트
	
	Product(int price){//생성자
		this.price = price;
		//보너스 포인트는 제품가격 10%
		bonusPoint = (int)(price/10.0);
	}
	
	
	
}
