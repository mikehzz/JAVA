package com_pcwk_ehr05;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.StringTokenizer;

public class StringTokenizer02Main implements pcwLog {

	public static void main(String[] args) {
		String source = "x=100*(200+300)/2";
		
		StringTokenizer st = new StringTokenizer(source,"+-*/=()",true);
	
		while(st.hasMoreTokens()) {
			LOG.debug(st.nextToken());
			
		}
	}
}
