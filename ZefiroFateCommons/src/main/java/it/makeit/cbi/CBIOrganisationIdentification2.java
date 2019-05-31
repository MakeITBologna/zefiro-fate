//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 03:00:47 PM CEST 
//


package it.makeit.cbi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CBIOrganisationIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBIOrganisationIdentification2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="BICOrBEI" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}AnyBICIdentifier"/>
 *           &lt;element name="Othr" type="{urn:CBI:xsd:CBIPaymentRequest.00.04.00}CBIGenericIdentification1"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBIOrganisationIdentification2", propOrder = {
    "bicOrBEI",
    "othr"
})
public class CBIOrganisationIdentification2 {

    @XmlElement(name = "BICOrBEI")
    protected String bicOrBEI;
    @XmlElement(name = "Othr")
    protected CBIGenericIdentification1 othr;

    /**
     * Gets the value of the bicOrBEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICOrBEI() {
        return bicOrBEI;
    }

    /**
     * Sets the value of the bicOrBEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICOrBEI(String value) {
        this.bicOrBEI = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link CBIGenericIdentification1 }
     *     
     */
    public CBIGenericIdentification1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBIGenericIdentification1 }
     *     
     */
    public void setOthr(CBIGenericIdentification1 value) {
        this.othr = value;
    }

}