package com_pcwk_ehr07;

import org.apache.logging.log4j.core.util.Loader;

import com_pcwk_ehr_cmn.pcwLog;

public class WrapperMain implements pcwLog {
	public static void main(String[] args) {
		Integer iValue = new Integer(23);
		Integer sValue = new Integer(23);
		
		LOG.debug("1value = "+iValue);
		LOG.debug("sValues="+ sValue);
		
		//재표형이름+Value
		int myIntValue = iValue.intValue();
		
		LOG.debug("myIntValue"+myIntValue);
		LOG.debug("Integer.MAX_VALUE:"+Integer.MAX_VALUE);             
		LOG.debug("Integer.MIN_VALUE:"+Integer.MIN_VALUE);            

		LOG.debug("integer는"+Integer.BYTES+"byte");
		LOG.debug("integer는"+Integer.SIZE+"bit");
		
		LOG.debug("========================");
		Long IValue = new Long(25);
		Long sIValue = new Long("25");
		
		Long myLongValue = IValue.longValue();

		LOG.debug("myLongValue"+myIntValue);
		
		
		LOG.debug("Long.Max_VALUE:"+Long.MAX_VALUE);
		
		
		
		
		
	}
}
