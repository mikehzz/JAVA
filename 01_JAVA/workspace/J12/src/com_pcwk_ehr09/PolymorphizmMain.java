package com_pcwk_ehr09;

public class PolymorphizmMain {

	public static void main(String[] args) {
		CaptionTv captionTv = new CaptionTv();
		
		//CaptionTv ct = new Tv(); error
		//반대로 자손타입의 참조변수로 조상타입의 인스턴스는 참조할 수 없다.
		
		
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
		Tv t=new CaptionTv();
		
		
		
	}

}
