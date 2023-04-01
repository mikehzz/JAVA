package com.pcwk.ehr05;

public class Circle extends Shape {
	Point center; //원점
	int r;
	
	Circle(){
		this(new Point(0,0),100);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	//원 정보 출력
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s ]\n", center.x,center.y,r,color);
		
	}
}
