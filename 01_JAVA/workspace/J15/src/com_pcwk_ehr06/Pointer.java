package com_pcwk_ehr06;

public class Pointer implements Cloneable{
	int x;
	int y;
	
	Pointer(){	
	}
	
	Pointer(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Pointer [x=" + x + ", y=" + y + "]";
	}
	public Object clone() {
		Object  obj = null;
		try {
			obj = super.clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return obj;
	}
	
}
