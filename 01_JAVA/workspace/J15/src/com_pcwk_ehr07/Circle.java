package com_pcwk_ehr07;

public class Circle implements Cloneable{
	Pointer p;//x,y좌표
	int r;//반지름
	
	Circle(){	
	}
	
	public Circle(Pointer p, int r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {
		Object  obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return (Circle)obj;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	
	
}
