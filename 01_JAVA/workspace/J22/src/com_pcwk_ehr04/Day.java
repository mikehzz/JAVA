package com_pcwk_ehr04;

public enum Day {
	MONDAY("한주의 시작"),
	TUESDAY("목요일 2일전"),
	WEDNESDAY("목요일 1일전"),
	THURSDAY("드디어 목요일"),
	FRIDAY("금요일!"),
	SATURDAY("토요일!"),
	SUNDAY("일요일!");
	
	private String description;
	
	Day(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	
	
	
}
