package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.Calendar;

public class Ex02CalendarMain implements pcwLog {

	public static void main(String[] args) {
		//Calendar 객체 생성
		Calendar calendar = Calendar.getInstance();
		
		//2022년 11월의 마지막 날짜로
		calendar.set(Calendar.YEAR, 2022);
		calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
		//calendar의 Calendar.Day_Of_Month 최대값 출력
		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(calendar.DAY_OF_MONTH, lastDayOfMonth);
		
		LOG.debug("lastDayOfMonth:"+lastDayOfMonth);
		LOG.debug("calendar:"+calendar.getTime());
		
		LOG.debug("calendar:"+toDateString(calendar));
		
	}
	public static String toDateString(Calendar cal) {
		String ret = "";
		ret = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일";
		
		
		return ret;
	}
	
}
