package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ex03_DirectoryFile implements pcwLog {
	static int totalFileCount = 0; //총파일수
	static int totalDirectoryCount = 0; //총디렉토리수
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("디렉토리 경로를 입력하세요.");
			System.exit(0);
		}
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J24"
		
		//디렉토리 경로
		String directoryPath = args[0];
		System.out.println("directoryPath:"+directoryPath);
		
		//디렉토리 객체 생성
		File directory = new File(directoryPath);
		//디렉토리내 파일과 디렉토리 목록 출력
		printDirectoryContents(directory);
		
		
		//총 파일/디렉토리 출력
		System.out.println("------------------------------");
		System.out.println("-총"+totalFileCount+"개의 파일");
		System.out.println("-총"+totalDirectoryCount+"개의 디렉토리");
		
		System.out.println("------------------------------");
		
	}
	
	/**
	 * 파일과 디렉토리 목록 출력 하기
	 * @param directory
	 */
	public static void printDirectoryContents(File directory) {
		
		//디렉토리 path
		System.out.println(directory.getAbsolutePath()+" Directory");
		File[] fileList = directory.listFiles();
		
		ArrayList<File> subDir = new ArrayList();
		
		
		for(File file: fileList) {
			//파일
			if(file.isFile()==true) {
				//System.out.println("file:"+file.getName());
				printFileContents(file);
			}else if(file.isDirectory()) {
			//디렉토리
				//printDirectoryContents(file);
				subDir.add(file);
			}
		}//for file
		
		//subDir 개수
		int subDirCount =subDir.size();
		
		//파일 개수
		int subFileCount = fileList.length - subDirCount;
		
		System.out.println("\t\t\t"+subFileCount+"개의 파일");
		System.out.println("\t\t\t"+subDirCount+"개의 디렉토리");
		
		
		//총파일
		totalFileCount += subFileCount;
		
		//총 디렉토리 수
		totalDirectoryCount += subDirCount;
	
		for(File dir : subDir) {
			printDirectoryContents(dir);
		}
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
