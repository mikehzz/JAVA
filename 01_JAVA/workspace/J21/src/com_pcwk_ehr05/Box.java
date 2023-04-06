package com_pcwk_ehr05;

import com_pcwk_ehr_cmn.pcwLog;

public class Box<T> implements pcwLog {
	//cannot make a static reference to the non-static type
	//static T content;//내용
	
	private T[] content;//내용
	
	public Box() {
		//cannot create a generic array of T
		//content=new T[10]
	}
	
	
//	public void setContent(T content) {
//		this.content = content;
//	
//		}
//	public T getContent() {
//		return content;
//	}
	
}
