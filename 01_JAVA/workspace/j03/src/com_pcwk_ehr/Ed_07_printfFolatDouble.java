package com_pcwk_ehr;

public class Ed_07_printfFolatDouble {

	public static void main(String[] args) {
		// %f,	: 주로 사용(O), 소숫점 아래 6자까지 출력, 7자리에서 반올림
		// %e,	: 지수형태로 출력 
		// %g	: 간략표현
		
		float f01 = .10f;//0.10f, 1e^-1
		float f02 = 1e1f;
		double d = 1.23456789;
		
		String url = "https://cafe.daum.net/pcwk"; 
		
		//문자열의 길이 구하기
		System.out.println(url.length());
		
		System.out.println("====================");
		
		
		System.out.printf("f01 = %f, %e, %g\n", f01,f01,f01);
		//--> f01 = 0.100000, 1.000000e-01, 0.100000
		System.out.printf("f02 = %f, %e, %g\n", f02,f02,f02);
		//--> f02 = 10.000000, 1.000000e+01, 10.0000
		
		
		System.out.println("====================");

		System.out.printf("d = %f\n", d);// 1.2345678 7자리에서 반올림
		System.out.printf("   12341234567890\n");
		System.out.printf("d = %14.10f\n", d);// %전체 자리수(소수점 포함), 소수점 이하 자리수
		System.out.println("====================");

		System.out.printf(" 12345678901234567890\n");
		System.out.printf("[%s]\n", url);//문자열
		System.out.println("====================");
		
		System.out.printf("[%20s]\n", url);//20자리 공간을 확보하고 오른쪽 정렬, 빈자리는 space로 채우세요.
		System.out.printf("[%-20s]\n", url);//20자리 공간을 확보하고 왼쪽 정렬, 빈자리는 space로 채우세요.
		//왼쪽 8자리만 출력
		System.out.printf("[%.8s]\n", url);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
