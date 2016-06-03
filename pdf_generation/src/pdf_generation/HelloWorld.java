package pdf_generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorld {
	
	private final static String OUT = "my_pdf.pdf";

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		try {
			hello.createDocument(OUT);
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private Document createDocument(String file) throws DocumentException, FileNotFoundException {
		FileOutputStream os = new FileOutputStream(file);
		Document document = new Document();
		PdfWriter.getInstance(document, os);
		document.open();
		
		Paragraph paragraph = new Paragraph(40, "Ma facture Proforma. ");
		paragraph.setSpacingAfter(30);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		Chunk chunk = new Chunk("This is a sentence ");
		Phrase phrase = new Phrase(20);
		
		phrase.add(chunk);
		phrase.add(chunk);
		phrase.add(chunk);
		phrase.add(chunk);
		phrase.add(chunk);
		phrase.add(chunk);
		phrase.add(chunk);
		
		document.add(phrase);
		
		document.close();
		
		return document;
	}

}
