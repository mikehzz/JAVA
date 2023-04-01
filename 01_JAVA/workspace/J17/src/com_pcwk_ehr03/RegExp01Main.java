package com_pcwk_ehr03;
import java.util.regex.*;

import com_pcwk_ehr_cmn.pcwLog;

public class RegExp01Main implements pcwLog{
	public static void main(String[] args) {
		String []data = {"bat","baby","bonus","cA","ca","co","c"
				,"c0","car","combat","count","date","disc"};
		//c시작하고 영문자 소문자를 0개이상 가지고 있는 단어 찾기
		Pattern p =Pattern.compile("c[a-z]");
		for(int i=0;i<data.length;i++) {
			// LOG.debug(data[i]);
			// 정규식으로 비교할 대상을 매개변수로 pattern Matcher()를 호출해
			// 돌려준다.
			Matcher m = p.matcher(data[i]);
			if(m.matches() == true) {
				LOG.debug(data[i]);
				
			}			
		}
	}
}