package ProjetoImob.model.domain;

public class ImovelGeral {

	private int id_imovel;

	private int id_Codigo_Imovel;

	private String status_venda;

	private String status_locacao;

	private String numero_Matricula;

	private String tipo_imovel;

	private String fotos;

	private String anotacoes;

	private String qualidade_Localizacao;

	private String qualidade_De_Acesso;

	public int getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(int id_imovel) {
		this.id_imovel = id_imovel;
	}

	public int getId_Codigo_Imovel() {
		return id_Codigo_Imovel;
	}

	public void setId_Codigo_Imovel(int id_Codigo_Imovel) {
		this.id_Codigo_Imovel = id_Codigo_Imovel;
	}

	public String getStatus_venda() {
		return status_venda;
	}

	public void setStatus_venda(String status_venda) {
		this.status_venda = status_venda;
	}

	public String getStatus_locacao() {
		return status_locacao;
	}

	public void setStatus_locacao(String status_locacao) {
		this.status_locacao = status_locacao;
	}

	public String getNumero_Matricula() {
		return numero_Matricula;
	}

	public void setNumero_Matricula(String numero_Matricula) {
		this.numero_Matricula = numero_Matricula;
	}

	public String getTipo_imovel() {
		return tipo_imovel;
	}

	public void setTipo_imovel(String tipo_imovel) {
		this.tipo_imovel = tipo_imovel;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getQualidade_Localizacao() {
		return qualidade_Localizacao;
	}

	public void setQualidade_Localizacao(String qualidade_Localizacao) {
		this.qualidade_Localizacao = qualidade_Localizacao;
	}

	public String getQualidade_De_Acesso() {
		return qualidade_De_Acesso;
	}

	public void setQualidade_De_Acesso(String qualidade_De_Acesso) {
		this.qualidade_De_Acesso = qualidade_De_Acesso;
	}
}
