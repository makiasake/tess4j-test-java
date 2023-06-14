package tess4j.java.test;

import java.io.File;

import org.junit.jupiter.api.Test;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestTess4J {

	@Test
	public void test() {

		File image = new File("src/main/resources/test-files/1686745622599.png");
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("src/main/resources/tessdata");
		tesseract.setLanguage("por");
		tesseract.setPageSegMode(1);
		tesseract.setOcrEngineMode(1);

		try {
			String result = tesseract.doOCR(image);
			System.out.println(result);
		} catch (TesseractException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
