//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.30 à 02:16:56 PM CEST 
//


package com.formation.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Items complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="quantity"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;maxExclusive value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="USPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element ref="{}comment" minOccurs="0"/&gt;
 *                   &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="partNum" use="required" type="{}SKU" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Items", propOrder = {
    "item"
})
public class Items {

    protected List<Items.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Items.Item }
     * 
     * 
     */
    public List<Items.Item> getItem() {
        if (item == null) {
            item = new ArrayList<Items.Item>();
        }
        return this.item;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="quantity"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;maxExclusive value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="USPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element ref="{}comment" minOccurs="0"/&gt;
     *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="partNum" use="required" type="{}SKU" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "productName",
        "quantity",
        "usPrice",
        "comment",
        "shipDate"
    })
    public static class Item {

        @XmlElement(required = true)
        protected String productName;
        protected int quantity;
        @XmlElement(name = "USPrice", required = true)
        protected BigDecimal usPrice;
        protected String comment;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar shipDate;
        @XmlAttribute(name = "partNum", required = true)
        protected String partNum;

        /**
         * Obtient la valeur de la propriété productName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Définit la valeur de la propriété productName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Obtient la valeur de la propriété quantity.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Définit la valeur de la propriété quantity.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

        /**
         * Obtient la valeur de la propriété usPrice.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUSPrice() {
            return usPrice;
        }

        /**
         * Définit la valeur de la propriété usPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUSPrice(BigDecimal value) {
            this.usPrice = value;
        }

        /**
         * Obtient la valeur de la propriété comment.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Définit la valeur de la propriété comment.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Obtient la valeur de la propriété shipDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShipDate() {
            return shipDate;
        }

        /**
         * Définit la valeur de la propriété shipDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShipDate(XMLGregorianCalendar value) {
            this.shipDate = value;
        }

        /**
         * Obtient la valeur de la propriété partNum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartNum() {
            return partNum;
        }

        /**
         * Définit la valeur de la propriété partNum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartNum(String value) {
            this.partNum = value;
        }

    }

}
