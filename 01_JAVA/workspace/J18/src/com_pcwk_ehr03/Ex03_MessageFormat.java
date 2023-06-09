package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class Ex03_MessageFormat implements pcwLog {

	public static void main(String[] args) {
		//System.out.printf("%d",a);
		//MessageFormat "{0},{1}",a,b
		
		String pattern = "{0}님,{1, date}에 회의가 예정되어 있습니다. 장소는{2}입니다.";
		Object[] arguments = {"이상무", new Date(),"회의실 402" };
		
		String formattedString = MessageFormat.format(pattern, arguments);
		LOG.debug("formatedString:"+formattedString);
		
		//locale 변경
		Locale.setDefault(Locale.US);
		String formattedStringUS = MessageFormat.format(pattern, arguments);
		LOG.debug("formattedStringUS:"+formattedStringUS);
		
		
		
	}	
}
