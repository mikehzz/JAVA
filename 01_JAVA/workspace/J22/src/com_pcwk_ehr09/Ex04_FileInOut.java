package com_pcwk_ehr09;

import java.io.*;

public class Ex04_FileInOut {

	public static void main(String[] args) {
		//파일을 읽고,
		//또다른 파일에 기록
		//(파일 copy)
		FileInputStream fis = null;//입력파일 읽어오기 위한 FileInputStream 객체
		FileOutputStream fos = null;//파일에 저장하기 위한 FileOutputStream 객체

		try {
			fis = new FileInputStream("C:\\JAPA_0309\\01_JAVA\\workspace\\J22\\Input.txt");
			fos = new FileOutputStream("output.txt");//파일명을 파랑으로 output.txt 객체 생성
			//output.txt
			
			int data =0;
			while((data=fis.read()) != -1) {//더이상 읽을 데이터가 없으면 -1 return
				fos.write(data);
				System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println("====================");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("====================");
		}finally {
			try {
				if(null != fis) {
					fis.close();
				}
				if(null != fos) {
					fos.close();
				}
			}catch (IOException e) {
				System.out.println("====================");
				System.out.println("=IOException="+e.getMessage());
				System.out.println("====================");
			}
		}	
	}
}
