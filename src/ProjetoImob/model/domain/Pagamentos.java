package ProjetoImob.model.domain;

import java.sql.Date;

public class Pagamentos {

	private int id_Pagamentos;

	private int id_Codigo_Pagamento;

	private Date data_Pagamento;

	private Date data_Vencimento_Pagamento;

	private double juros_Mensais;

	private double juros_Multas;

	private int id_Codigo_Cliente;

	private String forma_Pagamento;

	private double valor_Pagamento;

	private double valor_desconto;

	private double valor_Total_Pagamento;

	private int numero_documento_Pagamento;

	private int id_cliente;

	private int id_imovel;

	public int getId_Pagamentos() {
		return id_Pagamentos;
	}

	public void setId_Pagamentos(int id_Pagamentos) {
		this.id_Pagamentos = id_Pagamentos;
	}

	public int getId_Codigo_Pagamento() {
		return id_Codigo_Pagamento;
	}

	public void setId_Codigo_Pagamento(int id_Codigo_Pagamento) {
		this.id_Codigo_Pagamento = id_Codigo_Pagamento;
	}

	public Date getData_Pagamento() {
		return data_Pagamento;
	}

	public void setData_Pagamento(Date data_Pagamento) {
		this.data_Pagamento = data_Pagamento;
	}

	public Date getData_Vencimento_Pagamento() {
		return data_Vencimento_Pagamento;
	}

	public void setData_Vencimento_Pagamento(Date data_Vencimento_Pagamento) {
		this.data_Vencimento_Pagamento = data_Vencimento_Pagamento;
	}

	public double getJuros_Mensais() {
		return juros_Mensais;
	}

	public void setJuros_Mensais(double juros_Mensais) {
		this.juros_Mensais = juros_Mensais;
	}

	public double getJuros_Multas() {
		return juros_Multas;
	}

	public void setJuros_Multas(double juros_Multas) {
		this.juros_Multas = juros_Multas;
	}

	public int getId_Codigo_Cliente() {
		return id_Codigo_Cliente;
	}

	public void setId_Codigo_Cliente(int id_Codigo_Cliente) {
		this.id_Codigo_Cliente = id_Codigo_Cliente;
	}

	public String getForma_Pagamento() {
		return forma_Pagamento;
	}

	public void setForma_Pagamento(String forma_Pagamento) {
		this.forma_Pagamento = forma_Pagamento;
	}

	public double getValor_Pagamento() {
		return valor_Pagamento;
	}

	public void setValor_Pagamento(double valor_Pagamento) {
		this.valor_Pagamento = valor_Pagamento;
	}

	public double getValor_desconto() {
		return valor_desconto;
	}

	public void setValor_desconto(double valor_desconto) {
		this.valor_desconto = valor_desconto;
	}

	public double getValor_Total_Pagamento() {
		return valor_Total_Pagamento;
	}

	public void setValor_Total_Pagamento(double valor_Total_Pagamento) {
		this.valor_Total_Pagamento = valor_Total_Pagamento;
	}

	public int getNumero_documento_Pagamento() {
		return numero_documento_Pagamento;
	}

	public void setNumero_documento_Pagamento(int numero_documento_Pagamento) {
		this.numero_documento_Pagamento = numero_documento_Pagamento;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(int id_imovel) {
		this.id_imovel = id_imovel;
	}
}
