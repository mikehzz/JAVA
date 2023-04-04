package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;

public class Ed_05_ArrayListLinkedList implements pcwLog {
		
	public static void main(String[] args) {
		
		//순차적 추가
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		LOG.debug("===중간에 추가 삭제===");	
		LOG.debug("arrayList : "+squentialAdd(arrayList));	
		LOG.debug("arrayList : "+squentialAdd(linkedList));	
		
		//중간에 추가 삭제
		LOG.debug("===중간에 추가 삭제===");
		LOG.debug("arrayList : "+ middleAdd(arrayList));
		LOG.debug("LinkedList : "+ middleAdd(linkedList));
		
		//데이터 삭제:ArrayList : 마지막 번지 부터 시작해서 0번지 까지 역순
		LOG.debug("===순차적인 삭제===");
		//LOG.debug("arrayList : "+removeList(arrayList));	
		LOG.debug("arrayList : "+removeList(linkedList));	
		
	}
	
	//삭제
	public static long removeList(List list) {
		long start = System.currentTimeMillis();
		
		//마지막 부터 시작해서 0번지 까지 삭제
		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		for(int i=0;i<list.size();i++) {
			LOG.debug("removeList***"+list.remove(i));
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	
	
	public static long middleAdd(List list) {
		long start = System.currentTimeMillis();
			
		for(int i=0;i<1_000;i++) {
			list.add(99,i+"");//99번째 추가
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//param 다형성
	//ArrayList, LinkedList모두 List implements 받는다.
	
	//순차적인 추가
	public static long squentialAdd(List list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1_000_000;i++) {
			list.add(i+"");
		}
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}
}


