package com_pcwk_ehr11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4J2Main {
	static final Logger LOG = LogManager.getLogger(Log4J2Main.class);
	public static void main(String[] args) {
		LOG.debug("debug");
		LOG.info("info");
		LOG.error("error");
		
		
	}
}
