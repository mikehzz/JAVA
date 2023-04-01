package com.pcwk.ehr07;

public class VarArgsMain {

	public static void main(String[] args) {
		String[] strArray = {"13", "15", "17"};
		
		System.out.println(concatenate("","12","14"));
		System.out.println(concatenate("|", strArray));
		System.out.println("["+concatenate(",")+"]");
		// 가변인자에 파라메타를 전달하지 않아도 된다
		System.out.println(concatenate("|", new String[] {"1","2","3"}));
		// 가변인자에 새로운 배열을 입력해도 가능

	}
	
	/**
	 * 가변인자
	 * @param delim
	 * @param args
	 * @return String
	 */
	
	static String concatenate(String delim, String ... args) {
	// 생략부분의 파라메터는 반드시 맨 뒤에 배치되어야 함             [ ↑ ]
		String result = "";
		
		for(String data :args) {
			result += data + delim;
		}
		
		return result;
	}

}
/*
1214
13|15|17|
[]
1|2|3|
*/