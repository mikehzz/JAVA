package com.pcwk.ehr05;

public class DrawShapeMain {

	public static void main(String[] args) {
		Point[] p = { new Point(100,100),
				new Point(140,50),
				new Point(200,100)
			
		};
		
		Triangle t =new Triangle(p);
		t.draw();
		
		Circle c = new Circle(new Point(100,100), 50);
		c.draw(); //[center=(100,100), r=50, color=yellow]
		
		
		
	}
}