package com_pcwk_ehr;

public class Ed_03_StringMorse {
	public static void main(String[] args){
		//SOSHELP -> morse부호로 변환
		String source = "HELPME";
		String result = "";
		
		String []morse = {
				 "• ―"
				,"― • • •"
				,"― • ― •"	
				,"― • •"
				,"•"
				,"• • ― •"
				,"― ― •"
				,"• • • •"
				,"• •"
				,"• ― ― ―"
				,"― • ―"
				,"• ― • •"
				,"― ―"	
				,"― •"
				,"― ― ―"
				,"• ― ― •"
				,"― ― • ―"	
				,"• ― •"
				,"• • •"
				,"―"
				,"• • ―"
				,"• • • ―"
				,"• ― ―"
				,"― • • ―"
				,"― • ― ―"
				,"― ― • •"
		};
		//morse[0] = 'A'
		//source 문자열을 char 하나씩 추출
		for(int i=0;i<source.length();i++) {
			//System.out.println(source.charAt(i)-'A');
			int idx = source.charAt(i)-'A';
			System.out.printf("%c=%s\n",source.charAt(i),morse[idx]);	
			
			result += morse[idx];//모르스 부호 합치기
		}
		System.out.printf("source = %s\n", source);
		System.out.printf("%s",result);
		
	}
}
