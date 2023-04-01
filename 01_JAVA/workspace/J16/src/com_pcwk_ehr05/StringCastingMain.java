package com_pcwk_ehr05;

import com_pcwk_ehr_cmn.pcwLog;

public class StringCastingMain implements pcwLog{

	public static void main(String[] args) {
		int age = 23;
		
		//int를 string으로 변환
		//방법1
		String strAge = age +"";
		System.out.printf("strAge=%s, int=%d\n",strAge,age);
		
		//방법2
		String strAge02 = String.valueOf(age);
		System.out.printf("strAge02=%s, int=%d\n",strAge02,age);
		
		double ageD = 23.25;
		
		String strAgeD = ageD + "";
		System.out.printf("strAgeD=%s, ageD=%f\n", strAgeD, ageD);
		
		double sum = Integer.parseInt(strAge) + Double.parseDouble(strAgeD);
		System.out.println("sum="+sum);
		
		String strSum = strAge +strAgeD;
		System.out.println("strSum="+strSum);
		
		sum = Integer.valueOf(strAge) + Double.valueOf(strAgeD);
		System.out.println("sum="+sum);


		
	}

}
