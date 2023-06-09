package com_pcwk_ehr02;

import java.util.Calendar;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex03CalendarMain implements pcwLog {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//현재 날짜
		LOG.debug(toDateString(calendar));
		
		//3일 후의 날짜 계산
		calendar.add(Calendar.DATE,3);
		LOG.debug(toDateString(calendar));
		
		//3개월 후의 날짜 계산
		calendar.add(Calendar.MONTH, 3);
		
		//3개월 이전 날짜 계산
		calendar.add(Calendar.MONTH, -5);
		LOG.debug(toDateString(calendar));
		
		//31일 후의  날짜 계산
		calendar.add(Calendar.MONTH, 31);
		LOG.debug(toDateString(calendar));
		
		
	}
	
	public static String toDateString(Calendar cal) {
		String ret = "";
		ret = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일";
		
		
		return ret;
	}
}