package com_pcwk_ehr02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassMain {
	static final Logger LOG = LogManager.getLogger(ClassMain.class);
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Book c01 = new Book("돈의 속성", 16800);
		Book c02 = Book.class.newInstance();
		
		Class cobj = c01.getClass();
		
		LOG.debug("c01="+c01.toString());
		LOG.debug("==================");
		LOG.debug("c02="+c02);
		LOG.debug("==================");
		LOG.debug("cobj.getName()="+cobj.getName());
		LOG.debug("cobj.tostring()="+cobj.toString());
		
		
	}
}
