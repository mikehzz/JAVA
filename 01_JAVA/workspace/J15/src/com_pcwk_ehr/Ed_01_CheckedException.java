package com_pcwk_ehr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Ed_01_CheckedException {
	public static void main(String[] args) {
		
		System.out.println("1");
		try {
			System.out.println("2");
			FileInputStream fis = new FileInputStream(
					"C:\\JAPA_0309\\01_JAVA\\workspace\\J15\\src\\com_pcwk_ehr\\Ed_01_CheckedException.java"
					);
			System.out.println("3");
		} catch (FileNotFoundException e) {	// Checked Exception
			e.printStackTrace();
			System.out.println("4"+e.getMessage());
		}
		System.out.println("End");
	}
}