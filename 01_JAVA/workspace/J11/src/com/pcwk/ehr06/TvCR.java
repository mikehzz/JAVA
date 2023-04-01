package com.pcwk.ehr06;

public class TvCR extends Tv{
	
	VCR vcr = new VCR();//포함 관계(has a)
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
