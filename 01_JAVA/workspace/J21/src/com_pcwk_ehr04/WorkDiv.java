package com_pcwk_ehr04;

import java.util.ArrayList;
import com_pcwk_ehr_cmn.DTO;

public interface WorkDiv<T> {
	
	/**
	 * 목록 조회
	 * @param param
	 * @return ArrayList<T>
	 */
	ArrayList<T> doRetrieve(DTO search);
	
	/**
	 * 저장
	 * @param param
	 * @return int
	 */
	int doSave(T param);
	
	/**
	 * 수정
	 * @param param
	 * @return int
	 */
	int doUpdate(T param);
	
	/**
	 * 삭제
	 * @param param
	 * @return int
	 */
	int doDelete(T param);
	
	/**
	 * 단건조회
	 * @param param
	 * @return T
	 */
	T doSelectOne(T param);

	
}
