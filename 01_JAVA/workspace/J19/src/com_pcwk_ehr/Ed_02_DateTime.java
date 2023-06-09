package com_pcwk_ehr;

import java.time.*;
import com_pcwk_ehr_cmn.pcwLog;

import java.time.temporal.ChronoField;
public class Ed_02_DateTime implements pcwLog {
	
	public static void main(String[] args) {
	
	//현재 날짜와 시간 가져오기
	LocalDate currentDate = LocalDate.now();
	LocalTime currentTime = LocalTime.now();
	
	//java.time 패키지에서는 1월을 1로 표현하여 월의 범위가 1~12가 되었으며,
	//요일은 월요일부터 1로 표현하도록 변경되었다.
	int year = currentDate.getYear();
	int month = currentDate.getMonthValue();//1~12
	int dayofMonth = currentDate.getDayOfMonth();
	
	//월(1) to 일요일(7)
	int dayofWeek = currentDate.get(ChronoField.DAY_OF_WEEK);
	LOG.debug("year : "+year);
	LOG.debug("month : "+month);
	LOG.debug("dayofMonth : "+dayofMonth);
	LOG.debug("dayofweek : "+dayofWeek);
	LOG.debug("===========================");
	
	int hour = currentTime.getHour();
	int minute = currentTime.getMinute();
	int second = currentTime.getSecond();
	int nano = currentTime.getNano();
	
	LOG.debug("hour" +hour );
	LOG.debug("minute"+minute);
	LOG.debug("second"+second);
	LOG.debug("nano"+ nano );
	
	
	}
	
}