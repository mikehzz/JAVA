package com_pcwk_ehr03;

import java.text.ChoiceFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex05_ChoiceFormat implements pcwLog{

	public static void main(String[] args) {
		
		try {
		//Scanner scanner=new Scanner(System.in);
		//System.out.print("점수를 입력 하세요.>");
		//double score = scanner.nextDouble();
		
		double [] limits = {0,60,70,80,90}; //작은것 부터 큰 데이터 순으로 입력
		String [] formats = {"F","D","C","B","A"};//limits,formats하고 배열수 일치
		
		int []scores = {55,66,77,88,99,100};
		
		//점수에 따른 학점
		ChoiceFormat choiceFormat= new ChoiceFormat(limits, formats);
		
		for(int score:scores) {
			System.out.printf("%d =%s \n",score,choiceFormat.format(score));
		}
		
		//System.out.println("score : "+score);
		//System.out.println("choiceFormat.format :"+choiceFormat.format(score));
		}catch(InputMismatchException e){
			System.out.println("============================");
			System.out.println("=점수를 입력 하세요. 제발=");
			System.out.println("============================");
			System.exit(0);
			
		}	
	}
}
//55 =F 
//66 =D 
//77 =C 
//88 =B 
//99 =A 
//100 =A 