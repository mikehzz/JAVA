package com_pcwk_ehr;

public class Ed_01_StringArray {

	public static void main(String[] args) {
		String[] nameArray = {"Park", "Lee", "Kim"};
		
		//기존 for문
		for(int i=0;i<nameArray.length;i++) {
			System.out.printf("nameArray[%d] = %s\n", i, nameArray[i]);
		}
		
		System.out.println("=============================");
		
		String tmpName = nameArray[2];
		System.out.printf("tmpName[%d] = %s\n",2, tmpName);
		
		//배열 요소 '0'째에 있는 Park -> pak
		nameArray[0] = "Pak";//새로 정의
		nameArray[1] = new String("Lee2");//생성자
		
		System.out.println("=============================");
		//향상된 for : nameArray에서 순서대로 데이터를 하나씩 꺼내 String name에 전달,
		//더이상 꺼낼 데이터가 없으면 for문을 벗어난다.
		for(String name:nameArray) {
			System.out.println(name);
		}
		
		
		
	}
}
