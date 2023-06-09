package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;

public class Ex02_IteratorArrayVector implements pcwLog {

	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		names.add("Alice");
		names.add("이상무");
		names.add("김수환무");
		names.add("Bob");
		names.add("Charlie");
		
		//Vector를 위한 Enumeration 생성
		Enumeration<String> enumeration = names.elements();
		
		//Iterator를 이용해서 ArrayList순회
		while(enumeration.hasMoreElements() == true) {
			//String name = (String) iterator.next();
			//지네릭스
			String name = enumeration.nextElement();
			LOG.debug("name :"+name);
		}
	}

}
//[2023-04-05 10:07:28] DEBUG Ex02_IteratorArrayVector.main(Ex02_IteratorArrayVector.java:24) - name :Alice
//[2023-04-05 10:07:28] DEBUG Ex02_IteratorArrayVector.main(Ex02_IteratorArrayVector.java:24) - name :이상무
//[2023-04-05 10:07:28] DEBUG Ex02_IteratorArrayVector.main(Ex02_IteratorArrayVector.java:24) - name :김수환무
//[2023-04-05 10:07:28] DEBUG Ex02_IteratorArrayVector.main(Ex02_IteratorArrayVector.java:24) - name :Bob
//[2023-04-05 10:07:28] DEBUG Ex02_IteratorArrayVector.main(Ex02_IteratorArrayVector.java:24) - name :Charlie