/**
 * 
 */
package com_pcwk_ehr;

import java.util.Scanner;

public class Ed_01_NestedIF {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String id = "";
		String passwd = "";
		String realpasswd=  "4321";
		
		System.out.print("아이디를 입력하세요 :");
		id = scanner.nextLine();		
		
		System.out.printf("id=%s\n", id);
		
		//id : java, passwd : 4321
		if(id.equalsIgnoreCase("java")) {
			System.out.println("id가 일치 합니다.");
			
			System.out.print("비밀번호를 입력하세요");
			passwd = scanner.nextLine();
			
			System.out.printf("passwd=%s\n", passwd);
			if(passwd.equals(realpasswd)) {
				System.out.println("비밀 번호가 일치합니다.");
				System.out.println("로그인 되었습니다.");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}			
		}
		else {
			System.out.println("아이디를 확인 하세요.");
		}
	}
}
