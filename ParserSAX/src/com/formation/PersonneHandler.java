package com.formation;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonneHandler extends DefaultHandler {
	boolean nom = false;
	boolean prenom = false;
	boolean musique = false;
	boolean note = false;

//Action à réaliser au début du document
	public void startDocument() {
		System.out.println("Debut du document");
	}

//Actions à réaliser lors de la détection d'un nouvel élément
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			String rolNo = attributes.getValue("rollno");
			System.out.println("Roll No :" + rolNo);
		} else if (qName.equalsIgnoreCase("nom")) {
			nom = true;
		} else if (qName.equalsIgnoreCase("prenom")) {
			prenom = true;
		} else if (qName.equalsIgnoreCase("musique")) {
			musique = true;
		} else if (qName.equalsIgnoreCase("note")) {
			note = true;
		}
	}

//Actions à réaliser lors de la détection de la fin d'un élément
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("personne")) {
			System.out.println("End Element: ========" + qName);
		}
	}

	// Actions à réaliser sur les données
	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		if (nom) {
			System.out.println("Nom: " + new String(ch, start, length));
			nom = false;
		} else if (prenom) {
			System.out.println("Prénom: " + new String(ch, start, length));
			prenom = false;
		} else if (musique) {
			System.out.println("Musique: " + new String(ch, start, length));
			musique = false;
		} else if (note) {
			System.out.println("Note: " + new String(ch, start, length));
			note = false;
		}
	}

	// Actions à réaliser lors de la fin du document XML
	public void endDocument() {
		System.out.println("Fin du document");
	}

}