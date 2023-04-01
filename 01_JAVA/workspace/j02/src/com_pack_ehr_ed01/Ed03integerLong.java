/**
 * 6개월 뒤의 나의 모습 : 주니어개발자
 */
package com_pack_ehr_ed01;

/**
 * int 자료형과 long
 * @author hbi
 *
 */
public class Ed03integerLong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1_234_567_890; // 천단위 구분 기호
		//int num = 1245678900; int 저장 범위 초과 (4바이트 초과)
		System.out.println("num:"+num);
		
		
		long account = 12345678900L; // 8바이트 
		System.out.println("account :" + account);
	}

}