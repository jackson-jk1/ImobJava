package ProjetoImob.model.domain;

import java.sql.Date;

public class PessoaFisica extends PesquisaCadastral {

	private int idPessoaF;

	private int id_Codigo_Pessoa;

	private String nome;

	private String sobrenome;

	private String cpf;

	private String rg;

	private Date date_nascimento;

	private String sexo;

	private String estado_Civil;

	private String regime_Bens;

	private String naturalidade;

	private String estado_naturalidade;

	private String escolaridade;

	private String profissao;

	private String anotacoes;

	private String nome_Pai;

	private String nome_mae;

	private String status_cadastro;


	public int getIdPessoaF() {
		return idPessoaF;
	}

	public void setIdPessoaF(int idPessoaF) {
		this.idPessoaF = idPessoaF;
	}

	public int getId_Codigo_Pessoa() {
		return id_Codigo_Pessoa;
	}

	public void setId_Codigo_Pessoa(int id_Codigo_Pessoa) {
		this.id_Codigo_Pessoa = id_Codigo_Pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDate_nascimento() {
		return date_nascimento;
	}

	public void setDate_nascimento(Date date_nascimento) {
		this.date_nascimento = date_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado_Civil() {
		return estado_Civil;
	}

	public void setEstado_Civil(String estado_Civil) {
		this.estado_Civil = estado_Civil;
	}

	public String getRegime_Bens() {
		return regime_Bens;
	}

	public void setRegime_Bens(String regime_Bens) {
		this.regime_Bens = regime_Bens;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEstado_naturalidade() {
		return estado_naturalidade;
	}

	public void setEstado_naturalidade(String estado_naturalidade) {
		this.estado_naturalidade = estado_naturalidade;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getNome_Pai() {
		return nome_Pai;
	}

	public void setNome_Pai(String nome_Pai) {
		this.nome_Pai = nome_Pai;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public String getStatus_cadastro() {
		return status_cadastro;
	}

	public void setStatus_cadastro(String status_cadastro) {
		this.status_cadastro = status_cadastro;
	}
}
