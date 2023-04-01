package com_pcwk_ehr;

public class Ed_09_Casting {

	public static void main(String[] args) {
		// 묵시적 형변환(자동형변환)
		byte bNum = 11;
		
		int iNum = bNum;
		
		System.out.printf("bNum=%d\n", bNum);
		System.out.printf("iNum = %d\n", iNum);
		
		//정수와 실수간 값 할당
		//덜 정밀한 수에서 더 정밀한 수로 대입시 자동형변환됨
		int iNum02 = 14;
		float fNum = iNum02;
		
		System.out.printf("iNum02 = %d\n", iNum02);
		System.out.println("fNum = " + fNum);
		//bNum = iNum;
		
		double dNum = 0.0;
		
		dNum = fNum + iNum;
		//     float + int -> 14.0 + 11 -> 14.0 + 11.0
		System.out.println("dNum = " + dNum);
		
		
		
		
	}

}
