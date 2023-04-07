package com_pcwk_ehr09;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_FileOutPutStream {

	public static void main(String[] args) {
		
		
		//객체 선언
		FileOutputStream fos = null;//
		try {
			fos = new FileOutputStream("pcwkFile.txt");//파일명을 파랑으로 FileOutputStream 객체 생성
			String saveData = "Hello, World";//파일에 쓸 데이터
			fos.write(saveData.getBytes());//문자열을 byte[변경], 이 배열을 기록
			fos.flush();//출력 버퍼 비우기
			
		}catch(IOException e) {
			System.out.println("===============");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("===============");
			
		}finally {
			if(null != fos) {//객체가 Null이 아니면 종료
				try {
					fos.close();//출력 객체 닫기
				}catch (IOException e) {
				}
			}
		}
		System.out.println("파일 생성 완료!");
	}

}
