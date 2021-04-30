package com.formation;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.formation.jaxb")
public class Bookstore {

	// pas de getter
	@XmlElementWrapper(name = "booklist") //wrapper
	@XmlElement(name="book") //nom de l'attribut
	private List<Book> booklist;
	
	
	private String name;
	private String location;

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
