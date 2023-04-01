package com_pcwk_ehr08;

import com_pcwk_ehr_cmn.pcwLog;

public class StringBuilderMain implements pcwLog{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		LOG.debug("sb.capacity() : "+sb.capacity());
		
		sb.append("01_java \n");
		sb.append("02_oracle \n");
		sb.append("03_html \n");
		sb.append("03_01_css \n");
		
		
		LOG.debug("sb.capacity() : "+sb.capacity());
		LOG.debug(sb.toString());

	
	}

}
