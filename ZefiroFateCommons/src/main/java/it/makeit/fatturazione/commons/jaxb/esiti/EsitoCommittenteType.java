//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.11.06 alle 09:16:53 AM CET 
//


package it.makeit.fatturazione.commons.jaxb.esiti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EsitoCommittente_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EsitoCommittente_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EC01"/>
 *     &lt;enumeration value="EC02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EsitoCommittente_Type", namespace = "http://www.fatturapa.gov.it/sdi/messaggi/v1.0")
@XmlEnum
public enum EsitoCommittenteType {


    /**
     * 
     * 						EC01 = ACCETTAZIONE
     * 					
     * 
     */
    @XmlEnumValue("EC01")
    EC_01("EC01"),

    /**
     * 
     * 						EC02 = RIFIUTO
     * 					
     * 
     */
    @XmlEnumValue("EC02")
    EC_02("EC02");
    private final String value;

    EsitoCommittenteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsitoCommittenteType fromValue(String v) {
        for (EsitoCommittenteType c: EsitoCommittenteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
