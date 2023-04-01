package com_pcwk_ehr_cls;

public class TvMain {

	public static void main(String[] args) {
		Tv tv_1;//Tv 인스턴스를 참조하기 위한 tv_1 변수 선언
		tv_1 = new Tv();// tv_1 인스턴스 생성
		
		System.out.printf("전원 :%b\n",tv_1.power);
		tv_1.power();//전원 on
		System.out.printf("전원 :%b\n",tv_1.power);

		tv_1.channel = 7;//Tv인스턴스 멤버변수 channel에 7을 할당
		
		System.out.println("현재 채널은: "+tv_1.channel);
		
		tv_1.channelDown();
		
		System.out.println("현재 채널은: "+tv_1.channel);
		
		
	}

}
