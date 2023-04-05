package com_pcwk_ehr02;

import java.util.*;

public class Ex05_HashSetLotto {
	public static void main(String[] args) {
		//1~45사이 중복되지 않은 임의의 숫자 6출력
		
		Set set = new HashSet();
		
		//1~45난수 발생 : 0.0 <= Math.random()<1.0
		for (int i=0;set.size()<=6;i++) {
			int n=(int) (Math.random()*45)+1;

			//System.out.println(n);
			set.add(n);
		}
		
		System.out.println("Set:"+set);
		
		List list = new LinkedList(set);
		//Sorting
		Collections.sort(list);
		System.out.println("sort asc:"+list);
	}
}
