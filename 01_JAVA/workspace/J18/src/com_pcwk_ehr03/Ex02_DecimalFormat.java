package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;
import java.text.DecimalFormat;

public class Ex02_DecimalFormat implements pcwLog{

	public static void main(String[] args) {
		double number = 12_345.6789;
		//#,###.## : 3째자리에서 반올림
		DecimalFormat df01 = new DecimalFormat("#,###.##");
		
		String formattedNumber01 = df01.format(number);
		
		LOG.debug("#,###.## =>"+formattedNumber01);
		
		//"00000.000"
		DecimalFormat df02 = new DecimalFormat("00000.000");
		
		String formattedNumber02 = df02.format(number);
		
		LOG.debug("00000.000 => "+formattedNumber02);
		
		//$#,###,###.##
		DecimalFormat df03 = new DecimalFormat("$#,###,###.##");
		
		String formattedNumber03 = df03.format(number);
		
		LOG.debug("$#,###,###.## => "+formattedNumber03);
		
		//\u00A4#,###,###.##
		DecimalFormat df04 = new DecimalFormat("\u00A4#,###,###.##");
		
		String formattedNumber04 = df04.format(number);
		
		LOG.debug("\\u00A4#,###,###.## => "+formattedNumber04);
		
	
	}

}
//[2023-04-03 14:36:55] DEBUG Ex02_DecimalFormat.main(Ex02_DecimalFormat.java:15) - #,###.## =>12,345.68
//[2023-04-03 14:36:55] DEBUG Ex02_DecimalFormat.main(Ex02_DecimalFormat.java:22) - 00000.000 => 12345.679
//[2023-04-03 14:36:55] DEBUG Ex02_DecimalFormat.main(Ex02_DecimalFormat.java:29) - $#,###,###.## => $12,345.68
//[2023-04-03 14:36:55] DEBUG Ex02_DecimalFormat.main(Ex02_DecimalFormat.java:36) - \u00A4#,###,###.## => ￦12,345.68