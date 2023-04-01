package com_pcwk_ehr06;

import java.util.*;

import com_pcwk_ehr_cmn.pcwLog;

public class Calendar01Main implements pcwLog{

	public static void main(String[] args) {
		Calendar toDay01 = Calendar.getInstance();//the default time zone
		Calendar toDay02 = Calendar.getInstance();//the default time zone
		
		//싱클톤 여부
		LOG.debug("toDay01:"+toDay01.hashCode());
		LOG.debug("toDay02:"+toDay02.hashCode());
		LOG.debug("=======================");
		
		//로컬시간을 기준으로날짜 출력!
		//toDay02.get(field)
		LOG.debug("년도:"+toDay01.get(Calendar.YEAR));// Calendar.YEAR -> 1 : 상수의 필요 이유
		LOG.debug("월:"+(toDay01.get(Calendar.MONTH)+1));//MONTH의 시작은 0~11(0은 1월달)
		LOG.debug("일"+toDay01.get(Calendar.DATE));
		LOG.debug("============================");
		//요일(1~7) : 1(일요일)
		LOG.debug("요일"+toDay02.get(Calendar.DAY_OF_WEEK));
		
		//오전:0/오후:1
		LOG.debug("오전:0/오후:1=>"+toDay02.get(Calendar.AM_PM));
		
		//시간
		LOG.debug("0~11"+toDay02.get(Calendar.HOUR));
		LOG.debug("0~23"+toDay02.get(Calendar.HOUR_OF_DAY));
		//분
		LOG.debug("분(0~59)"+toDay02.get(Calendar.MINUTE));
		//초
		LOG.debug("초(0~59)"+toDay02.get(Calendar.SECOND));
		//1/1000초
		LOG.debug("1/1000초"+toDay02.get(Calendar.MILLISECOND));
		
	}
}
