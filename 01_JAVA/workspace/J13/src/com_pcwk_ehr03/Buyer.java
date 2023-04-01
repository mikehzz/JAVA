package com_pcwk_ehr03;

import java.util.Vector;

import com_pcwk_ehr.Product;

public class Buyer {
	int money = 1000;//고객, 소유금액
	int bonusPoint = 0;
	Vector item = new Vector(10);//변경
	int i=0;//Product배열에 사용될 카운터
	
	/**
	 * 환불 : 고객, 소유금액을 제품 금액 만큼 증가
	 * 보너스 포인트, 제품 금액 10% 빼기
	 */
	
	void refund(Product p) {
		if(item.remove(p) == true) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을 반품하셨습니다.");
		}else {//제거할 제품이 없는 경우
			System.out.println("구입 하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	
	/**\
	 * 구매한 제품 요약 정보
	 */
	void summary() {
		int sum = 0;//구입 품목 합계
		String itemList = "";//구입 품목 목록
		
		//구입 품목 합계, 구입 품목 목록
		for(int i=0;i<item.size();i++) {
			Product p = (Product)item.get(i);
			
			sum+= p.price;//구입 품목 합계
			itemList += (i==0)?""+p:","+p;
					
			//itemList += item[i].toString()+", ";
		}
		
		System.out.printf("구입한 물품의 총 금액은 %d입니다.\n",sum);
		System.out.printf("구입한 제품 목록은 %s입니다.\n", itemList);
		
	}
	
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔고가 부족합니다. 잔고를 확인해 주세요");
			return;
		}
		
		money -= p.price;//가진 돈에서 제품 구입, 소유금액에서 제품 금액 빼기
		p.bonusPoint += p.bonusPoint;//제품의 보너스 포인트 추가
		
		item.add(p);//item vector에 제품 정보 저장
		System.out.println(p+"을/를 구매하셨습니다.");
		
	}

}

