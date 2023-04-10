package com_pcwk_ehr04;

import com_pcwk_ehr_cmn.pcwLog;
import java.io.*;

public class Ex04_InputStreamReader implements pcwLog {

	public static void main(String[] args) {
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr04\\kim.txt";
		
		//try-with-resource : finally 필요 없음!
		try(	FileInputStream fis = new FileInputStream(filePath);
				InputStreamReader isr = new InputStreamReader(fis);){ //byte 스트림을 char 스트림으로 변환
			int data = 0;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println("getEncoding:"+isr.getEncoding());//getEncoding:UTF8
			
		}catch(IOException e) {
			LOG.debug("=================");
			LOG.debug("=IOExeption="+e.getMessage());
			LOG.debug("=================");
		}
		LOG.debug("프로그램 종료!");
		
	}

}
//QWERTYUIOSDFGHJKLXCVBNM
//데이터를 읽어 보자
//getEncoding:UTF8
//[2023-04-10 11:08:44] DEBUG Ex04_InputStreamReader.main(Ex04_InputStreamReader.java:25) - 프로그램 종료!