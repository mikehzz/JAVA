package com_pcwk_ehr02;

import com_pcwk_ehr.Product;

public class Buyer {
	int money = 1000;//고객, 소유금액
	int bonusPopint = 0;
	Product[] item = new Product[10];
	int i=0;//Product배열에 사용될 카운터
	/**\
	 * 구매한 제품 요약 정보
	 */
	void summary() {
		int sum = 0;//구입 품목 합계
		String itemList = "";//구입 품목 목록
		
		//구입 품목 합계, 구입 품목 목록
		for(int i=0;i<item.length;i++) {
			if(null == item[i])break;
			
			sum+= item[i].price;//구입 품목 합계
			itemList += item[i].toString()+", ";
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
		
		item[i++] = p;//item배열에 제품 정보 저장
		System.out.println(p+"을/를 구매하셨습니다.");
		
	}

}

