package com_pcwk_ehr04;

import java.math.BigInteger;

import com_pcwk_ehr_cmn.pcwLog;

public class BigIntegerMain implements pcwLog{

	public static void main(String[] args) {
		//Long이 표현 함수 최대값
		
		LOG.debug("Long.MAX_VALUE="+Long.MAX_VALUE);//Long.MAX_VALUE=9223372036854775807
		LOG.debug((""+Long.MAX_VALUE).length());//19자리
		
		int i = 2_000_000_000;//20억
		BigInteger num01 = new BigInteger("9223372036854775807");
		BigInteger num02 = new BigInteger("1000000000000000000");
		
		BigInteger result01 = num01.add(num02);
		BigInteger result02 = num01.subtract(num02);
		BigInteger result03 = num01.multiply(num02);
		BigInteger result04 = num01.divide(num02);
		
		
		LOG.debug("num01.add(num02)="+result01);
		LOG.debug("num01.subtract(num02)="+result02);
		LOG.debug("num01.multiply(num02)="+result03);
		LOG.debug("num01.divide(num02)="+result04);
		LOG.debug("=================================");
		LOG.debug("BigInteger.ZERO ="+BigInteger.ZERO);
		LOG.debug("BigInteger.TEN ="+BigInteger.TEN);
		
		
	}
}
//[2023-03-31 14:36:03] DEBUG pcwLog.main(BigIntegerMain.java:12) - Long.MAX_VALUE=9223372036854775807
//[2023-03-31 14:36:03] DEBUG pcwLog.main(BigIntegerMain.java:13) - 19
//[2023-03-31 14:36:03] DEBUG pcwLog.main(BigIntegerMain.java:23) - num01.add(num02)=10223372036854775807
//[2023-03-31 14:36:03] DEBUG pcwLog.main(BigIntegerMain.java:24) - num01.subtract(num02)=8223372036854775807
//[2023-03-31 14:36:03] DEBUG pcwLog.main(BigIntegerMain.java:25) - num01.multiply(num02)=9223372036854775807000000000000000000