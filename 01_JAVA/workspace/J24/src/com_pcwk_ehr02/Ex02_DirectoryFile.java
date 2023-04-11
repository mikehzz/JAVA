package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02_DirectoryFile implements pcwLog {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("디렉토리 경로를 입력하세요.");
			System.exit(0);
		}
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J24\\src"
		
		//디렉토리 경로
		String directoryPath = args[0];
		System.out.println("directoryPath:"+directoryPath);
		
		//디렉토리 객체 생성
		File directory = new File(directoryPath);
		//디렉토리내 파일과 디렉토리 목록 출력
		printDirectoryContents(directory);
	}
	public static void printFileContents(File file) {
			//파일 이름
			System.out.printf("%-20s\t", file.getName());
			
			//파일 크기
			System.out.printf("%5d bytes\t", file.length());
			//System.out.print("%5d bytes\t", file.length());

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
	}
	
	/**
	 * 파일과 디렉토리 목록 출력 하기
	 * @param directory
	 */
	
	public static void printDirectoryContents(File directory) {
		
		//디렉토리 path
		
		System.out.println(directory.getAbsolutePath()+" Directory");
		File[] fileList = directory.listFiles();
		
		for(File file: fileList) {
			//파일
			if(file.isFile()==true) {
				//System.out.println("file:"+file.getName());
				printFileContents(file);
			}else if(file.isDirectory()) {
			//디렉토리
				printDirectoryContents(file);
			}
		}
		
	}
	
	
}
