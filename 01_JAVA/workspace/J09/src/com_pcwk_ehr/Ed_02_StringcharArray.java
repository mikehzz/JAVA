package com_pcwk_ehr;

public class Ed_02_StringcharArray {

	public static void main(String[] args) {
		String str = "ABCDE";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.printf("ch=%c\n", ch);
		}
		//string -> char[]
		char[] chArray = str.toCharArray();
		System.out.println(chArray);//ABCDE
		
		
		
	}

}
