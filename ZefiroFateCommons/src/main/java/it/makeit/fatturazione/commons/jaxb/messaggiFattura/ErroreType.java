//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.27 alle 12:00:35 PM CET 
//


package it.makeit.fatturazione.commons.jaxb.messaggiFattura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Errore_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Errore_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0}CodiceErrore_Type"/>
 *         &lt;element name="Descrizione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0}Descrizione_Type"/>
 *         &lt;element name="Suggerimento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0}Suggerimento_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Errore_Type", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fattura/messaggi/v1.0", propOrder = {
    "codice",
    "descrizione",
    "suggerimento"
})
public class ErroreType {

    @XmlElement(name = "Codice", required = true)
    protected String codice;
    @XmlElement(name = "Descrizione", required = true)
    protected String descrizione;
    @XmlElement(name = "Suggerimento", required = true)
    protected String suggerimento;

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà suggerimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggerimento() {
        return suggerimento;
    }

    /**
     * Imposta il valore della proprietà suggerimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggerimento(String value) {
        this.suggerimento = value;
    }

}
