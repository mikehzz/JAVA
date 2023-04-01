package com_pcwk_ehr08;

public class ParserMain {

	public static void main(String[] args) {
		Parseable parser = ParserManger.getParser("XML");
		parser.parse("XMLDocument.xml");
		
		System.out.println("===============");
		parser = ParserManger.getParser("HTML");
		parser.parse("htmlDocument.html");
	}

}
