package com_pcwk_ehr_cls;

public class Tv {
	
	//Tv의 속성
	String color; //색상
	boolean power;//전원
	public int channel; //채널
	
	//Tv의 기능
	void power() {
		power = !power;//전원 on/off
	}
	void channelUp() {//채널 Up
		channel++;
		
	}
	void channelDown() {//채널 down
		channel--;
		
	}
}
