package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.ArrayList;

public class Ed_01_ArrayList implements pcwLog {

	public static void main(String[] args) {
		//ArrayList생성 : 가변 배열에 데이터 저장
		ArrayList list = new ArrayList(20);
		
		//요소추가 : 순서보장
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		
		//요소 개수 출력
		LOG.debug("요소 개수 :"+list.size());
		
		//요소 출력
		LOG.debug("첫 번째 요소 : "+list.get(0));
		LOG.debug("두 번째 요소 : "+list.get(1));
		LOG.debug("세 번째 요소 : "+list.get(2));
		
		//요소 수정
		list.set(0, "watermelon");
		LOG.debug("첫 번째 요소 : "+list.get(0));

		//요소 삭제
		LOG.debug("요소 삭제 : "+list.remove(2));
		
		//전체 요소
		for(int i=0;i<list.size();i++) {
			LOG.debug(i + " "+list.get(i));
		}
		
		//요소 탐색
		if(list.contains("Banana")) {
			LOG.debug("Banana 이/가 list에 포함되어 있습니다.");
		}else {
			LOG.debug("포함 되어 있지 않습니다.");
		}
		
		
	}
}