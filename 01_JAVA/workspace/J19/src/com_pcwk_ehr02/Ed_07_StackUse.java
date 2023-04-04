package com_pcwk_ehr02;

import com_pcwk_ehr_cmn.pcwLog;
import java.util.Stack;

public class Ed_07_StackUse implements pcwLog {
	/**
	 * 가로가 일치하는지 여부
	 * @param str
	 * @return
	 */
	
	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		
		
		for(char c: str.toCharArray()) {
			LOG.debug(""+c);
			//여는 괄호가 발견되면 스택에 추가한다.
			//닫는 괄호가 발견되면 스택에서 제거한다.
			
			//숫자면 : continue
			if(c=='c'||c=='{'||c==')'||c=='}'||c==']') {
				if(c=='(' || c=='{' || c=='['){
					stack.push(c);
				}else if(c==')' && !stack.isEmpty() && stack.peek() =='(')	{
					stack.pop();
				}else if(c=='}' && !stack.isEmpty() && stack.peek() =='{')	{
					stack.pop();
				}else if(c==']' && !stack.isEmpty() && stack.peek() =='[')	{
					stack.pop();
				}else {
					return false;
				}
			}
		
		}
		
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		//수식에서 괄호 균형을 확인
		//{ [()] }
		//( (2+3) *1 ) +3
		
		//String expression  = "((2+3)*1)+3";
		String expression = "[{()}]";
		//수식에서 괄호 균형을 확인.
		if(isBalanced(expression)==true) {
			LOG.debug("괄호 일치 합니다.");
		}else {
			LOG.debug("괄호 불일치 합니다.");
		}
	
	}
}

