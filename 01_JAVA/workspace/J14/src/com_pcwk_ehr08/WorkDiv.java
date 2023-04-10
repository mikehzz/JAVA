package com_pcwk_ehr08;
import java.util.Vector;
public interface WorkDiv {
	/**
	 * 목록 조회
	 * @param obj
	 * 
	 */
	public abstract Vector<DTO> doRetrive(DTO obj);	
	
	public abstract int doSave(DTO obj);
	
	/**
	 * 수정(public abstract 생략가능)
	 * @param obj
	 * @return int
	 */
	int doUpdate(DTO obj);
	
	/**
	 * 삭제
	 * @param obj
	 * @return int
	 */
	int doDelete(DTO obj);
	
	/**
	 * 단건조회
	 * @param obj
	 * @return Object
	 */
	DTO doSelectOne(DTO obj);
	
}
