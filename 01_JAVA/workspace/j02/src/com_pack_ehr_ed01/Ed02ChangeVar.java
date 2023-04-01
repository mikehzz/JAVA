package com_pack_ehr_ed01;
/**
 * 두 변수의 값 교환
 * @author hbi
 *
 */
public class Ed02ChangeVar {

	/**
	 * 메인 메서드
	 * @param args
	 */
	
	public static void main(String[] args) {
		// 변수 선언
		// int x = 12, y = 14;
		int x = 12;
		int y = 14;
		int tmp;// 임시변수
		
		System.out.println("변경하기 전 ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("변경하기 후");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}







