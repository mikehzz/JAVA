package com_pcwk_ehr09;

public class CaptionTv	extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption==true) {
			System.out.println(text);
		}
	}
}
