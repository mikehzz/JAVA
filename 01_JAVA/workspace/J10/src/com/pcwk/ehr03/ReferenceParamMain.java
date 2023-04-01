package com.pcwk.ehr03;

public class ReferenceParamMain {

	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		System.out.println("main() : data.x = "+data.x);
		
		change(data);
		System.out.println("========== After ==========");
		System.out.println("main() : data.x = "+data.x);

	}
	
	static void change(Data d) {
		d.x = 999;
		System.out.println("change() : d.x = "+d.x);
	}

}
/*
main() : data.x = 10
change() : d.x = 999
========== After ==========
main() : data.x = 999
*/
