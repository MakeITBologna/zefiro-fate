package it.makeit.fatturazione.commons.xmltopdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;

/*
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
*/

public class FatturaXmlToPdf {
	
	
	/**
	 * Converte da XML in HTML via iText e poi da HTML in PDF via Flying Saucer / iText.
	 * @param xml
	 * @param xsl
	 * @author Giulio Pellitta
	 * @return
	 */

	static InputStream convertFatturaToPdf(InputStream xml, InputStream xsl) {
		try(ByteArrayOutputStream os=new ByteArrayOutputStream()) {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc=builder.parse(FatturaXmlToPdf.convertFatturaToHtml(xml,xsl)); 
	        //OutputStream os = new FileOutputStream(pdfFile);
	        ITextRenderer renderer = new ITextRenderer();
	        renderer.setDocument(doc,null);
	        renderer.layout();
	        renderer.createPDF(os);
	        InputStream is=new ByteArrayInputStream(os.toByteArray());
	        //tecnicamente duplica il buffer originario (alternativa migliore usando pipedoutputstream e pipedinputstream?) ma sono documenti di pochi KB
	        os.close();
	        return is;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public static InputStream convertFatturaToHtml(InputStream xml, InputStream xsl) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			//InputStream xsl = FatturaXmlToPdf.class.getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(xml);

			// Use a Transformer for output
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			StreamSource style = new StreamSource(xsl);
			Transformer transformer = transformerFactory.newTransformer(style);
			transformer.setOutputProperty(OutputKeys.METHOD, "xml"); // xhtml
			
			DOMSource source = new DOMSource(document);
			ByteArrayOutputStream html = new ByteArrayOutputStream();
			
			StreamResult result = new StreamResult(html);
			
			transformer.transform(source, result);
			html.close();
			
			
	       
			
			return new ByteArrayInputStream(html.toByteArray());

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}
	
	
	public static InputStream fatturaToPdf(InputStream xml) {
		InputStream xsl = FatturaXmlToPdf.class.getClassLoader().getResourceAsStream("xsl" + File.separator + "fatturaordinaria_v1.2.1.xsl");
		return convertFatturaToPdf(xml, xsl);
	}
	
	public static InputStream semplificataToPdf(InputStream xml) {
		InputStream xsl = FatturaXmlToPdf.class.getClassLoader().getResourceAsStream("xsl" + File.separator + "fattura-stile.xsl");
		return convertFatturaToPdf(xml, xsl);
	}

	
	/* static InputStream convertFatturaToPdf(InputStream xml, InputStream xsl) {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(xml);

			// Use a Transformer for output
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			StreamSource style = new StreamSource(xsl);
			Transformer transformer = transformerFactory.newTransformer(style);
			transformer.setOutputProperty(OutputKeys.METHOD, "xml"); // xhtml
			
			DOMSource source = new DOMSource(document);
			ByteArrayOutputStream html = new ByteArrayOutputStream();
			
			StreamResult result = new StreamResult(html);
			
			transformer.transform(source, result);
			html.close();
			
			
			// itext
			
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
					
			
			float left = 30;
	        float right = 30;
	        float top = 60;
	        float bottom = 0;
	        
			com.itextpdf.text.Document itextDocument = new com.itextpdf.text.Document(PageSize.A4, left, right, top, bottom);
	        PdfWriter writer = PdfWriter.getInstance(itextDocument, out);
	        itextDocument.open();
	        
	        // CSS
	        CSSResolver cssResolver = XMLWorkerHelper.getInstance().getDefaultCssResolver(false);
	         //FileRetrieve retrieve = new FileRetrieveImpl(CSS_DIR);
	        //cssResolver.setFileRetrieve(retrieve);

	        // velocizza il caricamento
	        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
	        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
	        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
	        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
	        
	        PdfWriterPipeline pdf = new PdfWriterPipeline(itextDocument, writer);
	        HtmlPipeline htmlPipeline = new HtmlPipeline(htmlContext, pdf);
	        CssResolverPipeline cssPipeline = new CssResolverPipeline(cssResolver, htmlPipeline);
	       
	        XMLWorker worker = new XMLWorker(cssPipeline, false);
	        
	        XMLParser p = new XMLParser(worker);
	        p.parse(new ByteArrayInputStream(html.toByteArray()));
	        
	        
	        
	        
	        
	        
	        
	        itextDocument.close();
			
	       
			
			return new ByteArrayInputStream(out.toByteArray());

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}*/

}
