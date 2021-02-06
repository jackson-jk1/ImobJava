package ProjetoImob.model.domain;

public class Bairro extends Cidade{

	private int id_Bairro;

	private String nome_Bairro;

	private int id_Cidade;

	public int getId_Bairro() {
		return id_Bairro;
	}

	public void setId_Bairro(int id_Bairro) {
		this.id_Bairro = id_Bairro;
	}

	public String getNome_Bairro() {
		return nome_Bairro;
	}

	public void setNome_Bairro(String nome_Bairro) {
		this.nome_Bairro = nome_Bairro;
	}

	public int getId_Cidade() {
		return id_Cidade;
	}

	public void setId_Cidade(int id_Cidade) {
		this.id_Cidade = id_Cidade;
	}
}
