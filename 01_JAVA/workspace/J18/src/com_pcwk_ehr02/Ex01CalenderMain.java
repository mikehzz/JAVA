package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.Calendar;


class Ex01CalenderMain implements pcwLog {

	public Ex01CalenderMain() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//연도, 월, 일, 시, 분, 초
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;//0부터 시작하므로 1을 더함
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		LOG.debug("현재 시간은 "+year+"년 "+month+"월 "+day+"일");
		
		//요일
		String[] daysofweek = {"일","월","화","수","목","금","토"};
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String dayOfWeekString = daysofweek[dayOfWeek-1];
		LOG.debug("오늘은 "+dayOfWeekString+"요일입니다.");		
		
		
	}

}
