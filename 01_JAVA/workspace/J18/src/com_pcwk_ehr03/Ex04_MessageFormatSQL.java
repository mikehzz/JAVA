package com_pcwk_ehr03;

import java.text.*;
import com_pcwk_ehr_cmn.pcwLog;

public class Ex04_MessageFormatSQL implements pcwLog {

	public static void main(String[] args) {
		
		String tabName = "m_code";
		String sqlFormat = "INSERT INTO" + tabName + "VALUES ({0},''{1}'',''{2}'')";
		
		Object[][] addressBook = {
				{"1","이상무","010-1234-5678"},
				{"2","오동훈","010-1254-7852"},
				{"3","원수연","010-9564-4562"}
		};
		
		MessageFormat mf = new MessageFormat(sqlFormat);
		
		for(int i=0;i<addressBook.length;i++) {
			String result = mf.format(addressBook[i]);
			LOG.debug(result);
			
		}
		
	}

}
