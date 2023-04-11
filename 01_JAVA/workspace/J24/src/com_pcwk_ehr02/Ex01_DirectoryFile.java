package com_pcwk_ehr02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex01_DirectoryFile implements pcwLog {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("디렉토리 경로를 입력하세요.");
			System.exit(0);
		}
		String paramPath = args[0];
		
		//디렉토리 경로
		//String directoryPath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr_cmn";
		String directoryPath = paramPath;
		//디렉토리 객체 
		File directory = new File(directoryPath);
		
		//디렉토리 내의 파일 목록 조회
		File[] filelist = directory.listFiles();
		
		for(File file : filelist) {
			//파일 이름
			System.out.printf("%20s\t", file.getName());
			
			//파일 크기
			System.out.printf("%5d bytes\t", file.length());
			
			//파일 권한
			System.out.print(file.isFile()==true?"-":"d");
			System.out.print(file.canRead()==true?"r":"-");
			System.out.print(file.canWrite()==true?"w":"-");
			System.out.print(file.canExecute()==true?"w":"-");
			System.out.print("\t");
			
			//최종수정일
			Date lastModifiDate=new Date(file.lastModified());
			
			//yyyy-MM-DD HH:mm:ss
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
			System.out.print(sdf.format(lastModifiDate));
			System.out.println();
			
		}//--for
		
	}//--main

}
