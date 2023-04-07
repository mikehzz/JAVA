package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex01_Enum implements pcwLog {

	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		
		switch(today) {
		case MONDAY:
			LOG.debug("Today is Monday");
			break;
		case TUESDAY:
			LOG.debug("Today is Tuesday");
			break;
		case WEDNESDAY:
			LOG.debug("Today is Wednesday");
			break;
		case THURSDAY:
			LOG.debug("Today is Thursday");
			break;
		case FRIDAY:
			LOG.debug("Today is Friday");
			break;
		case SATURDAY:
			LOG.debug("Today is Saturday");
			break;
		case SUNDAY:
			LOG.debug("Today is Sunday");
			break;	
			
			
		}
	}

}
