package com.pcwk.ehr;

public class Ed01_TvArray {

	public static void main(String[] args) {
		//길이가 5인 Tv의 배열
		Tv[] tArray = new Tv[5];
		
		//tArray에 Tv객체를 생성 및 각 요소 할당
		for(int i=0;i<tArray.length;i++) {
			tArray[i] = new Tv();
			tArray[i].channel = 3;
			
		}
/*
tArray[0] channel : 3
tArray[1] channel : 3
tArray[2] channel : 3
tArray[3] channel : 3
tArray[4] channel : 3
 */
		
		//Tv배열의 채널값 확인
		for(int i=0;i<tArray.length;i++) {
			//함수호출 > 모든 인스턴스에 메소드값 적용
			tArray[i].channelUp();
			
			System.out.printf("tArray[%d] channel : %d%n",i,tArray[i].channel);
		}

	}

}
/*
tArray[0] channel : 4
tArray[1] channel : 4
tArray[2] channel : 4
tArray[3] channel : 4
tArray[4] channel : 4
*/
