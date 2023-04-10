package com_pcwk_ehr05;

import java.io.File;
import java.io.IOException;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex05_File implements pcwLog {
	public static void main(String[] args) {
		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr05\\Ex05_File.java";
		// 파일객체 생성
		File file = new File(filePath);
		// 파일 생성
		try {
			if (true == file.createNewFile()) {
				LOG.debug("파일 생성!");
			} else {
				LOG.debug("파일 생성 실패!");
			}
		} catch (IOException e) {
			LOG.debug("====================");
			LOG.debug("-IOException-" + e.getMessage());
			LOG.debug("====================");
		}
		// 파일 삭제
		if (true == file.delete()) {
			LOG.debug("파일 삭제 성공!");
		} else {
			LOG.debug("파일 삭제 실패!");
		}
		
		//디렉토리 생성
		String dir = "C:\\Users\\User\\Desktop\\2023년 에이콘\\USB\\JSPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr99";
		File dirFile = new File(dir);
		if(dirFile.mkdir()) {
			System.out.println("디렉토리 생성 성공");
		}else {
			System.out.println("디렉토리 생성 실패");
		}
		//디렉토리 rename
		dir = "C:\\Users\\User\\Desktop\\2023년 에이콘\\USB\\JSPA_0309\\01_JAVA\\workspace\\J23\\src\\com_pcwk_ehr205";
		File newDir = new File(dir);
		if(dirFile.renameTo(newDir) == true) {
			System.out.println("디렉토리 이름 변경!");
		}
		
	}
}