package com_pcwk_ehr04;

import com_pcwk_ehr.Audio;

public class AbstractClassMain {

	public static void main(String[] args) {
		//추상클래스 객체 생성:x
		//Player player = new Player();
		
		Player player = new AudioPlayer();
		
		player.play(12);
		player.disp();
		player.stop();
		
		
	}
}
