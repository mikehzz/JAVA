package com.pcwk.ehr03;

public class PrimitiveParamMain {

	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		System.out.println("main():x = "+data.x);
		
		change(data.x);
		System.out.println("========== After ==========");
		System.out.println("change Main():x = "+data.x);

	}
	
	static void change(int x) {
		x = 999;
		System.out.printf("change():x = %d%n",x);
	}

}
/*
main():x = 10
change():x = 999
========== After ==========
change Main():x = 10
*/