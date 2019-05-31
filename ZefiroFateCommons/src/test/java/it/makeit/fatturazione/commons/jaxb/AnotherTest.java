package it.makeit.fatturazione.commons.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import it.makeit.fatturazione.commons.jaxb.esiti.EsitoCommittenteType;
import it.makeit.fatturazione.commons.jaxb.esiti.ScartoEsitoCommittenteType;
import it.makeit.fatturazione.commons.jaxb.esiti.ScartoType;
import it.makeit.fatturazione.commons.jaxb.fattura.Art73Type;
import it.makeit.fatturazione.commons.jaxb.fattura.BolloVirtualeType;
import it.makeit.fatturazione.commons.jaxb.fattura.CausalePagamentoType;
import it.makeit.fatturazione.commons.jaxb.fattura.CondizioniPagamentoType;
import it.makeit.fatturazione.commons.jaxb.fattura.EsigibilitaIVAType;
import it.makeit.fatturazione.commons.jaxb.fattura.FatturaElettronica;
import it.makeit.fatturazione.commons.jaxb.fattura.FormatoTrasmissioneType;
import it.makeit.fatturazione.commons.jaxb.fattura.ModalitaPagamentoType;
import it.makeit.fatturazione.commons.jaxb.fattura.NaturaType;
import it.makeit.fatturazione.commons.jaxb.fattura.RegimeFiscaleType;
import it.makeit.fatturazione.commons.jaxb.fattura.RitenutaType;
import it.makeit.fatturazione.commons.jaxb.fattura.SocioUnicoType;
import it.makeit.fatturazione.commons.jaxb.fattura.SoggettoEmittenteType;
import it.makeit.fatturazione.commons.jaxb.fattura.StatoLiquidazioneType;
import it.makeit.fatturazione.commons.jaxb.fattura.TipoCassaType;
import it.makeit.fatturazione.commons.jaxb.fattura.TipoCessionePrestazioneType;
import it.makeit.fatturazione.commons.jaxb.fattura.TipoDocumentoType;
import it.makeit.fatturazione.commons.jaxb.fattura.TipoRitenutaType;
import it.makeit.fatturazione.commons.jaxb.fattura.TipoScontoMaggiorazioneType;

public class AnotherTest {

	@Test
    public void postFEBean() {
        
        String json = "{\r\n" + 
                "    \"fatturaElettronicaHeader\": {\r\n" + 
                "        \"datiTrasmissione\": {\r\n" + 
                "            \"idTrasmittente\": {\r\n" + 
                "                \"idPaese\": \"IT\",\r\n" + 
                "                \"idCodice\": \"01234567890\"\r\n" + 
                "            },\r\n" + 
                "            \"progressivoInvio\": \"00001\",\r\n" + 
                "            \"formatoTrasmissione\": \"FPA12\",\r\n" + 
                "            \"codiceDestinatario\": \"ABC1234\"\r\n" + 
                "        },\r\n" + 
                "        \"cedentePrestatore\": {\r\n" + 
                "            \"datiAnagrafici\": {\r\n" + 
                "                \"idFiscaleIVA\": {\r\n" + 
                "                    \"idPaese\": \"IT\",\r\n" + 
                "                    \"idCodice\": \"01234567890\"\r\n" + 
                "                },\r\n" + 
                "                \"anagrafica\": {\r\n" + 
                "                    \"denominazione\": \"SOCIETA' ALPHA SRL\"\r\n" + 
                "                },\r\n" + 
                "                \"regimeFiscale\": \"RF19\"\r\n" + 
                "            },\r\n" + 
                "            \"sede\": {\r\n" + 
                "                \"indirizzo\": \"VIALE ROMA 543\",\r\n" + 
                "                \"cap\": \"07100\",\r\n" + 
                "                \"comune\": \"SASSARI\",\r\n" + 
                "                \"provincia\": \"SS\",\r\n" + 
                "                \"nazione\": \"IT\"\r\n" + 
                "            }\r\n" + 
                "        },\r\n" + 
                "        \"cessionarioCommittente\": {\r\n" + 
                "            \"datiAnagrafici\": {\r\n" + 
                "                \"codiceFiscale\": \"09876543210\",\r\n" + 
                "                \"anagrafica\": {\r\n" + 
                "                    \"denominazione\": \"DITTA BETA\"\r\n" + 
                "                }\r\n" + 
                "            },\r\n" + 
                "            \"sede\": {\r\n" + 
                "                \"indirizzo\": \"VIA TORINO 38-B\",\r\n" + 
                "                \"cap\": \"00145\",\r\n" + 
                "                \"comune\": \"ROMA\",\r\n" + 
                "                \"provincia\": \"RM\",\r\n" + 
                "                \"nazione\": \"IT\"\r\n" + 
                "            }\r\n" + 
                "        }\r\n" + 
                "    },\r\n" + 
                "    \"fatturaElettronicaBody\": [\r\n" + 
                "        {\r\n" + 
                "            \"datiGenerali\": {\r\n" + 
                "                \"datiGeneraliDocumento\": {\r\n" + 
                "                    \"tipoDocumento\": \"TD01\",\r\n" + 
                "                    \"divisa\": \"EUR\",\r\n" + 
                "                    \"data\": \"2014-12-18\",\r\n" + 
                "                    \"numero\": \"123\",\r\n" + 
                "                    \"importoTotaleDocumento\": \"1234566.89\",\r\n" + 
                "                    \"causale\": [\r\n" + 
                "                        \"LA FATTURA FA RIFERIMENTO AD UNA OPERAZIONE AAAA BBBBBBBBBBBBBBBBBB CCC DDDDDDDDDDDDDDD E FFFFFFFFFFFFFFFFFFFF GGGGGGGGGG HHHHHHH II LLLLLLLLLLLLLLLLL MMM NNNNN OO PPPPPPPPPPP QQQQ RRRR SSSSSSSSSSSSSS\",\r\n" + 
                "                        \"SEGUE DESCRIZIONE CAUSALE NEL CASO IN CUI NON SIANO STATI SUFFICIENTI 200 CARATTERI AAAAAAAAAAA BBBBBBBBBBBBBBBBB\"\r\n" + 
                "                    ]\r\n" + 
                "                },\r\n" + 
                "                \"datiOrdineAcquisto\": [\r\n" + 
                "                    {\r\n" + 
                "                        \"riferimentoNumeroLinea\": [\r\n" + 
                "                            \"1\"\r\n" + 
                "                        ],\r\n" + 
                "                        \"idDocumento\": \"66685\",\r\n" + 
                "                        \"numItem\": \"1\"\r\n" + 
                "                    }\r\n" + 
                "                ],\r\n" + 
                "                \"datiContratto\": [\r\n" + 
                "                    {\r\n" + 
                "                        \"riferimentoNumeroLinea\": [\r\n" + 
                "                            \"1\"\r\n" + 
                "                        ],\r\n" + 
                "                        \"idDocumento\": \"123\",\r\n" + 
                "                        \"data\": \"2012-09-01\",\r\n" + 
                "                        \"numItem\": \"5\",\r\n" + 
                "                        \"codiceCUP\": \"123abc\",\r\n" + 
                "                        \"codiceCIG\": \"456def\"\r\n" + 
                "                    }\r\n" + 
                "                ],\r\n" + 
                "                \"datiTrasporto\": {\r\n" + 
                "                    \"datiAnagraficiVettore\": {\r\n" + 
                "                        \"idFiscaleIVA\": {\r\n" + 
                "                            \"idPaese\": \"IT\",\r\n" + 
                "                            \"idCodice\": \"24681012141\"\r\n" + 
                "                        },\r\n" + 
                "                        \"anagrafica\": {\r\n" + 
                "                            \"denominazione\": \"Trasporto spa\"\r\n" + 
                "                        }\r\n" + 
                "                    },\r\n" + 
                "                    \"dataOraConsegna\": \"2012-10-22T16:46:12.000+02:00\"\r\n" + 
                "                }\r\n" + 
                "            },\r\n" + 
                "            \"datiBeniServizi\": {\r\n" + 
                "                \"dettaglioLinee\": [\r\n" + 
                "                    {\r\n" + 
                "                        \"numeroLinea\": \"1\",\r\n" + 
                "                        \"descrizione\": \"DESCRIZIONE DELLA FORNITURA\",\r\n" + 
                "                        \"quantita\": \"5.00\",\r\n" + 
                "                        \"prezzoUnitario\": \"1.00\",\r\n" + 
                "                        \"prezzoTotale\": \"5.00\",\r\n" + 
                "                        \"aliquotaIVA\": \"22.00\"\r\n" + 
                "                    }\r\n" + 
                "                ],\r\n" + 
                "                \"datiRiepilogo\": [\r\n" + 
                "                    {\r\n" + 
                "                        \"aliquotaIVA\": \"22.00\",\r\n" + 
                "                        \"imponibileImporto\": \"5.00\",\r\n" + 
                "                        \"imposta\": \"1.10\",\r\n" + 
                "                        \"esigibilitaIVA\": \"I\"\r\n" + 
                "                    }\r\n" + 
                "                ]\r\n" + 
                "            },\r\n" + 
                "            \"datiPagamento\": [\r\n" + 
                "                {\r\n" + 
                "                    \"condizioniPagamento\": \"TP01\",\r\n" + 
                "                    \"dettaglioPagamento\": [\r\n" + 
                "                        {\r\n" + 
                "                            \"modalitaPagamento\": \"MP01\",\r\n" + 
                "                            \"dataScadenzaPagamento\": \"2015-01-30\",\r\n" + 
                "                            \"importoPagamento\": \"6.10\"\r\n" + 
                "                        }\r\n" + 
                "                    ]\r\n" + 
                "                }\r\n" + 
                "            ]\r\n" + 
                "        }\r\n" + 
                "    ]\r\n" + 
                "}";
        
        // da portare a variabili globali
        JaxbManager jaxbmng = JaxbManager.getInstance();
        
        
        
        
        Gson gson = new GsonBuilder()
        .setPrettyPrinting()
       .registerTypeAdapter( XMLGregorianCalendar.class, new XmlGregocarianCalendarConverter.Serializer() )
       .registerTypeAdapter( XMLGregorianCalendar.class, new XmlGregocarianCalendarConverter.Deserializer() )
       .registerTypeAdapter( FormatoTrasmissioneType.class, new EnumDeserializer() )
       .registerTypeAdapter( Art73Type.class, new EnumDeserializer() )
       .registerTypeAdapter( BolloVirtualeType.class, new EnumDeserializer() )
       .registerTypeAdapter( CausalePagamentoType.class, new EnumDeserializer() )
       .registerTypeAdapter( CondizioniPagamentoType.class, new EnumDeserializer() )
       .registerTypeAdapter( EsigibilitaIVAType.class, new EnumDeserializer() )
       .registerTypeAdapter( ModalitaPagamentoType.class, new EnumDeserializer() )
       .registerTypeAdapter( NaturaType.class, new EnumDeserializer() )
       .registerTypeAdapter( RegimeFiscaleType.class, new EnumDeserializer() )
       .registerTypeAdapter( RitenutaType.class, new EnumDeserializer() )
       .registerTypeAdapter( SocioUnicoType.class, new EnumDeserializer() )
       .registerTypeAdapter( SoggettoEmittenteType.class, new EnumDeserializer() )
       .registerTypeAdapter( StatoLiquidazioneType.class, new EnumDeserializer() )
       .registerTypeAdapter( TipoCassaType.class, new EnumDeserializer() )
       .registerTypeAdapter( TipoCessionePrestazioneType.class, new EnumDeserializer() )
       .registerTypeAdapter( TipoDocumentoType.class, new EnumDeserializer() )
       .registerTypeAdapter( TipoRitenutaType.class, new EnumDeserializer() )
       .registerTypeAdapter( TipoScontoMaggiorazioneType.class, new EnumDeserializer() )
       .registerTypeAdapter( EsitoCommittenteType.class, new EnumDeserializer() )
       .registerTypeAdapter( ScartoType.class, new EnumDeserializer() )
       .registerTypeAdapter( ScartoEsitoCommittenteType.class, new EnumDeserializer() )
       .create();
        
        FatturaElettronica fatturaBean = gson.fromJson(json, FatturaElettronica.class);
                
        
       Assert.assertNotNull(fatturaBean);
        
        Document fatturaDocument = jaxbmng.getDocumentFromFatturaElettronica(fatturaBean);
       Assert.assertNotNull(fatturaDocument);
        
        
        String fatturaString = jaxbmng.documentToXmlString(fatturaDocument);
//        Assert.assertNotNull(fatturaString);
        
        System.out.println(fatturaString);
        
        
    }
	
	
	
}
