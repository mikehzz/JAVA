package com.pcwk.ehr;

public class Tv {
	
	// Tv의 속성
	String color ; //색상
	boolean power; //전원
	public int channel; //채널
	
	// Tv의 기능
	void power() {
		power = !power; // 전원 on/off
	}
	
	void channelUp() {
		channel++; // 채널 위로 이동
	}
	
	void channelDown() {
		channel--; // 채널 아래로 이동
	}

}
