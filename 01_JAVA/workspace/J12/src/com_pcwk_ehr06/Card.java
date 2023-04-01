package com_pcwk_ehr06;

public class Card {
	final int NUMBER; //상수:선언과 동시에 초기화 x
	final String KIND; //상수:선언과 동시에 초기화x
	
	static int width = 120;
	static int height = 140;
	
	Card(int num,String knd){//상수의 값을 생성자에서 초기화 할 수 있다.
		NUMBER = num;
		KIND = knd;
	}
	//alt + shift + s
	public Card() {
		this(9,"heart");
	}
	
	@Override
	public String toString() {
		return KIND+","+NUMBER;
	}
	
	
	
}
