package com_pcwk_ehr08;

public class SingleTonMain {

	public static void main(String[] args) {
//		The constructor SingleTon() is not visible
//		SingleTon s = new SingleTon();
//		메모리 전략 할 수 있기 때문에 SingleTon을 사용함.
		
		SingleTon s = SingleTon.getInstance();
		
		System.out.println("s:"+s.toString());//객체주소
		
		SingleTon s23 = SingleTon.getInstance();
		System.out.println("s23:"+s23.toString());//객체 주소
		
		
	}

}

//s:com_pcwk_ehr08.SingleTon@15db9742
//s23:com_pcwk_ehr08.SingleTon@15db9742