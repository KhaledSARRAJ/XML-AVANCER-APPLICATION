package com.formation.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.formation.generated.Items;
import com.formation.generated.ObjectFactory;
import com.formation.generated.PurchaseOrderType;

public class AppTestXML {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance("com.formation.generated");
		ObjectFactory factory = new ObjectFactory();
		PurchaseOrderType type = factory.createPurchaseOrderType();
		type.setComment("comment");
		Items items = factory.createItems();
		Items.Item o = factory.createItemsItem();
		Items.Item o1 = factory.createItemsItem();
		
		o.setPartNum("123");
		o.setComment("part comment 1");
		o.setProductName("ordinateur");
		o.setQuantity(2);
		items.getItem().add(o);
		
		o1.setPartNum("456");
		o1.setComment("part comment 2");
		o1.setProductName("phone");
		o1.setQuantity(3);
		items.getItem().add(o1);
		
		type.setItems(items);
		JAXBElement<PurchaseOrderType> element = factory.createPurchaseOrder(type);
		Marshaller m = jc.createMarshaller() ;
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(element, System.out);
		
	}

}
