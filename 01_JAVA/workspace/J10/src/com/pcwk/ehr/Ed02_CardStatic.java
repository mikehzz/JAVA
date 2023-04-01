package com.pcwk.ehr;

public class Ed02_CardStatic {

	public static void main(String[] args) {
		// 클래스 변수(static변수)는 객체 생성없이 사용 가능
		System.out.println("Card.width : "+Card.width+"mm");
		System.out.println("Card.height : "+Card.height+"mm");
		System.out.println("========================================");
		
		// 인스턴스 변수
		Card c01 = new Card();
		c01.kind = "clover";
		c01.number = 2;
		
		System.out.println("c01 : "+c01.kind+c01.number);
		System.out.println("c01 : "+c01.width+"mm, "+c01.height+"mm");
		System.out.println("========================================");
		
		Card c02 = new Card();
		c02.kind = "spade";
		c02.pattern = 'A';
		
		System.out.println("c02 : "+c02.kind+c02.pattern);
		System.out.println("c02 : "+c02.width+"mm, "+c02.height+"mm");
		System.out.println("========================================");
		
		// 클래스 변수 값 변경
		c01.width = 80;
		c01.height = 150;
		System.out.println("c01 : "+c01.width+"mm, "+c01.height+"mm");
		System.out.println("c02 : "+c02.width+"mm, "+c02.height+"mm");
		// 인스턴스 c01를 변경했지만, 클래스 변수를 변경하였으므로 모든 인스턴스가 변경
		// ∴ c02의 클래스 값도 변경됨
		

	}

}
/*
Card.width :100
Card.height :250
========================================
c01 : clover2
c01 : 100mm,250mm
========================================
c02 : spadeA
c02 : 100mm,250mm
========================================
c01 : 80mm,150mm
c02 : 80mm,150mm
*/
