package com_pcwk_ehr02;

import java.util.Set;
import java.util.TreeSet;
public class Ex07_TreeSet {

	public static void main(String[] args) {
		//TreeSet 객체 생성
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		
		//요소 추가
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(2);
		treeSet.add(5);
		
		System.out.println("TreeSet:"+treeSet);
		
		//요소 검색
		System.out.println("contains:"+treeSet.contains(33));
		
		//요소 삭제
		treeSet.remove(2);
		System.out.println("TreeSet:"+treeSet);
		
		//데이터 Iterating
		for(Integer element :treeSet) {
			System.out.println(element);
		}
		
		System.out.println("========================");
		//최소, 최대
		//지정된 값보다 가장 가까운 큰값
		System.out.println("higher:"+treeSet.higher(3));
		System.out.println("lower :"+treeSet.lower(3));
		
		//
		System.out.println("subSet:"+treeSet.subSet(1, 5));
		
		
	}

}
