package com_pcwk_ehr;

import com_pcwk_ehr_cmn.pcwLog;
import java.time.*;
import java.time.format.*;

public class Ed_03_LocalDatetime implements pcwLog {
	
	public static void main(String[] args) {
		//현재 시간을 가져 온다.
		LocalDateTime now = LocalDateTime.now();
		
		//원하는 형식으로 날짜 시간 출력
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		
		LOG.debug("now : "+now.toString());
		LOG.debug("formattedDateTime :"+formattedDateTime);
		
		LOG.debug("======================================");
		
		//LocalDateTime + 시간대 => ZonedDateTime
		ZoneId asiaSeoul = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = LocalDate.now().atStartOfDay(asiaSeoul);
		
		LOG.debug("asiaSeoul zoneDateTime" + zdt);
		
		//현재 뉴욕 시간
		ZoneId nyid = ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = LocalDate.now().atStartOfDay(nyid);
		LOG.debug("America/New_York ZoneDateTime :" + nyZdt);
			
	}
}
//[2023-04-04 10:32:00] DEBUG Ed_03_LocalDatetime.main(Ed_03_LocalDatetime.java:17) - now : 2023-04-04T10:32:00.188
//[2023-04-04 10:32:00] DEBUG Ed_03_LocalDatetime.main(Ed_03_LocalDatetime.java:18) - formattedDateTime :2023-04-04 10:32:00
//[2023-04-04 10:32:00] DEBUG Ed_03_LocalDatetime.main(Ed_03_LocalDatetime.java:20) - ======================================
//[2023-04-04 10:32:00] DEBUG Ed_03_LocalDatetime.main(Ed_03_LocalDatetime.java:26) - asiaSeoul zoneDateTime2023-04-04T00:00+09:00[Asia/Seoul]
//[2023-04-04 10:32:00] DEBUG Ed_03_LocalDatetime.main(Ed_03_LocalDatetime.java:31) - America/New_York ZoneDateTime :2023-04-04T00:00-04:00[America/New_York]