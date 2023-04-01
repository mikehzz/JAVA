package com_pcwk_ehr04;

public class ObjectToStringMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		Card c02 = new Card();
		
		//return getClass().getName()+"@"+Integer.toHexString(hashCode));
		//Object toString(호출)
		System.out.println("c01 : "+c01);
		System.out.println("c01 : "+c01.toString());
		System.out.println("c02 : "+c02.toString());
	}

}
