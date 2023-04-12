package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.net.*;

public class Ex03_URL implements pcwLog {
	
	static final String acorn = "https://www.acorncampus.co.kr/business/it-job-training.jsp?seq=214";
	public static void main(String[] args) {
		
		try {
			//URL객체 생성
			URL url = new URL(acorn);
			
			//호스트명과 포트
			System.out.println("호스트명과 포트:"+url.getAuthority());
			
			//프로토콜
			System.out.println("프로토콜:"+url.getProtocol());
			
			//쿼리
			System.out.println("쿼리:"+url.getQuery());
			
			//전체
			System.out.println("URL전체:"+url.toURI());
		} catch (MalformedURLException e) {
			LOG.debug("===================");
			LOG.debug("=MalformedURLException"+e.getMessage());
			LOG.debug("===================");
		} catch (URISyntaxException e) {
			LOG.debug("===================");
			LOG.debug("=URISyntaxException"+e.getMessage());
			LOG.debug("===================");
		}

	}

}
//호스트명과 포트:www.acorncampus.co.kr
//프로토콜:https
//쿼리:seq=214
//URL전체:https://www.acorncampus.co.kr/business/it-job-training.jsp?seq=214