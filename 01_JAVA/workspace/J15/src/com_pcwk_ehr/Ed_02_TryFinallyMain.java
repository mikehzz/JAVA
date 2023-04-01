package com_pcwk_ehr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ed_02_TryFinallyMain {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		System.out.println("1-");
		
		try {
			System.out.println("2-");
			fis = new FileInputStream("C:\\JAPA_0309\\01_JAVA\\workspace\\J15\\src\\com_pcwk_ehr\\Ed02_TryFinallyMain1.java");
			System.out.println("3-");
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); >> stack에 있는 오류 메세지를 자세히 출력
			System.out.println("4-");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(null!=fis) {	// null이 아닌 경우만 close
					fis.close();
				}
				System.out.println("5- finally");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("End");
	}
}