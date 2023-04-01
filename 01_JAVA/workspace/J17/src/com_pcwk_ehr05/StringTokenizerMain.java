package com_pcwk_ehr05;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.StringTokenizer;

public class StringTokenizerMain implements pcwLog {

	public static void main(String[] args) {
		//StringTokenizer는 문자열을 지정된 구분자를 기준을 여러 문자열로 잘라내는데 사용.
		String source = "fe80:6D59:8e5f,360d:27bf7";
		StringTokenizer st = new StringTokenizer(source,";");
		LOG.debug("ORG:"+source);
		while(st.hasMoreTokens()) {
			LOG.debug(st.nextToken());
		}
		
		
		
		
		
		
		
	}

}
