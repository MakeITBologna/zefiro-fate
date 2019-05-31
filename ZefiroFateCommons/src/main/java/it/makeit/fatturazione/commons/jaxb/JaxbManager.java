package it.makeit.fatturazione.commons.jaxb;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import it.makeit.fatturazione.commons.jaxb.esiti.NotificaDecorrenzaTerminiType;
import it.makeit.fatturazione.commons.jaxb.esiti.NotificaEsitoCommittenteType;
import it.makeit.fatturazione.commons.jaxb.esiti.NotificaEsitoType;
import it.makeit.fatturazione.commons.jaxb.esiti.NotificaMancataConsegnaType;
import it.makeit.fatturazione.commons.jaxb.esiti.NotificaScartoType;
import it.makeit.fatturazione.commons.jaxb.esiti.RicevutaConsegnaType;
import it.makeit.fatturazione.commons.jaxb.fattura.FatturaElettronica;
import it.makeit.fatturazione.commons.jaxb.fatturasemplificata.FatturaElettronicaType;
import it.makeit.fatturazione.commons.jaxb.messaggiFattura.RicevutaImpossibilitaRecapitoType;
import it.makeit.fatturazione.commons.jaxb.messaggiFattura.RicevutaScartoType;

public class JaxbManager {
	private static JaxbManager istance;
	
	public final static JaxbManager getInstance() {
		if (istance == null) {
			synchronized (JaxbManager.class) {
				if (istance == null) {
					istance = new JaxbManager();
				}
			}
		}
		;
		return istance;
	}

	public Document getDocumentFromFatturaElettronica(FatturaElettronica pFatturaElettronica) {

		Document lDocument;

		DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		lDocumentBuilderFactory.setNamespaceAware(true);

		try {
			lDocument = lDocumentBuilderFactory.newDocumentBuilder().newDocument();

		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(FatturaElettronica.class);
			Marshaller lMarshaller = lJAXBContext.createMarshaller();
			lMarshaller.marshal(pFatturaElettronica, lDocument);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}

		return lDocument;
	}

	public FatturaElettronica getFatturaElettronicaFromXML(String pStrXml) {

		FatturaElettronica lFatturaElettronica;

		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(FatturaElettronica.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			lFatturaElettronica = lUnMarshaller
					.unmarshal(new StreamSource(new StringReader(pStrXml)), FatturaElettronica.class).getValue();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
		return lFatturaElettronica;
	}
	
	public FatturaElettronicaType getFatturaElettronicaSemplificataFromXML(String pStrXml) {

		FatturaElettronicaType lFatturaElettronica;

		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(FatturaElettronicaType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			lFatturaElettronica = lUnMarshaller
					.unmarshal(new StreamSource(new StringReader(pStrXml)), FatturaElettronicaType.class).getValue();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
		return lFatturaElettronica;
	}

	// method to convert Document to String
	public static String documentToXmlString(Document doc) {
		try {
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			return writer.toString();
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
	}

	// ritorna il tipo di esito
	public String getNodoPrincipale(InputStream stream) {
		DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		lDocumentBuilderFactory.setNamespaceAware(true);
		
		DocumentBuilder builder;
		String firstNode = null;
		try {
			
			builder = lDocumentBuilderFactory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(stream));
			doc.getDocumentElement().normalize();
			NodeList nodes = doc.getChildNodes();
			
			if (nodes != null) {
				String[] nodeName = nodes.item(nodes.getLength()-1).getNodeName().split(":");
				if (nodeName.length > 1) {
					firstNode = nodeName[1];
				} else {
					firstNode = nodeName[0];
				}
			} 
			return firstNode;

		} catch (IOException | ParserConfigurationException | SAXException e) {
			throw new RuntimeException(e);
			
		}
		
	}
	
	public String getNodoPrincipale(Document doc) {
		String firstNode = null;
		doc.getDocumentElement().normalize();
		NodeList nodes = doc.getChildNodes();
		
		if (nodes != null) {
			String[] nodeName = nodes.item(nodes.getLength()-1).getNodeName().split(":");
			if (nodeName.length > 1) {
				firstNode = nodeName[1];
			} else {
				firstNode = nodeName[0];
			}
		} 
		return firstNode;
		
	}
	public Document getDocument(InputStream stream) {
		DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		lDocumentBuilderFactory.setNamespaceAware(true);
		
		DocumentBuilder builder;
		try {
			
			builder = lDocumentBuilderFactory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(stream));
			return doc;

		} catch (IOException | ParserConfigurationException | SAXException e) {
			throw new RuntimeException(e);
			
		}
		
	}
	
	
	

	public FatturaElettronica getFatturaElettronica(InputStream stream) {
		try {	
			JAXBContext lJAXBContext = JAXBContext.newInstance(FatturaElettronica.class);
			Unmarshaller lUnMarshaller =  lJAXBContext.createUnmarshaller();
			FatturaElettronica fattura = lUnMarshaller.unmarshal(new StreamSource(stream), FatturaElettronica.class).getValue();
			return fattura;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public RicevutaConsegnaType createRicevutaConsegna(InputStream stream) {	
		try {	
			JAXBContext lJAXBContext = JAXBContext.newInstance(RicevutaConsegnaType.class);
			Unmarshaller lUnMarshaller =  lJAXBContext.createUnmarshaller();
			RicevutaConsegnaType consegna = lUnMarshaller.unmarshal(new StreamSource(stream), RicevutaConsegnaType.class).getValue();
			return consegna;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public NotificaScartoType createNotificaScarto(InputStream stream) {	
		try {	
			JAXBContext lJAXBContext = JAXBContext.newInstance(NotificaScartoType.class);
			Unmarshaller lUnMarshaller =  lJAXBContext.createUnmarshaller();
			NotificaScartoType notificaScarto = lUnMarshaller.unmarshal(new StreamSource(stream), NotificaScartoType.class).getValue();
			return notificaScarto;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public RicevutaScartoType createRicevutaScarto(InputStream stream) {	
		try {	
			JAXBContext lJAXBContext = JAXBContext.newInstance(RicevutaScartoType.class);
			Unmarshaller lUnMarshaller =  lJAXBContext.createUnmarshaller();
			RicevutaScartoType ricevutaScarto = lUnMarshaller.unmarshal(new StreamSource(stream), RicevutaScartoType.class).getValue();
			return ricevutaScarto;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public RicevutaImpossibilitaRecapitoType creaRicevutaImpossibilitaRecapito(InputStream stream) {	
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(RicevutaImpossibilitaRecapitoType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			RicevutaImpossibilitaRecapitoType ricevutaImposRecapito = lUnMarshaller.unmarshal(new StreamSource(stream), RicevutaImpossibilitaRecapitoType.class).getValue();
			return ricevutaImposRecapito;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	};
	
	public NotificaMancataConsegnaType createNotificaMancataConsegna(InputStream stream) {	
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(NotificaMancataConsegnaType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			NotificaMancataConsegnaType mancataConsegna = lUnMarshaller.unmarshal(new StreamSource(stream), NotificaMancataConsegnaType.class).getValue();
			return mancataConsegna;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public NotificaEsitoCommittenteType createNotificaEsitoCommittente(InputStream stream) {	
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(NotificaEsitoCommittenteType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			NotificaEsitoCommittenteType esitoCommittente = lUnMarshaller.unmarshal(new StreamSource(stream), NotificaEsitoCommittenteType.class).getValue();
			return esitoCommittente;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public NotificaEsitoType createNotificaEsito(InputStream stream) {	
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(NotificaEsitoType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			NotificaEsitoType notificaEsito = lUnMarshaller.unmarshal(new StreamSource(stream), NotificaEsitoType.class).getValue();
			return notificaEsito;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	public NotificaDecorrenzaTerminiType createNotificaDecorrenzatermini(InputStream stream) {	
		try {
			JAXBContext lJAXBContext = JAXBContext.newInstance(NotificaDecorrenzaTerminiType.class);
			Unmarshaller lUnMarshaller = lJAXBContext.createUnmarshaller();
			NotificaDecorrenzaTerminiType decorrenzaTermini = lUnMarshaller.unmarshal(new StreamSource(stream), NotificaDecorrenzaTerminiType.class).getValue();
			return decorrenzaTermini;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

}
