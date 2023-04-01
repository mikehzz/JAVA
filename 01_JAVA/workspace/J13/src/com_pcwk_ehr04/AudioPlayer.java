package com_pcwk_ehr04;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("AudioPlayer play() pos:"+pos);
	}

	@Override
	void stop() {
		System.out.println("AudioPlayer stop()");
	}

}
