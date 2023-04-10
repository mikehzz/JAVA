package Ex04;
import java.util.ArrayList;

import com_pcwk_ehr_cmn.DTO;
import com_pcwk_ehr_cmn.pcwLog;
public interface WorkDiv<T> extends pcwLog{
	/**
	 * 목록 조회
	 * @param param
	 * @return Arraylist<T>
	 */
	ArrayList<T> doRetrive(DTO search);	
	
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
