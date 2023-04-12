package com_pcwk_ehr09;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class Client {
	
	static final int PORT = 6425;
	static final String SERVER_IP = "192.168.0.9";
	static final String USER = "hz.kim";
	
	public static void main(String[] args) {
		
		try {
			// 소켓 생성
			Socket socket = new Socket(SERVER_IP, PORT);
			
			System.out.println("서버 접속");
			
			// 수신 및 송신 객체 생성
			Sender sd = new Sender(socket, USER);
			Receiver rv = new Receiver(socket);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}