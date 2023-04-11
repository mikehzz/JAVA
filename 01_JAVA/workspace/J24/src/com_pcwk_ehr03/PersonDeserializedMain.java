package com_pcwk_ehr03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com_pcwk_ehr_cmn.pcwLog;

public class PersonDeserializedMain implements pcwLog {

	public static void main(String[] args) {
		
		//역직렬화

		try(
			FileInputStream fis = new FileInputStream("pcwk_serial.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);) 
		{
			Person person01 = (Person)ois.readObject();
			Person person02 = (Person)ois.readObject();
			System.out.println("Person01:"+person01.toString());
			System.out.println("Person02:"+person02.toString());

		}catch(FileNotFoundException e) {
			LOG.debug("===================");
			LOG.debug("=FileNotFoundException"+e.getMessage());
			LOG.debug("===================");
		}catch(IOException e) {
			LOG.debug("===================");
			LOG.debug("=IOException"+e.getMessage());
			LOG.debug("===================");
		} catch (ClassNotFoundException e) {
			LOG.debug("===================");
			LOG.debug("=IOException"+e.getMessage());
			LOG.debug("===================");
		}
		

	}

}
