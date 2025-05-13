package gerador;

import java.util.Calendar;

public class ItauBoletoBuilder implements BoletoBuilder{
	private String sacado;
	private String cpfCnpjSacado;
	private String enderecoSacado;
	private String cedente;
	private String cpfCnpjCedente;
	private String enderecoCedente;
	private int nuDocumento;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	private String agencia;
	private int contaCorrente;
	private int carteira;

	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public void buildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	@Override
	public void buildCodigoDeBarras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildLogotipo() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void buildCpfCnpjSacado(String cpfCnpjSacado) {
		this.cpfCnpjSacado = cpfCnpjSacado; 
	}

	@Override
	public void buildEnderecoSacado(String enderecoSacado) {
		this.enderecoSacado = enderecoSacado;
	}

	@Override
	public void buildCpfCnpjCedente(String cpfCnpjCedente) {
		this.cpfCnpjCedente = cpfCnpjCedente;
	}

	@Override
	public void buildEnderecoCedente(String enderecoCedente) {
		this.enderecoCedente = enderecoCedente;
	}

	@Override
	public void buildNuDocumento(int nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

	@Override
	public void buildAgencia(String agencia) {
		//this.agencia = agencia;
		this.agencia = "341";
	}

	@Override
	public void buildContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;		
	}

	@Override
	public void buildCarteira(int carteira) {
		this.carteira = carteira;		
	}

	@Override
	public Boleto getBoleto() {
		return new ItauBoleto(sacado, cpfCnpjSacado, enderecoSacado, cedente, cpfCnpjCedente, enderecoCedente,
				nuDocumento, valor, vencimento, nossoNumero, agencia, contaCorrente, carteira);
	}
}
