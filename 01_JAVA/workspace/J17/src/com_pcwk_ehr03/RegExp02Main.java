package com_pcwk_ehr03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com_pcwk_ehr_cmn.pcwLog;

public class RegExp02Main implements pcwLog{
	public static void main(String[] args) {
		String []data = {"bat","baby","bonus","cA","ca","co","c.","c"
				,"c0","c#","car","combat","count","date","disc"};
		String []pattern = {".*"
							,"c[a-z]*"
							,"c[a-zA]*"
							,"c[a-zA-Z0-9]*"
							,"c."
							,"c.*"
							,"c\\."	//\\. '.'문자를 찾는다
							,"c\\w"
							,"c\\d"
							,"[b|c].*"
							,"[b|c].{2}"
		};
		
		for(int i=0;i<pattern.length;i++) {
			Pattern p =Pattern.compile(pattern[i]);
			System.out.print("Pattern : "+pattern[i]+"결과:");
			
			for(int j=0;j<data.length;j++) {
				Matcher m = p.matcher(data[j]);
				
				if(m.matches()==true) {
					System.out.print(data[j]+",");
				}
			}
			System.out.println();
		}
	}
}
//Pattern : .*결과:bat,baby,bonus,cA,ca,co,c.,c,c0,c#,car,combat,count,date,disc,
//Pattern : c[a-z]*결과:ca,co,c,car,combat,count,
//Pattern : c[a-zA]*결과:cA,ca,co,c,car,combat,count,
//Pattern : c[a-zA-Z0-9]*결과:cA,ca,co,c,c0,car,combat,count,
//Pattern : c.결과:cA,ca,co,c.,c0,c#,
//Pattern : c.*결과:cA,ca,co,c.,c,c0,c#,car,combat,count,
//Pattern : c\.결과:c.,
//Pattern : c\w결과:cA,ca,co,c0,
//Pattern : c\d결과:c0,
//Pattern : [b|c].*결과:bat,baby,bonus,cA,ca,co,c.,c,c0,c#,car,combat,count,
//Pattern : [b|c].{2}결과:bat,car,
