package com_pcwk_ehr05;

import com_pcwk_ehr_cmn.pcwLog;

public class Ex01_EnumMain implements pcwLog{

	public static void main(String[] args) {
		int score = 88;
		
		for(Grade grade: Grade.values()) {
			if(score >= grade.getMinScore()) {
				LOG.debug(grade.getName()+","+grade.getMinScore());
				break;
			}
		}
		
	}

}
