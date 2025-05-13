package gerador;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ItauBoleto implements Boleto{
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
	public ItauBoleto(String sacado, String cpfCnpjSacado, String enderecoSacado, String cedente, String cpfCnpjCedente,String enderecoCedente,
			int nuDocumento, double valor, Calendar vencimento, int nossoNumero, String agencia, int contaCorrente, int carteira) {
		this.sacado = sacado;
		this.cpfCnpjSacado = cpfCnpjSacado;
		this.enderecoSacado = enderecoSacado;
		this.cedente = cedente;
		this.cpfCnpjCedente = cpfCnpjCedente;
		this.enderecoCedente = enderecoCedente;
		this.nuDocumento = nuDocumento;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.carteira = carteira;
	}
	public String getSacado() {
		return sacado;
	}
	public String getCedente() {
		return cedente;
	}
	public double getValor() {
		return valor;
	}
	public Calendar getVencimento() {
		return vencimento;
	}
	public int getNossoNumero() {
		return nossoNumero;
	}
	public String getCpfCnpjSacado() {
		return cpfCnpjSacado;
	}
	public void setCpfCnpjSacado(String cpfCnpjSacado) {
		this.cpfCnpjSacado = cpfCnpjSacado;
	}
	public String getEnderecoSacado() {
		return enderecoSacado;
	}
	public void setEnderecoSacado(String enderecoSacado) {
		this.enderecoSacado = enderecoSacado;
	}
	public String getCpfCnpjCedente() {
		return cpfCnpjCedente;
	}
	public void setCpfCnpjCedente(String cpfCnpjCedente) {
		this.cpfCnpjCedente = cpfCnpjCedente;
	}
	public String getEnderecoCedente() {
		return enderecoCedente;
	}
	public void setEnderecoCedente(String enderecoCedente) {
		this.enderecoCedente = enderecoCedente;
	}
	public int getNuDocumento() {
		return nuDocumento;
	}
	public void setNuDocumento(int nuDocumento) {
		this.nuDocumento = nuDocumento;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public int getCarteira() {
		return carteira;
	}
	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		 stringBuilder.append("Boleto Itau");
		 stringBuilder.append("\n");
		 stringBuilder.append("Numero do documento: " + this.nuDocumento);
		 stringBuilder.append("\n");
		 stringBuilder.append("Sacado: " + this.sacado);
		 stringBuilder.append("\n");
		 stringBuilder.append("CPF Sacado:" + this.cpfCnpjSacado);
		 stringBuilder.append("\n");
		 stringBuilder.append("Endereço Sacado:" + this.enderecoSacado);
		 stringBuilder.append("\n");
		 stringBuilder.append("Cedente: " + this.cedente);
		 stringBuilder.append("\n");
		 stringBuilder.append("CPF Cedente:" + this.cpfCnpjCedente);
		 stringBuilder.append("\n");
		 stringBuilder.append("Endereço Cedente:" + this.enderecoCedente);
		 stringBuilder.append("\n");
		 stringBuilder.append("Valor: " + this.valor);
		 stringBuilder.append("\n");
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String format = simpleDateFormat.format(this.vencimento.getTime());
		 stringBuilder.append("Vencimento: " + format);
		 stringBuilder.append("\n");
		 stringBuilder.append("Nosso Número: " + this.nossoNumero);
		 stringBuilder.append("\n");
		 stringBuilder.append("Agencia: " + this.agencia);
		 stringBuilder.append("\n");
		 stringBuilder.append("Conta Corrente: " + this.contaCorrente);
		 stringBuilder.append("\n");
		 stringBuilder.append("Carteira: " + this.carteira);
		 stringBuilder.append("\n");
		 return stringBuilder.toString();
	}
}
