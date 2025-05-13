package gerador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeradorPDF {
	private Boleto boleto;
	
	public GeradorPDF(Boleto boleto) {
		this.boleto = boleto;
	}
	
	public void GeraPDF() throws URISyntaxException, IOException {
		Document documento = new Document();
		try {
			PdfPTable table = new PdfPTable(3);
			//AdicionaCabecalho(table);
			adicionaLinha(table, "Sacado:"+boleto.getSacado(), "CPF:"+boleto.getCpfCnpjSacado(), "Endereço:"+boleto.getEnderecoSacado());
			adicionaLinha(table, "Cedente:"+boleto.getCedente(), "CPF:"+boleto.getCpfCnpjCedente(), "Endereço:"+boleto.getEnderecoCedente());
			adicionaLinha(table, "Valor:"+boleto.getValor(), "Vencimento:"+df.format(boleto.getVencimento()), "Nosso Numero:"+boleto.getNossoNumero());
			adicionaLinha(table, "Agencia:"+boleto.getAgencia(), "Conta Corrente:"+boleto.getContaCorrente(), "Carteira:"+boleto.getCarteira());
			//adicionarLinhaCustomizada(table);
			
			PdfWriter.getInstance(documento, new FileOutputStream("boleto.pdf"));
			documento.open();
			//Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
			//Chunk chunk = new Chunk("Hello World", font);
			//documento.add(chunk);
			documento.add(table);
			documento.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void AdicionaCabecalho(PdfPTable table) {
	    Stream.of("Sacado:"+boleto.getSacado(), "COF:"+boleto.getCpfCnpjSacado(), "Endereço:"+boleto.getEnderecoSacado())
	      .forEach(columnTitle -> {
	        PdfPCell header = new PdfPCell();
	        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        header.setBorderWidth(2);
	        header.setPhrase(new Phrase(columnTitle));
	        table.addCell(header);
	    });
	}
	
	private void adicionaLinha(PdfPTable table, String col1,String col2, String col3) {
	    table.addCell(col1); //row 1, col 1
	    table.addCell(col2); //row 1, col 2
	    table.addCell(col3); //row 1, col 3
	}
	
	private void adicionarLinhaCustomizada(PdfPTable table) 
			  throws URISyntaxException, BadElementException, IOException {
			    Path path = Paths.get(ClassLoader.getSystemResource("Java_logo.png").toURI());
			    Image img = Image.getInstance(path.toAbsolutePath().toString());
			    img.scalePercent(10);

			    PdfPCell imageCell = new PdfPCell(img);
			    table.addCell(imageCell);

			    PdfPCell horizontalAlignCell = new PdfPCell(new Phrase("row 2, col 2"));
			    horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			    table.addCell(horizontalAlignCell);

			    PdfPCell verticalAlignCell = new PdfPCell(new Phrase("row 2, col 3"));
			    verticalAlignCell.setVerticalAlignment(Element.ALIGN_BOTTOM);
			    table.addCell(verticalAlignCell);
			}
}
