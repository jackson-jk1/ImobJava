package ProjetoImob.model.domain;

import java.sql.Date;

public class Funcionario extends PessoaFisica{

	private int id_Funcionario;

	private int id_Codigo_Funcionario;

	private String cargo;

	private Date data_Admissao;

	private Date data_Demissao;

	private double salario_Inicial;

	private double salario_Atual;

	private String anotacoes;

	public int getId_Funcionario() {
		return id_Funcionario;
	}

	public void setId_Funcionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}

	public int getId_Codigo_Funcionario() {
		return id_Codigo_Funcionario;
	}

	public void setId_Codigo_Funcionario(int id_Codigo_Funcionario) {
		this.id_Codigo_Funcionario = id_Codigo_Funcionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getData_Admissao() {
		return data_Admissao;
	}

	public void setData_Admissao(Date data_Admissao) {
		this.data_Admissao = data_Admissao;
	}

	public Date getData_Demissao() {
		return data_Demissao;
	}

	public void setData_Demissao(Date data_Demissao) {
		this.data_Demissao = data_Demissao;
	}

	public double getSalario_Inicial() {
		return salario_Inicial;
	}

	public void setSalario_Inicial(double salario_Inicial) {
		this.salario_Inicial = salario_Inicial;
	}

	public double getSalario_Atual() {
		return salario_Atual;
	}

	public void setSalario_Atual(double salario_Atual) {
		this.salario_Atual = salario_Atual;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
}
