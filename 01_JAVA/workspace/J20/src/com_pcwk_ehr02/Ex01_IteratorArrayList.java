package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;

public class Ex01_IteratorArrayList implements pcwLog {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("이상무");
		names.add("김수환무");
		names.add("Bob");
		names.add("Charlie");
		
		//ArrayList를 위한 Iterator 생성
		Iterator iterator = names.iterator();
		
		//Iterator를 이용해서 ArrayList순회
		while(iterator.hasNext() == true) {
			//String name = (String) iterator.next();
			//지네릭스
			String name = (String) iterator.next();
			LOG.debug("name :"+name);
		}
	}

}
