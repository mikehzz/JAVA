package com_pcwk_ehr09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_FileInOut {

	public static void main(String[] args) {
		//파일을 읽고,
		//또다른 파일에 기록
		//(파일 copy)
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J22\\src\\com_pcwk_ehr_cmn\\pcwLog.java"
		//PcwkLog.java -> CopyPcwkLog.java
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J22\\src\\com_pcwk_ehr_cmn\\Ex05_FileInOut.java"
		
		if(args.length != 1) {
			System.out.println("원본파일명을 입력 하세요.");
			System.exit(0);//프로그램 종료
		}
		
		//원본파일명
		String orgFileName = args[0];
		
		//저장파일명
		int idx = orgFileName.lastIndexOf("\\");
		if(idx < 0) {
			System.out.println("\\가 없습니다.");
			return;
		}
		
		String saveFileName = "Copy"+orgFileName.substring(idx+1);
		
		//try-with-resource
		try(FileInputStream fis = new FileInputStream(orgFileName);
				FileOutputStream fos = new FileOutputStream(saveFileName);
				){
			int data =0;
			while((data=fis.read()) != -1) {//더이상 읽을 데이터가 없으면 -1 return
				fos.write(data);
				System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println("====================");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("====================");
		}
	}
}
