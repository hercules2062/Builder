package gerador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class MainApp{
	public static void main(String[] args) {		
		 //BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		 BoletoBuilder boletoBuilder = new BradescoBoletoBuilder();
		 //BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
		 GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		 Boleto boleto = geradorDeBoleto.GerarBoleto();
		 System.out.println(boleto);
		 GeradorPDF geradorPdf = new GeradorPDF(boleto);
		 try {
			geradorPdf.GeraPDF();
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
	}
}
