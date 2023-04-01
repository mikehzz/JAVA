package com_pcwk_ehr04;

import com_pcwk_ehr_cmn.pcwLog;
import java.math.BigDecimal;

public class BigDecimalMain implements pcwLog {
	
	public static void main(String[] args) {
		BigDecimal num01 = new BigDecimal("123.456789");
		BigDecimal num02 = new BigDecimal("100.000001");
		
		LOG.debug("num01.add(num02)="+num01.add(num02));
		LOG.debug("num01.subtract(num02)="+num01.subtract(num02));
		LOG.debug("num01.multiply(num02)="+num01.multiply(num02));
		LOG.debug("num01.divide(num02)="+num01.divide(num02,2,BigDecimal.ROUND_CEILING));
		
	}
	
	
	
}
