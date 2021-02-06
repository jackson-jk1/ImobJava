package ProjetoImob.model.domain;

public class Telefones extends Email{

	private int id_telefone;

	private int id_Codigo_Telefone;

	private String tipo_telefone;

	private String numero_telefone;

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public int getId_Codigo_Telefone() {
		return id_Codigo_Telefone;
	}

	public void setId_Codigo_Telefone(int id_Codigo_Telefone) {
		this.id_Codigo_Telefone = id_Codigo_Telefone;
	}

	public String getTipo_telefone() {
		return tipo_telefone;
	}

	public void setTipo_telefone(String tipo_telefone) {
		this.tipo_telefone = tipo_telefone;
	}

	public String getNumero_telefone() {
		return numero_telefone;
	}

	public void setNumero_telefone(String numero_telefone) {
		this.numero_telefone = numero_telefone;
	}
}
