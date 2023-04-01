package com_pcwk_ehr_cls2;
import com_pcwk_ehr_cls.Tv;
public class TvMainMulti {

	public static void main(String[] args) {
		Tv tv01 = new Tv();
		Tv tv02 = new Tv();
		
		//channel값
		System.out.println("tv01의 channel값은 : "+tv01.channel);
		System.out.println("tv02의 channel값은 : "+tv02.channel);
		
		tv01.channel = 3;
		System.out.println("tv01 채널을 3번으로 변경!");
		System.out.println("tv01의 channel값은 :"+tv01.channel);
		System.out.println("tv02의 channel값은 :"+tv02.channel);
		
		
		
		
	}
}
