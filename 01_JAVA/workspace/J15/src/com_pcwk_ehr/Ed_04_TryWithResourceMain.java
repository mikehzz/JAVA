package com_pcwk_ehr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ed_04_TryWithResourceMain {
	public static void main(String[] args) {
		// file 읽기 및 쓰기
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(
					"C:\\JAPA_0309\\01_JAVA\\workspace\\J15\\src\\com_pcwk_ehr\\Ed_04_TryWithResourceMain.java");
			fos = new FileOutputStream("pcwk.txt");
		} catch (FileNotFoundException e) { // public class FileNotFoundException extends IOException
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}