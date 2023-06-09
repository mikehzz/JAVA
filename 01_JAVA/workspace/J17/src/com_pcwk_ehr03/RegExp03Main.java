package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.regex.*;

public class RegExp03Main implements pcwLog {
	public static void main(String[] args) {
		String source = "HP:011-1234-5678, HOME:02-888-9544";
		String pattern = "(0[0-9]{1,2})-([0-9]{3,4})-(\\d{4})";
		
		Pattern p =Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i = 0;
		while(m.find()) {
			LOG.debug(++i+":"+m.group(1) //패턴  group(1)에 첫번째
			+", "+m.group(2)			 //패턴  group(2)에 두번째
			+", "+m.group(3)			 //패턴  group(3)에 두번째
			+"===>"+m.group()			 //패턴  group()전체
					);
		}
	}
}

//[2023-03-31 12:32:45] DEBUG pcwLog.main(RegExp03Main.java:17) - 1:011, 1234, 5678===>011-1234-5678
//[2023-03-31 12:32:45] DEBUG pcwLog.main(RegExp03Main.java:17) - 2:02, 888, 9544===>02-888-9544