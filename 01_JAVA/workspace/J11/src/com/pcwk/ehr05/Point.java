package com.pcwk.ehr05;

public class Point {
	int x;//x좌표
	int y;//y좌표
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;//this.x 멤버변수, x param
		this.y = y;
		
	}
	
	//좌표 값 return
	String getXY() {
		return "("+x+","+y+")";
	}
	
}
