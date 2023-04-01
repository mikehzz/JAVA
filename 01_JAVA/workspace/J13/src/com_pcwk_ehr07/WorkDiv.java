package com_pcwk_ehr07;
import java.util.Vector;
public interface WorkDiv {
	/**
	 * 목록 조회
	 * @param obj
	 * 
	 */
	public abstract Vector<Object> doRetrive(Object obj);	
	
		
	public abstract int doSave(Object obj);
	
	/**
	 * 수정(public abstract 생략가능)
	 * @param obj
	 * @return int
	 */
	int doUpdate(Object obj);
	
	/**
	 * 삭제
	 * @param obj
	 * @return int
	 */
	int doDelete(Object obj);
	
	
	/**
	 * 단건조회
	 * @param obj
	 * @return Object
	 */
	Object doSelectOne(Object obj);
	
	
}
