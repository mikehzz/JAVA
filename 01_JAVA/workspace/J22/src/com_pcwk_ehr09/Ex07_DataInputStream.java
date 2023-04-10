package com_pcwk_ehr09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex07_DataInputStream {

	public static void main(String[] args) {

		String filePath = "C:\\JAPA_0309\\01_JAVA\\workspace\\Exam01\\src\\score.txt";
		String arr[] = null;
		try {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    arr = line.split(",");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println(arr);
		
		
		
		
		
	}
}
//true
//123
//A
//23
//10.0