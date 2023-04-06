package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;

public class Box implements pcwLog {
		
	private Object content;//내용
	
	public void setContent(Object content) {
		this.content = content;
	
		}
	public Object getContent() {
		return content;
	}
}
