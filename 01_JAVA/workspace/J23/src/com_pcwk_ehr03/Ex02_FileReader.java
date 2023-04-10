package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.io.*;


public class Ex02_FileReader implements pcwLog {
	
	
	public static void readP(String filePath) {
		FileReader fr = null;
		long start = System.currentTimeMillis();
		
		
		try {
			fr=new FileReader(filePath);
			int data = 0;
			
			while((data =fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e){
			LOG.debug("=============");
			LOG.debug("=IOException="+e.getMessage());
			LOG.debug("=============");
		}finally {
			if(null != fr) {
				try {
				fr.close();
				}catch(IOException e){
				e.getMessage();
				}
			}
		long end = System.currentTimeMillis();
		LOG.debug("프로그램 종료!"+(end-start)+"ms");
		}
	}
	
	public static void readLineP(String filePath) {
		FileReader fr = null;
		BufferedReader br = null;
		long start = System.currentTimeMillis();
		int cnt = 0;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			
			String lineData = "";
			while((lineData = br.readLine())!= null){
				System.out.println(lineData);
				cnt++;
			}
			
		}catch(IOException e){
			LOG.debug("=============");
			LOG.debug("=IOException="+e.getMessage());
			LOG.debug("=============");
		}finally {
			//BufferedReader close하면
			//FileReader도 close한다.
			if(null != br) {
				try {
					br.close();
				}catch (Exception e) {
					
				}
			}
		}
		long end = System.currentTimeMillis();
		LOG.debug(cnt + "경과시간!"+(end-start)+"ms");
	}
	
	
	
	public static void main(String[] args) {
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr03\\kim.txt";
		//readP(filePath);
		readLineP(filePath);
	}
	
}
