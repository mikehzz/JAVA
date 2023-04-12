package com_pcwk_ehr05;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ex05_Server {
	static final int PORT = 8888;
	public static String currentDate() {
		// 시간정보
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd :: HH:mm:ss");
		String currentDate = sdf.format(new Date());
		return currentDate;
	}
	public static void main(String[] args) {
		// 1. ServerSocket 생성
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			// 8888번으로 서버소켓을 생성, 소켓이 생성될때까지 대기중
			serverSocket = new ServerSocket(PORT);
			// 시간정보
			System.out.println(currentDate() + " : Waiting for Clients to connect ...");
			// infinity loop
			while (true) {
				// 서버소켓은 클라이언트 연결요청이 올때까지 실행을 멈추고, 계속 대기
				// 클라이언트의 연결요청이 오면 클라이언트와 통신할 새로운 소켓을 생성
				clientSocket = serverSocket.accept();
				System.out
						.println(currentDate() + "Client IP : " + clientSocket.getInetAddress() + " Client connected");
				// 입출력 스트림 생성
				os = clientSocket.getOutputStream();
				dos = new DataOutputStream(os);
				// client으로 메세지 전송
				dos.writeUTF("[N] Test Message from Server \n오늘은 수요일입니다");
				System.out.println(currentDate() + " 데이터를 Client로 전송했습니다");
				// 스트림과 소켓 닫기 (생성 역순서로 닫기)
				dos.close();
				clientSocket.close();
			}
		} catch (IOException e) {
			System.out.println("=============================================");
			System.out.println("IOException : " + e.getMessage());
			System.out.println("=============================================");
		}
	}
}