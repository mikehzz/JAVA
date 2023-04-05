package com_pcwk_ehr02;

import java.util.Set;
import java.util.TreeSet;
public class Ex08_TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		//1~45 난수 6 추출
		for(int i=1;set.size()<6;i++) {
			int n=(int)(Math.random()*45)+1;
			set.add(n);
		}
		System.out.println("TreeSet:"+set);
		
	}

}
//TreeSet:[10, 13, 15, 25, 44, 45]