package com.pcwk.ehr07;

public class Point3D extends Point{
	int z;//좌표
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//부모쪽에 있는 메서드를 재정의 한다.
	@Override
	public String getLocation() {
		return "x:"+x+",y="+y+",z:"+z;
	}
	
	
	
}
