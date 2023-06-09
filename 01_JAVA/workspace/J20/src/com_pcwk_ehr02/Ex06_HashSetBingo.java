package com_pcwk_ehr02;

import java.util.*;

public class Ex06_HashSetBingo {

	public static void main(String[] args) {
		//1. 1~25사이 난수 발생
		//2. 5개씩 출력 : 2차원 배열
		
		//HashSet생성
		Set set = new HashSet();
		
		//bingo 판
		int[][] bingoBoard = new int[5][5];
		
		for (int i=1;set.size()<25;i++) {	
			int n = (int)(Math.random()*25)+1;
			set.add(n+"");
			//System.out.print(n+",");
		}
		//System.out.println();
		
		//System.out.println(set);
		
		//Iterator사용
		Iterator<String> iter = set.iterator();
		
		for(int i=0;i<bingoBoard.length;i++) {
			for(int j=0;j<bingoBoard[i].length;j++) {
				bingoBoard[i][j] = Integer.valueOf(iter.next());
				if(bingoBoard[i][j]<10) {
					System.out.print(bingoBoard[i][j]+"  ");
				}else {
					System.out.print(bingoBoard[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
