package com.formation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;



public class BookMain {
	private static final String BOOKSTORE_XML = "src/main/resources/books.xml";

	public static void main(String[] args) throws JAXBException , FileNotFoundException{

		//create JAXB contxt and unmarshaller
		
		var context =JAXBContext.newInstance(Bookstore.class);
		
		var um = context.createUnmarshaller();
		var bookstore = (Bookstore)um.unmarshal(new InputStreamReader(
				new FileInputStream(BOOKSTORE_XML),StandardCharsets.UTF_8));
		
		var bookList =bookstore.getBooklist();
		bookList.forEach((book) -> {
			System.out.println(book);
		});
		
	}

}
