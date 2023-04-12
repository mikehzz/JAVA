package com_pcwk_ehr05;

import java.net.*;
import java.io.*;

public class Ex05_Client {
	static final String IP = "192.168.0.141";
	static final int PORT = 1000;
	public static void main(String[] args) {
		System.out.println("서버에 연결 중 (Server IP : " + IP + " PORT : " + PORT);
		// 소켓 생성
		try {
			
			Socket socket = new Socket(IP, PORT);
			
			// 소켓의 입력 스트림 생성
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			// 서버에서 받은 데이터 출력
			String readMsg = dis.readUTF();
			System.out.println("서버에서 받은 메세지 : "+readMsg);
			System.out.println("연결 종료");
			
			// 스트림과 소켓 닫기
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			System.out.println("=============================================");
			System.out.println("UnknownHostException : " + e.getMessage());
			System.out.println("=============================================");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("=============================================");
			System.out.println("IOException : " + e.getMessage());
			System.out.println("=============================================");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("=============================================");
			System.out.println("Exceptions : " + e.getMessage());
			System.out.println("=============================================");
			e.printStackTrace();
		}
		System.out.println("=============================================");
		System.out.println(" 프로그램 종료 ");
		System.out.println("=============================================");
	}
}