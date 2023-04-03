package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex01_SimpleDateFormat implements pcwLog {

	public static void main(String[] args) {
		Date now = new Date();
		
		//yyyy-mm-dd형식으로 출력
		SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy-MM-dd");
		
		LOG.debug("yyyy.MM.dd : "+sdf01.format(now));
		//HH:mm:ss
		SimpleDateFormat sdf02 = new SimpleDateFormat("HH:mm:ss");
		String formatData02 = sdf02.format(now);
		LOG.debug("HH:mm:ss : "+formatData02);
		
		SimpleDateFormat sdf03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String formatDate03 = sdf03.format(now);
		LOG.debug("yyyy-MM-dd HH:mm:ss.SSS : "+formatDate03);
		
		//오늘은 올 해의 *번째 날
		SimpleDateFormat sdf04 = new SimpleDateFormat("오늘은 올해의 D번째 날");
		LOG.debug("오늘은 올해의 D번째 날 : "+sdf04.format(now));
		
		//오늘은 올 해의 *번째 주
		SimpleDateFormat sdf05 = new SimpleDateFormat("오늘은 올해의 w번째 주");
		LOG.debug("오늘은 올해의 w번째 날 : "+sdf05.format(now));
		
		
	}

}
