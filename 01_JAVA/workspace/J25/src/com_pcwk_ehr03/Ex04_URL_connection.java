package com_pcwk_ehr03;
import java.net.*;
import java.nio.Buffer;
import java.io.*;

public class Ex04_URL_connection {
	static final String acorn = "https://www.acorncampus.co.kr/business/it-job-training.jsp?seq=214";
	public static void main(String[] args) {
		
		try{
			URL url = new URL(acorn);
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			
//			바이트 기반에 스트림을 문자기반 스트림으로 처리해 주는 역할을 한다.
//			바이트 기반 스트림의 데이터를 지정된 인코딩의 문자데이터로 변환하는 작업을 수행한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = "";
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			 
			br.close();
		}catch(IOException e) {
			System.out.println("===================");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("===================");
			e.printStackTrace();
			
		}
		
	}

}
