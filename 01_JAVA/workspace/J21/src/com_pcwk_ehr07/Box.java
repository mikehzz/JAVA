package com_pcwk_ehr07;

import java.util.ArrayList;

public class Box<T> {
	private ArrayList<T> item=new ArrayList<T>();
	
	public Box() {}
	
	void add(T obj) {
		item.add(obj);
	}
	
	T get(int i) {
		return item.get(i);
		
	}

	@Override
	public String toString() {
		return "Box [item=" + item + "]";
	}
	
	
	
	
}
