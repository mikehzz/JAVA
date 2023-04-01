package com_pcwk_ehr02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * import문 정리 : ctrl + shift + o 
 * 소스코드 정리(정렬) : ctrl + shift + f
 * 
 * @author hbi
 *
 */
public class ImportTestMain {

	public static int TO_DAY = 24;

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("today:" + today);
		System.out.println("오늘날짜:" + sdfDate.format(today));
		System.out.println("오늘시간:" + sdfTime.format(today));
	}

}
//today:Fri Mar 24 10:26:16 KST 2023
//오늘날짜:2023.03.24
//오늘시간:10:26:16 오전