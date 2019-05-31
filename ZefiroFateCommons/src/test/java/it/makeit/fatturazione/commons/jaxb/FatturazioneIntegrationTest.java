package it.makeit.fatturazione.commons.jaxb;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;

import it.makeit.fatturazione.commons.jaxb.fattura.FatturaElettronica;

public class FatturazioneIntegrationTest {

	@Test
	public void postFEBean() {
		JaxbManager jaxbmng = JaxbManager.getInstance();
		
		FatturaElettronica fatturaBean = jaxbmng.getFatturaElettronica(this.getClass().getClassLoader().getResourceAsStream("fatturaDiTest.xml"));
		
		Assert.assertNotNull(fatturaBean);
		
		Document fatturaDocument = jaxbmng.getDocumentFromFatturaElettronica(fatturaBean);
		Assert.assertNotNull(fatturaDocument);
		
		
		String fatturaString = jaxbmng.documentToXmlString(fatturaDocument);
		Assert.assertNotNull(fatturaString);
		
	}
}