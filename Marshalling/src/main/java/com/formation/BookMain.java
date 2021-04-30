package com.formation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class BookMain {
	private static final String BOOKSTORE_XML = "books.xml";

	public static void main(String[] args) throws JAXBException {
		List<Book> bookList = new ArrayList<Book>();
		//create books
		Book book1 = new Book();
		book1.setIsbn("978-0060554736");
		book1.setAuthor("Neil Strauss");
		book1.setPublisher("Harpercollins");
		
		bookList.add(book1);
		
		Book book2 = new Book();
		book2.setIsbn("978-3832180577");
		book2.setName("Feuchtgebiete");
		book2.setAuthor("Charlotte Roche");
		book2.setPublisher("Dumont Buchverlag");
		
		bookList.add(book2);

		//Create BookStore
		Bookstore bookstore = new Bookstore();
		bookstore.setName("Librairie 4 vents");
		bookstore.setLocation("Lorient");
		bookstore.setBooklist(bookList);
		
		
		//Jaxb context et intanciate marshaller
		JAXBContext context = JAXBContext.newInstance(Bookstore.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		//Write to system.out
		m.marshal(bookstore, System.out);
		//write to File
		m.marshal(bookstore, new File(BOOKSTORE_XML));
		
	}

}
