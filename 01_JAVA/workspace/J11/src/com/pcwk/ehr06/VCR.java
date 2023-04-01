package com.pcwk.ehr06;

public class VCR {
	boolean power;//전원 on/off
	int counter = 0;
	
	void power() {
		System.out.println("전원  on/off");
	}
	
	void play() {
		System.out.println("play");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
	void rew() {
		System.out.println("rew");
	}
	
	void ff() {
		System.out.println("ff");
	}
}
