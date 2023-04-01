package com.pcwk.ehr04;

public class CaptionMain {

	public static void main(String[] args) {
		CaptionTv ctv=new CaptionTv();
		ctv.power();//parent 메서드 전원켜기
		
		ctv.channel = 3;//parent 멤버변수
		ctv.channelUp();
		
		System.out.println("ctv.power:"+ctv.power);
		System.out.println("ctv.power:"+ctv.channel);
		System.out.println("=======================");
		
		ctv.displayCaption("즐거운 목요일 입니다.");
		
		ctv.caption = true;//캡션 켜기
		
		ctv.displayCaption("오늘은 즐거운 목요일 입니다.");
		
		
	}

}
