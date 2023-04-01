package com_pcwk_ehr07;

public class ShllowCopyMain {

	public static void main(String[] args) {
		//얕은 copy
		Circle c01 = new Circle(new Pointer(12,14), 17);
		Circle c02 = c01.clone();
		
		System.out.println("c01:"+c01);
		System.out.println("c02:"+c02);
		
		c01.p.x = 0;
		c02.p.y = 0;
		//c01의 p의 참조변수 값을 변경하니, c02의 p의 값 변경
		System.out.println("값 변경 후 ===============");
		
		//alt+shift+a -> 새로편집 모드 : 커서 모양이 +
		System.out.println("c01:"+c01);
		System.out.println("c02:"+c02);
	}
	//ctrl+shift+s
}
