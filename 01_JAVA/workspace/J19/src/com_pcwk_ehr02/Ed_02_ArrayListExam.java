package com_pcwk_ehr02;

import java.util.Scanner;
import java.util.ArrayList;
import com_pcwk_ehr_cmn.pcwLog;

public class Ed_02_ArrayListExam implements pcwLog {

	public static void main(String[] args) {
		//5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후에 이들 중 "김"씨 성을 가진 사람을 모두 출력하세요.
		//1. 5입력 받기
		//2. ArrayList에 추가
		//3. ArrayList에서 김씨 찾기
		
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int cnt = 0;
		final int CNT = 5;
		for(int i=0;i<CNT;i++) {
			System.out.print("이름을 입력 하세요>");
			String name = scanner.nextLine();
			list.add(name);
			LOG.debug("name : "+name);
		}
		//list 확인
		for(int j=0;j<list.size();j++) {
			String name = (String) list.get(j);
			
			//이름 중에 김씨 성을 가진사람 출력
			if(name.startsWith("김")) {
				cnt++;
				System.out.println("name :"+name);
			}
			
		}
		
		System.out.printf("김씨 성을 가진 사람은 총 %d명 입니다.",cnt);
	}
}