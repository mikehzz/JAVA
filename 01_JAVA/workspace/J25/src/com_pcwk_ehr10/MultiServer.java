package com_pcwk_ehr10;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Multi 채팅 서버
 * @author user
 *
 */
public class MultiServer {
	//client정보:동기화
	HashMap<String, DataOutputStream> clients;
	
	
	public MultiServer() {
		clients = new HashMap<>();
		
		//map동기화
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		
	}
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.socket = socket;
			
			try {
				//in/out stream 생성
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("====================");
				System.out.println("=IOException="+e.getMessage());
				System.out.println("====================");
			}
			
		}
		
		public void run() {
			//접속자 이름
			String name = "";
			try {
				name = in.readUTF();//client부터 이름 읽기
				
				//모두에게 신규 접속자 정보 전송
				sendToAll("*"+name+"님이 들어 오셨습니다.");
				clients.put(name, out);
				System.out.println("현재 접속자 수 "+clients.size()+" 입니다.");
				
				//채팅
				while(null != in) {
					//채팅 메시지를 모두에게 전송
					sendToAll(in.readUTF());
				}
				
			}catch(IOException e) {
				
			}finally {
				//접속 종료
				sendToAll("#"+name+"님이 나가셨습니다...");
				clients.remove(name);
				
				System.out.println("["+socket.getInetAddress()+"] 에서 접속을 종료했습니다.");
				System.out.println("현재 접속자 수"+clients.size()+" 입니다.");
			}
			
			
			
			
		}//--run()
		
	}//--ServerReceiver
	
	//모든 client에게 메시지 보내기
	public void sendToAll(String message) {
		Iterator<String> iter =clients.keySet().iterator();
		
		while(iter.hasNext()==true) {
			//HashMap<String, DataOutputStream>
			DataOutputStream out =clients.get(iter.next());
			try {
				out.writeUTF(message);
			} catch (IOException e) {
				System.out.println("===============");
				System.out.println("=IOException="+e.getMessage());
				System.out.println("===============");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		new MultiServer().start();
		
	}

}
