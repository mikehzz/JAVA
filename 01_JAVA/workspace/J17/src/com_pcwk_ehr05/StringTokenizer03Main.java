package com_pcwk_ehr05;

import java.util.StringTokenizer;

import com_pcwk_ehr_cmn.pcwLog;

public class StringTokenizer03Main implements pcwLog{
	
	public static void main(String[] args) {
		String source = "1,이상무,80,90,95|2,홍길동,80,90,95|3,신사임당,80,90";
		
		StringTokenizer st = new StringTokenizer(source, "|");
		while(st.hasMoreTokens()) {
			//LOG.debug(st.nextToken());
			
			StringTokenizer st02 = new StringTokenizer(st.nextToken(),",");
			while(st02.hasMoreTokens()) {
				LOG.debug(st02.nextToken());
			}
			LOG.debug("===================");
			
		}	
	}
}
