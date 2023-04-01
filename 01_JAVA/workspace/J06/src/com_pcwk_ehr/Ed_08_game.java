package com_pcwk_ehr;
import java.util.Scanner;

public class Ed_08_game {

	public static void main(String[] args) {
		//컴퓨터와 가위(1) 바위(2) 보(3) 하기
		int comData = (int)(Math.random()*3) + 1 ;//0.0~3.0
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위(1) 바위(2) 보(3)를 선택 하세요. :");
		int userData = scanner.nextInt();
		
		
		//comData  가위(1) 바위(2) 보(3)
		//userData 가위(1) 바위(2) 보(3)
		switch (userData-comData) {
		case 0:
			System.out.println("비겼습니다.\n");
			break;
		case -2: case 1 :
			System.out.println("당신이 이겼습니다.\n");
			break;
		default:
			System.out.println("당신이 졌습니다.\n");
			break;
		}
		System.out.printf("결과\n당신은 %d를 냈습니다.",userData);
		System.out.printf("컴퓨터는 %d를 냈습니다.", comData);
	}
}
