package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.*;
import java.util.ArrayList;

import javax.print.attribute.HashAttributeSet;

public class Ex04_HashSet  {
	public static void main(String[] args) {
		
	
	String[] strArray = {"Alice","bob","Charlie","Bob","이상무"
			,"홍길동", "이상무"};
	Set<String> names = new HashSet<>();
	
	// set 요소 추가
	for(String str : strArray) {
		names.add(str);
	}
	
	//순서 보장 안됨, 데이터 중복 불허
	System.out.println("names :"+names);

	}
}