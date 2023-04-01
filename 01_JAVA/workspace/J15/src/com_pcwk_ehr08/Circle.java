package com_pcwk_ehr08;

public class Circle implements Cloneable{
	Pointer p;//x,y좌표
	int r;//반지름
	
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
		//참조변수 Pointer copy
		Circle tmp = (Circle) obj;
		tmp.p = new Pointer(this.p.x, this.p.y);
		
		return tmp;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	
	
}
