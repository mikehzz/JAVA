package com_pcwk_ehr;

import java.io.FileWriter;
import java.io.IOException;

public class Ed_07_Throws {

	public static void main(String[] args) throws IOException {
		FileWriter fileW=new FileWriter("throws.txt");
		fileW.write("오늘은 즐거운 수요일!");
		fileW.close();

	}

}
