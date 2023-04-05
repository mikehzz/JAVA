package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;
import java.util.ArrayList;

public class Ex03_ListIteratorArrayList implements pcwLog {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("이상무");
		names.add("김수환무");
		names.add("Bob");
		names.add("Charlie");
		
		//Vector를 위한 ListIterator 생성
		ListIterator<String> listIterator = names.listIterator();
		
		//Iterator를 이용해서 정방향 ArrayList순회
		while(listIterator.hasNext() == true) {
			//String name = (String) iterator.next();
			//지네릭스
			String name = listIterator.next();
			LOG.debug("name :"+name);
		}
		LOG.debug("===================================");
		
		while(listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.print(name+",");

		}
		//요소추가
		listIterator.add("EVE");
		//listIterator.set("Dave");
		System.out.println();
		printListIterator(names.listIterator());
		
		printListIterator(names.listIterator());
	}	
	public static void printListIterator(ListIterator<String> listIterator) {
		while(listIterator.hasNext() == true) {
			//String name = (String) iterator.next();
			//지네릭스
			String name = listIterator.next();
			LOG.debug(name+",");
		}
		System.out.println();
	}
}
