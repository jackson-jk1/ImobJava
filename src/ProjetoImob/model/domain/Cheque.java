package ProjetoImob.model.domain;

import java.sql.Date;

public class Cheque extends Pagamentos{

	private int id_Cheque;

	private int id_Codigo_Cheque;

	private String Banco;

	private int id_Cliente;

	private String numero_Cheque;

	private String referente_Pagamento;

	private String anotacoes;

	private String a_vista;

	private String parcelado;

	private String quantidade_vezes;

	private String compensado;

	private Date data_cheque;

	private Date data_recebimento;

	private Date data_abertura_conta;

	public int getId_Cheque() {
		return id_Cheque;
	}

	public void setId_Cheque(int id_Cheque) {
		this.id_Cheque = id_Cheque;
	}

	public int getId_Codigo_Cheque() {
		return id_Codigo_Cheque;
	}

	public void setId_Codigo_Cheque(int id_Codigo_Cheque) {
		this.id_Codigo_Cheque = id_Codigo_Cheque;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNumero_Cheque() {
		return numero_Cheque;
	}

	public void setNumero_Cheque(String numero_Cheque) {
		this.numero_Cheque = numero_Cheque;
	}

	public String getReferente_Pagamento() {
		return referente_Pagamento;
	}

	public void setReferente_Pagamento(String referente_Pagamento) {
		this.referente_Pagamento = referente_Pagamento;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getA_vista() {
		return a_vista;
	}

	public void setA_vista(String a_vista) {
		this.a_vista = a_vista;
	}

	public String getParcelado() {
		return parcelado;
	}

	public void setParcelado(String parcelado) {
		this.parcelado = parcelado;
	}

	public String getQuantidade_vezes() {
		return quantidade_vezes;
	}

	public void setQuantidade_vezes(String quantidade_vezes) {
		this.quantidade_vezes = quantidade_vezes;
	}

	public String getCompensado() {
		return compensado;
	}

	public void setCompensado(String compensado) {
		this.compensado = compensado;
	}

	public Date getData_cheque() {
		return data_cheque;
	}

	public void setData_cheque(Date data_cheque) {
		this.data_cheque = data_cheque;
	}

	public Date getData_recebimento() {
		return data_recebimento;
	}

	public void setData_recebimento(Date data_recebimento) {
		this.data_recebimento = data_recebimento;
	}

	public Date getData_abertura_conta() {
		return data_abertura_conta;
	}

	public void setData_abertura_conta(Date data_abertura_conta) {
		this.data_abertura_conta = data_abertura_conta;
	}
}
