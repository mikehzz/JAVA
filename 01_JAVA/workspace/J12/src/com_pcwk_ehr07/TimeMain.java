package com_pcwk_ehr07;

public class TimeMain {

	public static void main(String[] args) {
		Time time = new Time(12,31,35);
		
		//time.hour=24;
		System.out.println(time.toString());
		
		//setter -값
		//불필요한 값이 안들어오게 만들 수 있다.
		time.setHour(-1);
		time.setMinute(-1);
		time.setSecond(-1);
		
		System.out.println(time);
		
		
	}

}
