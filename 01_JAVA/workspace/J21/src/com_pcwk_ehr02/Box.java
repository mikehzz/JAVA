package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;

public class Box<T> implements pcwLog {
		
	private T content;//내용
	
	public void setContent(T content) {
		this.content = content;
	
		}
	public T getContent() {
		return content;
	}
}
