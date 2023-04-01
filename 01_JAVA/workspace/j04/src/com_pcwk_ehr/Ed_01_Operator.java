package com_pcwk_ehr;

public class Ed_01_Operator {

	public static void main(String[] args) {
		// 증감 연산자는 피연산자에 저장된 값을 1증가, 또는 1감소 시킨다.
		// 단항 연산자는 독립적으로 사용 되면 전위형 후위형 같다.
		int i = 12;
		i++;
		
		System.out.println("i++ = " + i);
		
		i=12;
		++i;
		System.out.println("++i = " + i);
		
		
		

	}

}
