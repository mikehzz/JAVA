package com_pcwk_ehr08;

public class ParserManger {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XmlParser(); 
		}else {//html
			htmlParser htmlP=new htmlParser();
			return htmlP;
		}
	}
}
