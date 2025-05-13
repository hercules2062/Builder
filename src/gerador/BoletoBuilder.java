package gerador;

import java.util.Calendar;

public interface BoletoBuilder {
	void buildSacado(String sacado);
	void buildCpfCnpjSacado(String cpfCnpjSacado);
	void buildEnderecoSacado(String enderecoSacado);
	void buildCedente(String cedente);
	void buildCpfCnpjCedente(String cpfCnpjCedente);
	void buildEnderecoCedente(String enderecoCedente);
	void buildNuDocumento(int nuDocumento);
	void buildValor(double valor);
	void buildVencimento(Calendar vencimento);
	void buildNossoNumero(int nossoNumero);
	void buildAgencia(String agencia);
	void buildContaCorrente(int contaCorrente);
	void buildCarteira(int carteira);
	void buildCodigoDeBarras();
	void buildLogotipo();
	
	Boleto getBoleto();
}
