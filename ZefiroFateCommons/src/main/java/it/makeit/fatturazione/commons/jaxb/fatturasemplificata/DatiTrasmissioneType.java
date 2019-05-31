//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.12.20 alle 06:32:39 PM CET 
//


package it.makeit.fatturazione.commons.jaxb.fatturasemplificata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Blocco relativo ai dati di trasmissione della Fattura Elettronica
 * 			
 * 
 * <p>Classe Java per DatiTrasmissioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiTrasmissioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdTrasmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IdFiscaleType"/>
 *         &lt;element name="ProgressivoInvio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String10Type"/>
 *         &lt;element name="FormatoTrasmissione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}FormatoTrasmissioneType"/>
 *         &lt;element name="CodiceDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CodiceDestinatarioType"/>
 *         &lt;element name="PECDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTrasmissioneType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "idTrasmittente",
    "progressivoInvio",
    "formatoTrasmissione",
    "codiceDestinatario",
    "pecDestinatario"
})
public class DatiTrasmissioneType {

    @XmlElement(name = "IdTrasmittente", required = true)
    protected IdFiscaleType idTrasmittente;
    @XmlElement(name = "ProgressivoInvio", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String progressivoInvio;
    @XmlElement(name = "FormatoTrasmissione", required = true)
    protected FormatoTrasmissioneType formatoTrasmissione;
    @XmlElement(name = "CodiceDestinatario", required = true)
    protected String codiceDestinatario;
    @XmlElement(name = "PECDestinatario")
    protected String pecDestinatario;

    /**
     * Recupera il valore della proprietà idTrasmittente.
     * 
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *     
     */
    public IdFiscaleType getIdTrasmittente() {
        return idTrasmittente;
    }

    /**
     * Imposta il valore della proprietà idTrasmittente.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *     
     */
    public void setIdTrasmittente(IdFiscaleType value) {
        this.idTrasmittente = value;
    }

    /**
     * Recupera il valore della proprietà progressivoInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    /**
     * Imposta il valore della proprietà progressivoInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressivoInvio(String value) {
        this.progressivoInvio = value;
    }

    /**
     * Recupera il valore della proprietà formatoTrasmissione.
     * 
     * @return
     *     possible object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public FormatoTrasmissioneType getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    /**
     * Imposta il valore della proprietà formatoTrasmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public void setFormatoTrasmissione(FormatoTrasmissioneType value) {
        this.formatoTrasmissione = value;
    }

    /**
     * Recupera il valore della proprietà codiceDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    /**
     * Imposta il valore della proprietà codiceDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDestinatario(String value) {
        this.codiceDestinatario = value;
    }

    /**
     * Recupera il valore della proprietà pecDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECDestinatario() {
        return pecDestinatario;
    }

    /**
     * Imposta il valore della proprietà pecDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECDestinatario(String value) {
        this.pecDestinatario = value;
    }

}
