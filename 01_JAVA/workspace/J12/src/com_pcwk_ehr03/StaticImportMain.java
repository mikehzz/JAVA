package com_pcwk_ehr03;

import static java.lang.Math.*;
import static java.lang.Math.random;
import static java.lang.System.out;
//컴파일러가 자동으로 추가한다.: import java.lang.*

import com_pcwk_ehr02.ImportTestMain; 

import static com_pcwk_ehr02.ImportTestMain.TO_DAY;

public class StaticImportMain {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		System.out.println(random());//static import를 사용
		
		System.out.println(Math.PI);
		
		out.println(PI);//static System.out, Math
		
		//class static 멤버변수
		System.out.println("TO_DAY:"+ImportTestMain.TO_DAY);
		
	}	
}