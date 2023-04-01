package com_pcwk_ehr08;

class SingleTon {
	//public 없음
	
	private static SingleTon s = new SingleTon();
	
	//생성자 private
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(null == s) {
			s = new SingleTon();
		}
		return s;
	}
		
		
}
