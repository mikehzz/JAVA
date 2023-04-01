package com.pcwk.ehr;

public class Card {
	
	String kind; // 카드무늬 (스페이드, 클로버, 하트, 다이아)
	int number; // 카드숫자(2~10)
	char pattern; // 카드무늬(A,J,Q,K)
	
	// 모든 카드가 동일 (공통점)
	static int width	= 100; // 카드 가로길이
	static int height	= 250; // 카드 세로길이

}
