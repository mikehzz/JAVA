package com_pcwk_ehr03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Ex06_Properties {

	public static void main(String[] args) {
		//새로운 Properties객체 생성
		Properties prop = new Properties();
		
		//Key-Value(String) 쌍 추가
		prop.setProperty("db.url", "jdbc:mysql://localhost:3306/mydb");
		prop.setProperty("db.username", "root");
		prop.setProperty("db.password", "4321");
		
		//db.username = root
		//db.password = 4321
		
		//파일에 기록
		try {
			FileOutputStream fos = new FileOutputStream("pcwk.properties");
			prop.store(fos, "DB Configuration");
			fos.close();
			
		}catch(IOException e){
			System.out.println("====================");
			System.out.println("===================="+e.getMessage());
			System.out.println("====================");
		}
		System.out.println("pcwk.properties 파일 생성");
		
		//파일에서 pcwk.properties 읽기
		try {
			FileInputStream fis = new FileInputStream("pcwk.properties");
			prop.load(fis);//pwk.properties Properties prop load
			fis.close();
			
		}catch(IOException e){
			System.out.println("====================");
			System.out.println("===================="+e.getMessage());
			System.out.println("====================");
		}		
		System.out.println("pcwk.properties 읽기");
		
		//key를 통해 Value가져 오기
		System.out.println("db.username="+prop.getProperty("db.username"));
		System.out.println("db.password="+prop.getProperty("db.password"));
		System.out.println("db.url="+prop.getProperty("db.url"));
		
	
	}
}
//개발환경, 운영환경 설정 정보가 서로 달라 파일로 구분
//pcwk.properties 파일 생성
//pcwk.properties 읽기
//db.username=root
//db.password=4321
//db.url=jdbc:mysql://localhost:3306/mydb
