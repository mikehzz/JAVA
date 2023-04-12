package com_pcwk_ehr09;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class PcwkServer {
	static final int PORT = 5985;
	static final String USER = "kim";
	public static void main(String[] args) {
		Socket socket; // chatting 소켓
		ServerSocket serverSocket; // Client에 들어오는 인증
		try {
			// 서버 소켓 생성 : 포트번호 8765ik
			serverSocket = new ServerSocket(PORT);
			System.out.println("Server ready ... ");
			// 대화 소켓 생성
			socket = serverSocket.accept();
			// 수신 및 통신 객체생성
			Sender sd = new Sender(socket, USER);
			Receiver rv = new Receiver(socket);
			// 쓰레드 실행
			sd.start();
			rv.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}