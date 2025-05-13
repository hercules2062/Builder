package gerador;

import java.util.Calendar;

public interface Boleto {
	public String getSacado();
	public String getCpfCnpjSacado();
	public String getEnderecoSacado();
	public String getCedente();
	public String getCpfCnpjCedente();
	public String getEnderecoCedente();
	public int getNuDocumento();
	public double getValor();
	public Calendar getVencimento();
	public int getNossoNumero();
	public String getAgencia();
	public int getContaCorrente();
	public int getCarteira();
	
	public String toString();
}
