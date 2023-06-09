package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.Stack;

public class Ed_06_Stack implements pcwLog {
	//
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("JAVA");
		stack.push("Database");
		stack.push("Html");
		stack.push("Css");
		stack.push("Javscript");
		stack.push("Jsp");
		
		LOG.debug("stack.pop() : " + stack.pop());
		LOG.debug("stack.peek() : " + stack.peek());
		
		LOG.debug("stack.empty() : " + stack.empty());
		LOG.debug("stack.search() : " + stack.search("Css"));//2

		LOG.debug("=======================================");
		//전체 데이터 처리
		while(!stack.empty()) {
			LOG.debug("stack.pop() :" + stack.pop());
		}
		
	}

}
