package com_pcwk_ehr;

//Log4j2 lib
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Main {
	
	static final Logger LOG = LogManager.getLogger(Log4j2Main.class);
	
	public static void main(String[] args) {
		//FATAl>ERROR>WARN>INFO>DEBUG>TRACE
		LOG.trace("trace");
		LOG.debug("debug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("error");
		LOG.fatal("fatal");
	
	}
}
