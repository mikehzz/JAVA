package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import  java.net.*;
public class Ex02_InetAddress implements pcwLog {
	static final String HOST_NAME = "www.naver.com";
	public static void main(String[] args) {
		//InetAddress생성
		try {
			InetAddress address = InetAddress.getByName(HOST_NAME);
			
			//호스트 이름
			LOG.debug("호스트 이름:"+address.getHostName());
			
			//IP주소 출력
			LOG.debug("IP주소 출력:"+address.getHostAddress());
			
			//모든 IP주소 출력
			InetAddress[] ipArray = InetAddress.getAllByName(HOST_NAME);
			
			for(int i=0;i<ipArray.length;i++) {
				System.out.println(ipArray[i]);
			}
		} catch (UnknownHostException e) {
			LOG.debug("----------------------");
			LOG.debug("-UnknownHostException-"+e.getMessage());
			LOG.debug("----------------------");
		}
		
		
		
		
	}

}
//[2023-04-12 09:48:41] DEBUG Ex02_InetAddress.main(Ex02_InetAddress.java:13) - 호스트 이름:www.naver.com
//[2023-04-12 09:48:41] DEBUG Ex02_InetAddress.main(Ex02_InetAddress.java:16) - IP주소 출력:223.130.195.200
//www.naver.com/223.130.195.200
//www.naver.com/223.130.200.107