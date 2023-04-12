package com_pcwk_ehr09;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
public class Receiver extends Thread {
	Socket socket;
	DataInputStream dis;
	Receiver(Socket socket) {
		this.socket = socket;
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while (null != dis) {
			try {
				System.out.println(dis.readUTF());
			}catch(SocketException e) {
				System.out.println("끊김");
				dis = null;
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}