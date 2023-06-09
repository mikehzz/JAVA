package com_pcwk_ehr;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;

public class Ex01QueueHistory implements pcwLog {
	static final int MAX_SIZE = 5; //Queue최대 5개 명령어 저장
	public static void main(String[] args) {
		//Command History를 Queue로 생성
		//명령어 History크기 (5)
		//1. Queue : command를 5개 저장
		//2. Scanner통한 입력
		//3. Quit입력 하면 종료
		Queue<String> history = new LinkedList<String>();//명령어 저장
		Scanner scanner = new Scanner(System.in);
		
		//명령어 무한 loop : Quit명령어 입력 전까지
		while(true) {
			System.out.print(">>");
			String command = scanner.nextLine();
			if (command.equalsIgnoreCase("Quit")) {
				break;
			}
			
			//명령어 저장
			history.add(command);
			
			//5개 이상이면 명령어 삭제
			if(history.size()> MAX_SIZE) {
				System.out.println(history.remove());
			}
			System.out.println("최근 History"+history);
		}
		LOG.debug("┌=======================┐");
		LOG.debug("┃==========종료==========┃");
		LOG.debug("└=======================┘");
		scanner.close();
		
	}
}