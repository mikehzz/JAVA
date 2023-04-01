package com_pcwk_ehr;

public class Ed_06_Printf_Literal {
//	%b		boolen 형식으로 출력
//	%d		10진 정수 형식으로 출력
//	%o		8진 정수 형식으로 출력
//	%x		16진 정수 형식으로 출력
//	%f		부동 소수점 형식으로 출력
//	%e		지수 형식으로 출력
//	%c		문자로 출력
//	%s		문자열로 출력
	
	
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;	
		char ch = 'a';

		int pcwk = 10;
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		long bigInteger = 100_000_000_000L;// 대문자 L을 사용 할 것, 소문자 ㅣ도 가능
		long hexNumber = 0xFFFF_FFFF_FFFF_FFFFL; //1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
		
		System.out.println("=================");
		System.out.printf("b = %d\n", b); // \n, %n line skip
		System.out.printf("s = %d\n", s);
		System.out.printf("ch = %c, ch의 ASCII = %d\n",ch, (int)ch);
		System.out.printf("pcwk = [%5d]\n", pcwk); //%5d 오른쪽 정렬
		System.out.printf("pcwk = [%-5d]\n", pcwk); //%-5d 왼쪽 정렬
		System.out.printf("pcwk = [%05d]\n", pcwk);//%05d 오른쪽 정렬, 빈자리는 0으로 채우기
		
		System.out.printf("octNum = %o(8진수) %d(10진수)\n",octNum, octNum);// 차례 대로 8진수, 10진수
		System.out.printf("hexNum = %x(16진수) %d(10진수)\n",hexNum, hexNum);// 차례 대로 16진수, 10진수
		
		//2진수는 지시문자가 없음 -> 별도의 함수 사용
		System.out.printf("binNum = %s(2진수) %d(10진수)\n",Integer.toBinaryString(binNum), binNum);// 차례 대로 16진수, 10진수
		
		System.out.printf("bigInteger = %d\n", bigInteger);
		System.out.printf("hexNumber = %#x\n", hexNumber);//%#x : 16진수 형식(0x)를 붙여서 출력하세요.
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=================");
		

	}

}
