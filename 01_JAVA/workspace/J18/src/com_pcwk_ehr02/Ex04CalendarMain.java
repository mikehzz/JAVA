package com_pcwk_ehr02;

import java.util.Calendar;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex04CalendarMain implements pcwLog{

	public static void main(String[] args) {
		//0. 년 월 입력 받기
		int year = 0;
		int month = 0;
		
		try {
		String yearStr = args[0];
		String monthStr = args[1];
		LOG.debug("yearStr :"+yearStr);
		LOG.debug("monthStr :"+monthStr);
		
		year = Integer.valueOf(yearStr);
		month = Integer.parseInt(monthStr);
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			LOG.debug("==================");
			LOG.debug("-파라메터를 입력 하세요.(2023 4)");
			LOG.debug("==================");
			LOG.debug("ArrayIndexOutOfBoundsException :" + e.getMessage());
		}

		//Calendar 객체 생성
		Calendar calendar = Calendar.getInstance();
		
		//년도와 월 설정
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);//Calendar 클래스에서 월은 0부터 시작.
		calendar.set(Calendar.DAY_OF_MONTH, 1);//Calendar 클래스에서 요일은 0부터 시작.

		//LOG.debug(toDateString(calendar));
		
		String[] daysOfWeek = {"일","월","화","수","목","금","토"};
		
		//년월 출력
		System.out.printf("%s\n",toDateString(calendar));
		
		//요일 출력
		for(String dayOfWeek : daysOfWeek) {
			System.out.print(dayOfWeek+"\t");
		}
		
		System.out.println();
		
		//1. 시작 요일
		int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println("firstDayOfWeek:"+firstDayOfWeek);
		
		//첫 주 시작일까지 탭 출력
		for(int i=1;i<firstDayOfWeek;i++) {
			System.out.print("\t");
		}
		//3. 그 달의 마지막일
		//calendar.set
		//calendar.add
		
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//System.out.println("lastDay :"+lastDay);
		
		//날짜 출력
		//1%7 == 0 : Line Skip
		for(int i=1;i<=lastDay;i++) {
			System.out.print(i +"\t");
			
			//토요일 이면 줄 바꿈
			if(firstDayOfWeek % 7 ==0) {
				System.out.println();
			}
			firstDayOfWeek++;
		}
		
		
	}
	
	
	
	
	public static String toDateString(Calendar cal) {
		String ret = "";
		ret = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 ";
		
		
		return ret;
	}

}
