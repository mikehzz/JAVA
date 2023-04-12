package com_pcwk_ehr09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Sender extends Thread {
	Socket socket;
	DataOutputStream dos;	// 외부로 전송
	String name;	// 이름
	
	/**
	 * @param socket
	 */
	public Sender(Socket socket, String name) {
		super();
		this.socket = socket;
		this.name = name;
		
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			name +=" "+socket.getInetAddress()+" : "+socket.getPort();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// 콘솔 키보드 입력
		Scanner scanner = new Scanner(System.in);
		
		while(null != dos) {
			try {
				// 상대방에게 전송
				dos.writeUTF(name+">"+scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}