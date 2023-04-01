package com_pcwk_ehr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ed_05_TryWithResourceMain {
	public static void main(String[] args) {
		// file 읽기 및 쓰기
		// try 클래스
		// AutoCloseable 인터페이스를 implements 받아야한다
		// JVM이 알아서 close() 처리함
		try (FileInputStream fis = new FileInputStream(
				"C:\\JAPA_0309\\01_JAVA\\workspace\\J15\\src\\com_pcwk_ehr\\Ed_04_TryWithResourceMain.java");
				FileOutputStream fos = new FileOutputStream("pcwk.txt");) {
		} catch (FileNotFoundException e) { // public class FileNotFoundException extends IOException
			System.out.println(e.getMessage());
			// 예외의 그 다음 조상
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) { // 예외의 최고 조상
			System.out.println(e.getMessage());
		}
	}
}
