package com.pcwk.ehr;

public class Ed01_Array {

	public static void main(String[] args) {
		int [] studentScore = new int[5];
		
		int i = 1;
		
		// 배열 요소(element)에 값 할당
		studentScore[0] = 77;
		studentScore[1] = 88;
		studentScore[i+1] = 89;
		studentScore[i+2] = 92;
		studentScore[4] = 95;
		
		// 배열 요소에 할당된 값 추출
		int tmpScore = studentScore[1];
		System.out.printf("tmpScore : %d%n",tmpScore);
		
		tmpScore = studentScore[1] + studentScore[2];
		System.out.printf("studentScore[1] + studentScore[2] = %d%n",tmpScore);
		
		// 배열의 범위 밖 접근 : error = ArrayIndexOutOfBoundsException: 6
		// System.out.println(studentScore[6]);
		
		// 배열이름.length : 배열의 크기
		System.out.printf("studentScore.length = %d%n",studentScore.length);
		
		// 배열 전체의 데이터 접근
		for(int a=0;a<5;a++) { //a<5 대신 a<studentScore.length 사용하기!
			System.out.printf("%d, studentScore[%d]=%d\n",a,a,studentScore[a]);
		}

	}

}
/*
tmpScore : 88
studentScore[1] + studentScore[2] = 177
studentScore.length = 5
0, studentScore[0]=77
1, studentScore[1]=88
2, studentScore[2]=89
3, studentScore[3]=92
4, studentScore[4]=95
*/