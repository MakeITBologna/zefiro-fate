package it.makeit.fatturazione.commons.xmltopdf;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xhtmlrenderer.pdf.ITextRenderer;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;

public class FatturaXmlToPdfTest {
	
	//verificare formattazione sezione "Dati relativi alle linee di dettaglio della fornitura"
	//verificare page-break
	//verificare pagina vuota in coda
	//verificare eventuale testo troncato
	
	//funzione originale in FatturaXmlToPdf
	
	public final static String fatturaXML="201904040257681120800104aa-IT03405761200BNXBB_00002.xml";
			//"erroreMultiplo.xml"; //(per fs page-break dopo "Condizioni pagamento" a causa di blocco molto lungo)
	//public final static String fatturaXML="201902090257681120800036aa-IT01621900479_01Yje.xml"; // (meglio fs che itext, es "Dati relativi alle linee di dettaglio della fornitura") 
	//public final static String fatturaXML="201902120257681120800037aa-IT02627620368_00004.xml"; // (meglio fs che itext, e.s. page-break su "Dati del cessionario / committente" -> "Dati della sede")
	//public final static String fatturaXML="201902120257681120800038aa-IT01641790702_aLn3k.xml"; // (meglio fs che itext, overflow su "Dati relativi alle linee di dettaglio della fornitura", ma non va page-break prima di dati generali documento)
	//public final static String fatturaXML="e85f6758-c54f-42e3-8cd6-842e8c682c7f.xml"; // (meglio fs che itext, vedi page break su "Dati generali del documento", ma pagina vuota in coda)
	//public final static String fatturaXML="e85f6758-c54f-42e3-8cd6-842e8c682c7f.xml"; // (meglio fs che itext, vedi page break su "Dati generali del documento" e overflow su "Dati relativi alle linee di dettaglio della fornitura", ma pagina vuota in coda)
	//public final static String fatturaXML="eee8ae8e-2996-43f0-bb63-e67fe64f01ad.xml"; // (meglio fs che itext, vedi page break su "Dati generali del documento" e "Dati relativi al pagamento")


	@BeforeClass
	public static void reset() {
		new File("prova_it.pdf").delete();
		new File("prova_it.html").delete();
		new File("prova_fs.pdf").delete();
	}


	//@Test
	public void test() throws IOException {
		String file = fatturaXML;
		//String file = "esempioSitoFatturazione.xml";
		InputStream fatturaXml = this.getClass().getClassLoader().getResourceAsStream(file);
		InputStream xsl = this.getClass().getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");
		
		InputStream output = FatturaXmlToPdf.convertFatturaToHtml(fatturaXml,xsl);
		Assert.assertNotNull(output);
		
		
		Files.write(Paths.get("prova.html"), ((ByteArrayInputStream)output).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		
		fatturaXml = this.getClass().getClassLoader().getResourceAsStream(file);
		output = FatturaXmlToPdf.fatturaToPdf(fatturaXml);
		Assert.assertNotNull(output);
		
		Files.write(Paths.get("prova.pdf"), ((ByteArrayInputStream)output).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		
	}
	
	//@Test
	public void testSemplificata() throws IOException {
		InputStream fatturaXml = this.getClass().getClassLoader().getResourceAsStream("esempio-ciani.xml");
		
		InputStream output = FatturaXmlToPdf.semplificataToPdf(fatturaXml);
		Assert.assertNotNull(output);
		
		
		Files.write(Paths.get("provaSemplificata.pdf"), ((ByteArrayInputStream)output).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		

		
	}
	
	//@Test
	public void rendererTest() throws Exception {
		String inputFile = "prova.html";

        String outputFile = "prova_x.pdf";
        
		String file = fatturaXML;
		//String file = "esempioSitoFatturazione.xml";
		InputStream fatturaXml = this.getClass().getClassLoader().getResourceAsStream(file);
		InputStream xsl = this.getClass().getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");        
        InputStream output = FatturaXmlToPdf.convertFatturaToHtml(fatturaXml,xsl);
		Assert.assertNotNull(output);
		
		
		Files.write(Paths.get("prova.html"), ((ByteArrayInputStream)output).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        Document doc = builder.parse(new File(inputFile));
        		
        OutputStream os = new FileOutputStream(outputFile);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(doc,null);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
	}

	@Test
	public void itTest() throws Exception {
		String fileXml=fatturaXML;
		String fileHtml="prova_it.html";
        String outputFile = "prova_fs.pdf";
		InputStream fatturaXml = this.getClass().getClassLoader().getResourceAsStream(fileXml);
		InputStream xsl = this.getClass().getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");
		InputStream fatturaHtml= FatturaXmlToPdf.convertFatturaToHtml(fatturaXml,xsl);
		Files.write(Paths.get(fileHtml), ((ByteArrayInputStream)fatturaHtml).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//Document doc=builder.parse(new FileInputStream(new File(fileHtml)));
		Document doc=builder.parse(new File(fileHtml)); 
        OutputStream os = new FileOutputStream(outputFile);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(doc,null);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
	}
	
	/**
	 * Crea il PDF della fattura da un file XML. 
	 * @throws IOException
	 */
	@Test
	public void fsTest() throws IOException{
		String fileXml=fatturaXML;
		String filePdf="prova_it.pdf";
		InputStream fatturaXml = this.getClass().getClassLoader().getResourceAsStream(fileXml);
		InputStream xsl = this.getClass().getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");
		InputStream fatturaPdf=FatturaXmlToPdf.convertFatturaToPdf(fatturaXml,xsl);
		Files.write(Paths.get(filePdf), ((ByteArrayInputStream)fatturaPdf).readAllBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
	}
	
}
