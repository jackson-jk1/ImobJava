package ProjetoImob.model.domain;

import java.sql.Date;

public class PessoaJuridica {

	private int idPessoaPJ;

	private int id_Codigo_Pessoa;

	private String razao_Social;

	private String nome_Fantasma;

	private String cnpj;

	private String inscriçao_Estadual;

	private String isento_inscricao_E;

	private String atividades_Principais;

	private String atividades_Secundarias;

	private Date data_Abertura_Empresa;

	private String anotacoes;

	private String status_cadastro;


	public int getIdPessoaPJ() {
		return idPessoaPJ;
	}

	public void setIdPessoaPJ(int idPessoaPJ) {
		this.idPessoaPJ = idPessoaPJ;
	}

	public int getId_Codigo_Pessoa() {
		return id_Codigo_Pessoa;
	}

	public void setId_Codigo_Pessoa(int id_Codigo_Pessoa) {
		this.id_Codigo_Pessoa = id_Codigo_Pessoa;
	}

	public String getRazao_Social() {
		return razao_Social;
	}

	public void setRazao_Social(String razao_Social) {
		this.razao_Social = razao_Social;
	}

	public String getNome_Fantasma() {
		return nome_Fantasma;
	}

	public void setNome_Fantasma(String nome_Fantasma) {
		this.nome_Fantasma = nome_Fantasma;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscriçao_Estadual() {
		return inscriçao_Estadual;
	}

	public void setInscriçao_Estadual(String inscriçao_Estadual) {
		this.inscriçao_Estadual = inscriçao_Estadual;
	}

	public String getIsento_inscricao_E() {
		return isento_inscricao_E;
	}

	public void setIsento_inscricao_E(String isento_inscricao_E) {
		this.isento_inscricao_E = isento_inscricao_E;
	}

	public String getAtividades_Principais() {
		return atividades_Principais;
	}

	public void setAtividades_Principais(String atividades_Principais) {
		this.atividades_Principais = atividades_Principais;
	}

	public String getAtividades_Secundarias() {
		return atividades_Secundarias;
	}

	public void setAtividades_Secundarias(String atividades_Secundarias) {
		this.atividades_Secundarias = atividades_Secundarias;
	}

	public Date getData_Abertura_Empresa() {
		return data_Abertura_Empresa;
	}

	public void setData_Abertura_Empresa(Date data_Abertura_Empresa) {
		this.data_Abertura_Empresa = data_Abertura_Empresa;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getStatus_cadastro() {
		return status_cadastro;
	}

	public void setStatus_cadastro(String status_cadastro) {
		this.status_cadastro = status_cadastro;
	}
}
