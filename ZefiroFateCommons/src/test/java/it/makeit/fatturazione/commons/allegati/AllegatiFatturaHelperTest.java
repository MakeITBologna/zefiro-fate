package it.makeit.fatturazione.commons.allegati;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import it.makeit.fatturazione.commons.jaxb.JaxbManager;
import it.makeit.fatturazione.commons.jaxb.fattura.FatturaElettronica;

public class AllegatiFatturaHelperTest {

	@Test
	public void test() {
		JaxbManager jaxbmng = JaxbManager.getInstance();
		
		FatturaElettronica fatturaBean = jaxbmng.getFatturaElettronica(this.getClass().getClassLoader().getResourceAsStream("hera.xml"));
		
		List<AllegatoDecodificato> allegati = AllegatiFatturaHelper.decodifica(fatturaBean);
		
		Assert.assertNotNull(allegati);
		Assert.assertEquals(allegati.size(), 1);
		
		/*allegati.forEach(a ->{
			try {
				Files.write(Paths.get(a.getNome()), a.getStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});*/
	}

}
