package com_pcwk_ehr05;

import java.io.*;

public class Ex06_File {
	
	public static void main(String[] args) {
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr05\\Ex06_File.java";
		
		String parentPath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J2\\\src\\com_pcwk_ehr05";
		String fileName = "Ex06_File.java";
		
		//파일 객체 생성1
		File file=new File(filePath);
		
		//파일 객체 생성2 -> 파일 패스 + 파일명
		File file02 = new File(parentPath, fileName);
		
		//파일 객체 생성3
		File dir = new File(parentPath);
		File file03 = new File(dir, fileName);
		
		//파일과 디렉토리 구분
		System.out.println("파일 여부:"+file.isFile());
		System.out.println("디렉토리 여부:"+file.isDirectory());
		
		//파일패스 + 파일명
		System.out.println("경로:"+file.getParent());
		System.out.println("파일명:"+file.getName());
		
		//static String pathSeparator
		//static String separator
		
		System.out.println("pathSeparator:"+File.pathSeparator);
		System.out.println("Separator:"+File.separator);
		
	}
}
