package com_pcwk_ehr03;

import java.util.*;

public class Ex05_TreetableFrequency {
	public static void main(String[] args) {
		String str = "apple grape orange grape watermelon grape apple grape orange";
		//빈도수 구하기
		//apple	2
		//grape	4
		//orange2
		//watermelon1
		
		//1. 과일로 분리 : " "
		//2. HashMap : key apple, ++
		//3. 결과 출력
		
		Map<String,Integer> fruitBox=new TreeMap<>();
		
		//1.
		String[] words = str.split(" ");
		//2.단어 빈도수 구하기
		for(String fruit:words) {
			//System.out.println(fruit);
			
			//key가 존재하면 :기존 값을 가지고 와서 ++
			//key가 존재하지 않으면 : map(키,1);
			
			if(fruitBox.containsKey(fruit)) {
				fruitBox.put(fruit, fruitBox.get(fruit)+1);
			}else {
				fruitBox.put(fruit, 1);//최초 추가,key가 존재하지 않으면 : map(키,1);
			}
		}
		
		//3.결과 출력
		for(String key	:fruitBox.keySet()) {
			System.out.printf("key:%s=>%d\n",key,fruitBox.get(key));
		}
	}
}
