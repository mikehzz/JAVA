package com_pcwk_ehr;

public class Ed_10_Casting {

	public static void main(String[] args) {
		// 명시적 형변환
		
		//큰 수를 작은 변수에 할당
		int iNum = 12; //4byte
		byte bNum = (byte)iNum;
		
		System.out.println("iNum = " + iNum);
		System.out.println("bNum = " + bNum);
		
		//오버플로 : 변수에 저장 범위를 넘어 가는 경우.
		//        쓰레기 값이 발생한다. (의미 파악할 필요 없음!)
		
		System.out.println("===========================");
		int iNum02 = 129;
		byte bNum02 = (byte)iNum02;
		System.out.println("iNum02 = " + iNum02);
		System.out.println("bNum02 = " + bNum02);//오버플로 바이트에 할당된 최대값은 127이기 때문
		
		//더 정밀한 수에서 덜 정밀한 변수로 대입
		double dNum = 3.14;
		int iNum03 = (int)dNum;
		System.out.println("===========================");
		System.out.println("dNum = " + dNum);
		System.out.println("iNum03 = " + iNum03);
		
		
		
	}

}
