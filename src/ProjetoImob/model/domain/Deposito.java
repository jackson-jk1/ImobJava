package ProjetoImob.model.domain;

import java.sql.Date;

public class Deposito extends Pagamentos{

	private int id_Deposito;

	private int id_Codigo_Deposito;

	private int id_cliente;

	private Date data_Deposito;

	private String codigo_Identificacao;

	private String tipo_Deposito;

	private String anotacoes;

	private String confirmacao_deposito;

	private String deposito_realizado;



	public int getId_Deposito() {
		return id_Deposito;
	}

	public void setId_Deposito(int id_Deposito) {
		this.id_Deposito = id_Deposito;
	}

	public int getId_Codigo_Deposito() {
		return id_Codigo_Deposito;
	}

	public void setId_Codigo_Deposito(int id_Codigo_Deposito) {
		this.id_Codigo_Deposito = id_Codigo_Deposito;
	}

	@Override
	public int getId_cliente() {
		return id_cliente;
	}

	@Override
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getData_Deposito() {
		return data_Deposito;
	}

	public void setData_Deposito(Date data_Deposito) {
		this.data_Deposito = data_Deposito;
	}

	public String getCodigo_Identificacao() {
		return codigo_Identificacao;
	}

	public void setCodigo_Identificacao(String codigo_Identificacao) {
		this.codigo_Identificacao = codigo_Identificacao;
	}

	public String getTipo_Deposito() {
		return tipo_Deposito;
	}

	public void setTipo_Deposito(String tipo_Deposito) {
		this.tipo_Deposito = tipo_Deposito;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getConfirmacao_deposito() {
		return confirmacao_deposito;
	}

	public void setConfirmacao_deposito(String confirmacao_deposito) {
		this.confirmacao_deposito = confirmacao_deposito;
	}

	public String getDeposito_realizado() {
		return deposito_realizado;
	}

	public void setDeposito_realizado(String deposito_realizado) {
		this.deposito_realizado = deposito_realizado;
	}
}
