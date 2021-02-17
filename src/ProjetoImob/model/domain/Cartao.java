package ProjetoImob.model.domain;

import java.sql.Date;

public class Cartao extends Pagamentos{

	private int id_Cartao;

	private int id_Codigo_Cartao;

	private int id_cliente;

	private long numero_cartao;

	private Date data_Vencimento;

	private double valor_Recebido;

	private String tipo_cartao;

	private String anotacoes;

	public int getId_Cartao() {
		return id_Cartao;
	}

	public void setId_Cartao(int id_Cartao) {
		this.id_Cartao = id_Cartao;
	}

	public int getId_Codigo_Cartao() {
		return id_Codigo_Cartao;
	}

	public void setId_Codigo_Cartao(int id_Codigo_Cartao) {
		this.id_Codigo_Cartao = id_Codigo_Cartao;
	}

	@Override
	public int getId_cliente() {
		return id_cliente;
	}

	@Override
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public long getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(long numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	public Date getData_Vencimento() {
		return data_Vencimento;
	}

	public void setData_Vencimento(Date data_Vencimento) {
		this.data_Vencimento = data_Vencimento;
	}

	public double getValor_Recebido() {
		return valor_Recebido;
	}

	public void setValor_Recebido(double valor_Recebido) {
		this.valor_Recebido = valor_Recebido;
	}

	public String getTipo_cartao() {
		return tipo_cartao;
	}

	public void setTipo_cartao(String tipo_cartao) {
		this.tipo_cartao = tipo_cartao;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
}
