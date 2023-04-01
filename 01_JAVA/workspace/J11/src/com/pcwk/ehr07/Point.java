package com.pcwk.ehr07;
	/**
	 * 좌표 x,y
	 * 
	 * 
	 */
public class Point {
	int x;//좌표x
	int y;//좌표y
	
	Point(int x, int y){
		 this.x = x;
		 this.y = y;
	}
	 
	public String getLocation() {
		return "x:"+x+",y"+y;
	} 
	
	
}
