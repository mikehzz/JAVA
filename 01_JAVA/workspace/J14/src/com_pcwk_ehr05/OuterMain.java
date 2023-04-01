package com_pcwk_ehr05;

public class OuterMain {

	public static void main(String[] args) {
		//인스턴스 생성시 우선적으로 Outer생성 필요
		Outer oc = new Outer();
		
		//Outer.InstanceInner 생성
		Outer.InstanceInner ii=oc.new InstanceInner();
		System.out.println("ii.iv = "+ii.iv);
		
		//Outer.StaticInner
		System.out.println("Outer.StaticInner.cv"+Outer.StaticInner.cv);
		
		//StaticInner iv
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv"+si.iv);
		
			
	}

}
