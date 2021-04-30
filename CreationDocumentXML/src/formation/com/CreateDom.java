package formation.com;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateDom {
	public static void main(String[] args) {
		try {
			// Create instance of DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// Get the DocumentBuilder
			DocumentBuilder docBuilder = factory.newDocumentBuilder();
			// Create blank DOM Document
			Document doc = docBuilder.newDocument();
			// create the root element
			Element root = doc.createElement("root");
			// All it to the xml tree
			doc.appendChild(root);
			// create a comment
			Comment comment = doc.createComment("This is comment");
			// add in the root element
			root.appendChild(comment);
			// create a element
			Element childElement = doc.createElement("Child");
			Element childElement1 = doc.createElement("nom");
			// Add the attribute to the child
			childElement.setAttribute("attribute1", "the value of Attribute 1");
			childElement1.setTextContent("Toto");
			root.appendChild(childElement);
			root.appendChild(childElement1);
			TransformerFactory tranFactory = TransformerFactory.newInstance();
			Transformer aTransformer = tranFactory.newTransformer();
			Source src = new DOMSource(doc);
			Result dest = new StreamResult(System.out);
			aTransformer.transform(src, dest);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
