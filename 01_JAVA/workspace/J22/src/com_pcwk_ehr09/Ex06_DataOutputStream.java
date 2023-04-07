package com_pcwk_ehr09;
import java.io.*;

public class Ex06_DataOutputStream {

	public static void main(String[] args) {
		
		//16진수로 기본형 데이터가 기록된다.
		
		try (FileOutputStream fos = new FileOutputStream("pcwkSample.dat");
				DataOutputStream dos = new DataOutputStream(fos);)
		{
			boolean booleanValue = true;
			byte byteValue		 = 123;
			char charValue		 = 'A';
			int intValue		 = 23;
			double doubleValue	 =10;
			
			dos.writeBoolean(booleanValue);
			dos.writeByte(byteValue);
			dos.writeChar(charValue);
			dos.writeInt(intValue);
			dos.writeDouble(doubleValue);
			
		}catch(IOException e) {
			System.out.println("==================");
			System.out.println("====IOException==="+e.getMessage());
			System.out.println("==================");
		}
		System.out.println("프로그램 종료 : F5");
	}

}