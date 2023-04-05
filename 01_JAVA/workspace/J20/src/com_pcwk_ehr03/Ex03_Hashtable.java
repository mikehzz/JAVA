package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex03_Hashtable implements pcwLog {

	public static void main(String[] args) {
		//Map 객체 생성
		Map<String, Integer > map=new HashMap<>();
		
		
		
		//객체 추가(key, value)
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("five", 5);
		
		//map에 값 출력
		LOG.debug("map:"+map);
		
		//key값으로 값 출력
		LOG.debug(""+map.get("three"));
		
		//key존재 유무 확인
		LOG.debug(""+map.containsKey("five99"));
		
		//삭제
		map.remove("four");
		
		//삭제 이후 map에 값 출력
		LOG.debug("map:"+map);
		
		//모든 요소에 접근
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.printf("key=%s, value=%d",key,value);
		}
	}

}
