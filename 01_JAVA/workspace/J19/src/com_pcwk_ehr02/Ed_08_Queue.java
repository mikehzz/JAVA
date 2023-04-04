package com_pcwk_ehr02;

import java.util.LinkedList;
import java.util.Queue;

import com_pcwk_ehr_cmn.pcwLog;

public class Ed_08_Queue implements pcwLog {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();//int형 큐 선언
		
		//큐에 값 추가
		queue.add(12);
		queue.add(14);
		queue.add(17);
		queue.add(3);
		queue.add(23);

		

		LOG.debug("queue : "+queue);
		

		
		//제거
		queue.remove();//queue에 첫번째 값 제거
		LOG.debug("queue : "+queue);
		
		//queue에 첫번 째 값 참조 : 값이 제거되지 않는다.
		LOG.debug("peek : "+queue.peek());
		LOG.debug("peek : "+queue);

		//반복문
		Object qData = 0;
		while((qData = queue.poll()) !=null) {
			LOG.debug("qData : "+qData);
		}
		
	}

}
