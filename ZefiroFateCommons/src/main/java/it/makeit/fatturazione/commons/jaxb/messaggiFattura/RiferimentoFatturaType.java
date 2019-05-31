//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.27 alle 12:00:35 PM CET 
//


package it.makeit.fatturazione.commons.jaxb.messaggiFattura;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per RiferimentoFattura_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RiferimentoFattura_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroFattura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0}NumeroFattura_Type"/>
 *         &lt;element name="AnnoFattura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0}AnnoFattura_Type"/>
 *         &lt;element name="PosizioneFattura" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiferimentoFattura_Type", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0", propOrder = {
    "numeroFattura",
    "annoFattura",
    "posizioneFattura"
})
public class RiferimentoFatturaType {

    @XmlElement(name = "NumeroFattura", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String numeroFattura;
    @XmlElement(name = "AnnoFattura", required = true)
    protected BigInteger annoFattura;
    @XmlElement(name = "PosizioneFattura")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger posizioneFattura;

    /**
     * Recupera il valore della proprietà numeroFattura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFattura() {
        return numeroFattura;
    }

    /**
     * Imposta il valore della proprietà numeroFattura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFattura(String value) {
        this.numeroFattura = value;
    }

    /**
     * Recupera il valore della proprietà annoFattura.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnoFattura() {
        return annoFattura;
    }

    /**
     * Imposta il valore della proprietà annoFattura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnoFattura(BigInteger value) {
        this.annoFattura = value;
    }

    /**
     * Recupera il valore della proprietà posizioneFattura.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosizioneFattura() {
        return posizioneFattura;
    }

    /**
     * Imposta il valore della proprietà posizioneFattura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosizioneFattura(BigInteger value) {
        this.posizioneFattura = value;
    }

}
