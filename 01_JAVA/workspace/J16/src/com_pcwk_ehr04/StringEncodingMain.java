package com_pcwk_ehr04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com_pcwk_ehr_cmn.pcwLog;

public class StringEncodingMain implements pcwLog{
	public static void main(String[] args) {
		
		String str = "가";
		try {
			byte[] utf8ByteArray = str.getBytes("UTF-8"); //가 UTF-8 인코딩
			byte[] cp9498ByteArray = str.getBytes("CP949"); //가 UTF-8 인코딩
			
			//3byte
			LOG.debug("가 UTF-8 인코딩 : "+Arrays.toString(utf8ByteArray));
			//decoding
			LOG.debug("가 UTF-8 인코딩 : "+new String(utf8ByteArray), "UTF-8");
			
			
			
			//2byte
			LOG.debug("가 CP949 인코딩 : "+Arrays.toString(cp9498ByteArray));
			//decoding
			LOG.debug("가 CP949 디코딩 : "+new String(cp9498ByteArray), "CP949");
			//한글 깨짐
			LOG.debug("가 CP949 디코딩 : "+new String(cp9498ByteArray), "UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			LOG.debug("===========================");
			LOG.debug("UnsupportedEncodingException="+e.getMessage());
			LOG.debug("===========================");
		}
		
		
		
	}
}
