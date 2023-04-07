package com_pcwk_ehr09;

import java.io.*;

public class Ex07_DataInputStream {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\JAPA_0309\\01_JAVA\\workspace\\J22\\pcwkSample.dat");
				DataInputStream dis = new DataInputStream(fis);)
		{		
			//기록한 순서대로 데이터 읽기
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
		}catch(IOException e) {
			System.out.println("=================");
			System.out.println("=IOException="+e.getMessage());
			System.out.println("=================");
		}
	}
}
//true
//123
//A
//23
//10.0