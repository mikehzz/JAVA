package com_pcwk_ehr;

import com_pcwk_ehr_cmn.pcwLog;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ed_01_DateTimeMain implements pcwLog {

	public static void main(String[] args) {
		//now(), of()
		
		//현재 날짜와 시간 가져오기;
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		
		LOG.debug("currentDate : "+currentDate);
		LOG.debug("currentTime : "+currentTime);
		LOG.debug("===================");
		
		//특정 날짜와 시간 생성:
		//월에 범위 1~12
		//요일(월요일:1,...,일요일:7)
		LocalDate date = LocalDate.of(2023, 4, 7);
		LocalTime time = LocalTime.of(18, 00);
		LOG.debug("date : "+date);
		LOG.debug("Time : "+time);
		
			
			
	}
}

//[2023-04-04 09:39:11] DEBUG Ed_01_DateTimeMain.main(Ed_01_DateTimeMain.java:16) - currentDate : 2023-04-04
//[2023-04-04 09:39:11] DEBUG Ed_01_DateTimeMain.main(Ed_01_DateTimeMain.java:17) - currentTime : 09:39:10.926
//[2023-04-04 09:39:11] DEBUG Ed_01_DateTimeMain.main(Ed_01_DateTimeMain.java:18) - ===================
//[2023-04-04 09:39:11] DEBUG Ed_01_DateTimeMain.main(Ed_01_DateTimeMain.java:25) - Localdate2023-04-07
//[2023-04-04 09:39:11] DEBUG Ed_01_DateTimeMain.main(Ed_01_DateTimeMain.java:26) - LocalTime18:00