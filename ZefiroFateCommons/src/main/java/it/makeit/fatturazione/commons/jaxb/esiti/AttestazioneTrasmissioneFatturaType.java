//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.11.06 alle 09:16:53 AM CET 
//


package it.makeit.fatturazione.commons.jaxb.esiti;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AttestazioneTrasmissioneFattura_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AttestazioneTrasmissioneFattura_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificativoSdI" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}IdentificativoSdI_Type"/>
 *         &lt;element name="NomeFile" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}NomeFile_Type"/>
 *         &lt;element name="DataOraRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RiferimentoArchivio" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}RiferimentoArchivio_Type" minOccurs="0"/>
 *         &lt;element name="Destinatario" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}Destinatario_Type"/>
 *         &lt;element name="MessageId" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}MessageId_Type"/>
 *         &lt;element name="PecMessageId" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}PecMessageId_Type" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashFileOriginale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versione" use="required" type="{http://www.fatturapa.gov.it/sdi/messaggi/v1.0}Versione_Type" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttestazioneTrasmissioneFattura_Type", namespace = "http://www.fatturapa.gov.it/sdi/messaggi/v1.0", propOrder = {
    "identificativoSdI",
    "nomeFile",
    "dataOraRicezione",
    "riferimentoArchivio",
    "destinatario",
    "messageId",
    "pecMessageId",
    "note",
    "hashFileOriginale",
    "signature"
})
public class AttestazioneTrasmissioneFatturaType {

    @XmlElement(name = "IdentificativoSdI", required = true)
    protected BigInteger identificativoSdI;
    @XmlElement(name = "NomeFile", required = true)
    protected String nomeFile;
    @XmlElement(name = "DataOraRicezione", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraRicezione;
    @XmlElement(name = "RiferimentoArchivio")
    protected RiferimentoArchivioType riferimentoArchivio;
    @XmlElement(name = "Destinatario", required = true)
    protected DestinatarioType destinatario;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "PecMessageId")
    protected String pecMessageId;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "HashFileOriginale", required = true)
    protected String hashFileOriginale;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versione", required = true)
    protected String versione;

    /**
     * Recupera il valore della proprietà identificativoSdI.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificativoSdI() {
        return identificativoSdI;
    }

    /**
     * Imposta il valore della proprietà identificativoSdI.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificativoSdI(BigInteger value) {
        this.identificativoSdI = value;
    }

    /**
     * Recupera il valore della proprietà nomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Imposta il valore della proprietà nomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Recupera il valore della proprietà dataOraRicezione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraRicezione() {
        return dataOraRicezione;
    }

    /**
     * Imposta il valore della proprietà dataOraRicezione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraRicezione(XMLGregorianCalendar value) {
        this.dataOraRicezione = value;
    }

    /**
     * Recupera il valore della proprietà riferimentoArchivio.
     * 
     * @return
     *     possible object is
     *     {@link RiferimentoArchivioType }
     *     
     */
    public RiferimentoArchivioType getRiferimentoArchivio() {
        return riferimentoArchivio;
    }

    /**
     * Imposta il valore della proprietà riferimentoArchivio.
     * 
     * @param value
     *     allowed object is
     *     {@link RiferimentoArchivioType }
     *     
     */
    public void setRiferimentoArchivio(RiferimentoArchivioType value) {
        this.riferimentoArchivio = value;
    }

    /**
     * Recupera il valore della proprietà destinatario.
     * 
     * @return
     *     possible object is
     *     {@link DestinatarioType }
     *     
     */
    public DestinatarioType getDestinatario() {
        return destinatario;
    }

    /**
     * Imposta il valore della proprietà destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinatarioType }
     *     
     */
    public void setDestinatario(DestinatarioType value) {
        this.destinatario = value;
    }

    /**
     * Recupera il valore della proprietà messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Imposta il valore della proprietà messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Recupera il valore della proprietà pecMessageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPecMessageId() {
        return pecMessageId;
    }

    /**
     * Imposta il valore della proprietà pecMessageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPecMessageId(String value) {
        this.pecMessageId = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà hashFileOriginale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashFileOriginale() {
        return hashFileOriginale;
    }

    /**
     * Imposta il valore della proprietà hashFileOriginale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashFileOriginale(String value) {
        this.hashFileOriginale = value;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Recupera il valore della proprietà versione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        if (versione == null) {
            return "1.0";
        } else {
            return versione;
        }
    }

    /**
     * Imposta il valore della proprietà versione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

}
