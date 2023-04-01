package com_pcwk_ehr03;

import com_pcwk_ehr_cmn.pcwLog;

public class Ed_01_StringMain implements pcwLog{
	//static final Logger LOG = LogManager.getLogger(Ed_01_StringMain.class);
	
	public static void main(String[] args) {
		String fullName = "hello.java";
		
		LOG.debug(fullName.indexOf("."));
		
		//파일에서 특정 위치 잘라내기
		//확정자
		//'.'을 앞에서 부터 찾아온다.
		int idx = fullName.indexOf(".");
		String ext = fullName.substring(idx+1);
		
		//파일이름 : substring(from,to)
		//from<=fullName<to
		
		String fileName = fullName.substring(0, idx);
		LOG.debug("파일명:"+fileName);
		
		//파일 이름에 '.' 이 올 수 있다. -> H.ello.txt 
		//'.' 위에서 부터 찾아야 한다.
		String fullName02 = "h.ello.java";

		int idx02 = fullName02.lastIndexOf(".");//'.'위에서 부터 찾는 함수
		String ext02 = fullName02.substring(idx02+1);
		
		LOG.debug("확정자 :"+ext02);
		
	}
}
