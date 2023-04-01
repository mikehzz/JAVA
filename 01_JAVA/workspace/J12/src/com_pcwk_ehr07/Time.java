package com_pcwk_ehr07;

public class Time {
	private int hour;//시간 0<x<23
	private int minute;//시간 0<x<59
	private int second;//시간 0<x<59

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//setter 시간
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("시간은 0 ~ 24");
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute >59) {
			System.out.println("분은 0~59사이입니다.");
			return;
			}
		
		
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(second<0 || second >59) {
			System.out.println("초은 0~59사이입니다.");
			return;
		}
		this.second = second;
	}
	
	//getter
	
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
