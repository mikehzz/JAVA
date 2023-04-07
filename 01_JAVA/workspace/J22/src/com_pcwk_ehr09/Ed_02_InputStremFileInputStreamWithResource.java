package com_pcwk_ehr09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ed_02_InputStremFileInputStreamWithResource {

	public static void main(String[] args) {
		//C:\JAPA_0309\01_JAVA\workspace\J22\src\com_pcwk_ehr09\Ed_01_InputStremFileInputStream.java
		//\\: \로 사용하기 위해 \\
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J22\\src\\com_pcwk_ehr09\\Ed_01_InputStremFileInputStream.java"
		
		if(args.length != 1) {
			System.out.println("파일 패스를 입력 하세요.");
			System.exit(0);
		}
		
		String filePath = args[0];
		System.out.println("filePath : "+filePath);
		
		
		//try with resource :AutoCloseable implements된 class는 try-with-resource 처리 가능
		//finally구문 생략 가능
		
		try (FileInputStream fis = new FileInputStream(filePath);){
			int data = 0; //1byte 데이터 저장
			
			while ((data = fis.read()) != -1) {//read() 더이상 데이터가 없으면 -1 return
				char ch = (char) data;
				System.out.print(ch);
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=====================");
		System.out.println("=========End=========");
		System.out.println("=====================");
	}

}
