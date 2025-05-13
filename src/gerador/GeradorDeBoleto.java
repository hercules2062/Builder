package gerador;

import java.util.Calendar;

public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto GerarBoleto() {
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		this.boletoBuilder.buildSacado("Hércules Lopes");
		this.boletoBuilder.buildCpfCnpjSacado("80060000050");
		this.boletoBuilder.buildEnderecoSacado("Av. Porto Segura, Centro, Eunapolis - BA");
		this.boletoBuilder.buildCedente("Elon Musk");
		this.boletoBuilder.buildCpfCnpjSacado("80060000050");
		this.boletoBuilder.buildEnderecoSacado("Av. Norte Sul, Gusmão, Eunapolis - BA");
		this.boletoBuilder.buildNuDocumento(001);
		this.boletoBuilder.buildValor(999.99);
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1234);
		this.boletoBuilder.buildAgencia("341");
		this.boletoBuilder.buildContaCorrente(111);
		this.boletoBuilder.buildCarteira(222);
		
		Boleto boleto = this.boletoBuilder.getBoleto();
		
		return boleto;
	}
	
}
