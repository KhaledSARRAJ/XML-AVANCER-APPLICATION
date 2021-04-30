package com.formation;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PersonneParser {

	public static void main(String[] args) {

		try {
			// Création du fichier
			File inputFile = new File("personnes.xml");
			// Création du parseur
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			// chargement du fichier xml
			Document doc = dBuilder.parse(inputFile);

			// récuperation des noeuds
			doc.getDocumentElement().normalize();
			// Extraire l'élément racine
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			// Extraction des noeuds personne
			NodeList nList = doc.getElementsByTagName("personne");
			System.out.println("---------------------------------");

			// Pour chaque personne (Traitement)
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element)nNode;
					System.out.println("Identifiant : " + eElement.getAttribute("id"));
					System.out.println("Nom : " +eElement.getElementsByTagName("nom").item(0).getTextContent());			
					System.out.println("Prénom : " +eElement.getElementsByTagName("prenom").item(0).getTextContent());
					System.out.println("Musique : " +eElement.getElementsByTagName("musique").item(0).getTextContent());
					System.out.println("Note : " +eElement.getElementsByTagName("note").item(0).getTextContent());						
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
