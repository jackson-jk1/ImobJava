package ProjetoImob.model.domain;

public class Imobiliaria extends PessoaJuridica{

	private int id_Imobliliaria;

	private int id_Codigo_Imobiliaria;

	private int numero_Creci;

	public int getId_Imobliliaria() {
		return id_Imobliliaria;
	}

	public void setId_Imobliliaria(int id_Imobliliaria) {
		this.id_Imobliliaria = id_Imobliliaria;
	}

	public int getId_Codigo_Imobiliaria() {
		return id_Codigo_Imobiliaria;
	}

	public void setId_Codigo_Imobiliaria(int id_Codigo_Imobiliaria) {
		this.id_Codigo_Imobiliaria = id_Codigo_Imobiliaria;
	}

	public int getNumero_Creci() {
		return numero_Creci;
	}

	public void setNumero_Creci(int numero_Creci) {
		this.numero_Creci = numero_Creci;
	}
}
