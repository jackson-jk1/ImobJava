package ProjetoImob.model.domain;

public class Cidade extends Estados{

	private int idCidade;

	private String nome_Cidade;

	private int id_Estado;

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getNome_Cidade() {
		return nome_Cidade;
	}

	public void setNome_Cidade(String nome_Cidade) {
		this.nome_Cidade = nome_Cidade;
	}

	public int getId_Estado() {
		return id_Estado;
	}

	public void setId_Estado(int id_Estado) {
		this.id_Estado = id_Estado;
	}
}
