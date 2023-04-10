package com_pcwk_ehr02;

import java.io.IOException;
import java.io.*;
import com_pcwk_ehr_cmn.pcwLog;

class Ex01_Reader implements pcwLog {
	

	public static void byteStream(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			int data = 0;
			while((data = fis.read()) != -1){ // 데이터를 1byte씩 읽고 더이상 데이터가 없으면 -1 return
				System.out.print((char)data);
				
			}
			System.out.println();
			
		}catch(IOException e) {
			LOG.debug("====================");
			LOG.debug("========IOException="+e.getMessage());
			LOG.debug("====================");
		}finally {
			if(null != fis) {
				try {
					fis.close();
				} catch(IOException e) {
					
				}
			}
		}
	}
	/**
	 * 2byte 단위 문자 처리
	 * @param filePath
	 */	
	public static void charStream(String filePath) {
		FileReader fr = null;
		try {
			fr = new FileReader(filePath);
			int data = 0;
			
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
			
		}catch(IOException e) {
			LOG.debug("====================");
			LOG.debug("========IOException="+e.getMessage());
			LOG.debug("====================");
		}finally {
			if(null != fr) {
				try{
					fr.close();
				}catch(IOException e) {
					
				}	
			}
		}
	}
	public static void main(String[] args) {
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr02\\kim.txt";
		byteStream(filePath);
		charStream(filePath);
	}
		
}
