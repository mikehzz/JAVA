package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ex05_DirectoryFile implements pcwLog {
	
	static int totalFileCount = 0; //총파일수
	static int totalDirectoryCount = 0; //총디렉토리수
	static int keywordCount = 0;//keyword 수
	static String keyword = "";
	//java파일만 읽는다.
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("디렉토리 경로를 입력하세요.");
			System.exit(0);
		}
		//"C:\\JAPA_0309\\01_JAVA\\workspace\\J24"
		
		//디렉토리 경로
		String directoryPath = args[0];
		String keyword = args[1];
		System.out.println("directoryPath:"+directoryPath);
		
		//디렉토리 객체 생성
		File directory = new File(directoryPath);
		//디렉토리내 파일과 디렉토리 목록 출력
		printDirectoryContents(directory);
		
		
		//총 파일/디렉토리 출력
		System.out.println("------------------------------");
		System.out.println("-총"+totalFileCount+"개의 파일");
		System.out.println("-총"+totalDirectoryCount+"개의 디렉토리");
		System.out.println("-총"+keywordCount+"개의 "+keyword);

		System.out.println("------------------------------");
		
	}
	//JavaAllSource.java
	
	//2byte문자를 읽을 수 있는 FileReader, BufferedReader
	public static void printJavaFileContents2(File file) {
		
		try (	FileWriter fw = new FileWriter("JavaAllSource.java",true);
				BufferedWriter bw = new BufferedWriter(fw);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
			//한줄씩 데이터 저장
			String data ="";
			int lineNum = 0;
			//더 이상 데이터가 없으면 null return
			while((data=br.readLine()) !=null) {
				System.out.println((++lineNum)+"\t"+data);
				
				//파일에 기록 하기
				bw.write(data+"\n");
				
				if(data.indexOf(keyword)>-1) {
					++keywordCount;
				}
			}
		}catch(IOException e) {
			LOG.debug("---------------------------");
			LOG.debug("-"+e.getMessage());
			LOG.debug("---------------------------");
		}
		System.out.println();
		System.out.println("==============================");
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
		int fileCnt =0;
		for(File file: fileList) {
			//파일+확장자가 자바만 읽기 : Ex05 DirectoryFile.java
			if(file.isFile()==true && file.getName().lastIndexOf(".java")>-1) {
				//File 목록
				printFileContents(file);
				
				//File 내용
				printJavaFileContents2(file);
				fileCnt++;
				//디렉토리
			}else if(file.isDirectory()) {
				//재귀호출
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