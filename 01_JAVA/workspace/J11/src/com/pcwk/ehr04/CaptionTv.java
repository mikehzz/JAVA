package com.pcwk.ehr04;

public class CaptionTv	extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption==true) {
			System.out.println(text);
		}
	}
}
