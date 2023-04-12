package com_pcwk_ehr02;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex01_InetAddress implements pcwLog{

	public static void main(String[] args) {
		InetAddress local = null;
		
		try {
			//InetAddress localhost객체 생성
			local = InetAddress.getLocalHost();
			
			//호스트 이름을 출력
			LOG.debug("호스트 이름:"+local.getHostName());
			
			//호스트 주소 출력
			LOG.debug("호스트 주소 출력 :"+local.getHostAddress());
		} catch (UnknownHostException e) {
			LOG.debug("---------------------------");
			LOG.debug("-UnknownHostException-"+e.getMessage());
			LOG.debug("---------------------------");
		}
		
		
	}

}
