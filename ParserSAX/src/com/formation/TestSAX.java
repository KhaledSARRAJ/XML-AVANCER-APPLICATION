package com.formation;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class TestSAX {
	public static void main(String[] args) {
		try {
		File inputFile = new File("personnes.xml");
		SAXParserFactory factory = SAXParserFactory.newInstance();	
		SAXParser saxParser = factory.newSAXParser();
		PersonneHandler userhandler = new PersonneHandler();
		saxParser.parse(inputFile, userhandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
