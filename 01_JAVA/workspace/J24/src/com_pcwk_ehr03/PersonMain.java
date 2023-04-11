package com_pcwk_ehr03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com_pcwk_ehr_cmn.pcwLog;

public class PersonMain implements pcwLog{

	public static void main(String[] args) {
		Person person01 = new Person("Bob",24);
		Person person02 = new Person("A",22);
		
		//객체 직렬화, 파일에 기록
		try (FileOutputStream fis = new FileOutputStream("pcwk_serial.ser");
			 ObjectOutputStream oos = new ObjectOutputStream(fis);
				){
			oos.writeObject(person01);
			oos.writeObject(person02);
			
		}catch (FileNotFoundException e) {
			LOG.debug("===============");
			LOG.debug("=FileNotFoundException"+e.getMessage());
			LOG.debug("===============");
		}catch(IOException e) {
			LOG.debug("===============");
			LOG.debug("=IOException"+e.getMessage());
			LOG.debug("===============");
		}
		
		LOG.debug("파일 생성 완료");
		
		
		
		
	}

}
