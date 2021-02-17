package ProjetoImob.model.domain;

import java.sql.Date;

public class PesquisaCadastral extends Email{

	private int id_Pesquisa;

	private int id_Codigo_Pesquisa_Cadastral;

	private int codigo_Cliente;

	private Date data_Pesquisa;

	private String situacao_Pesquisa;

	private Date data_proxima_pesquisa;



	public int getId_Pesquisa() {
		return id_Pesquisa;
	}

	public void setId_Pesquisa(int id_Pesquisa) {
		this.id_Pesquisa = id_Pesquisa;
	}

	public int getId_Codigo_Pesquisa_Cadastral() {
		return id_Codigo_Pesquisa_Cadastral;
	}

	public void setId_Codigo_Pesquisa_Cadastral(int id_Codigo_Pesquisa_Cadastral) {
		this.id_Codigo_Pesquisa_Cadastral = id_Codigo_Pesquisa_Cadastral;
	}

	public int getCodigo_Cliente() {
		return codigo_Cliente;
	}

	public void setCodigo_Cliente(int codigo_Cliente) {
		this.codigo_Cliente = codigo_Cliente;
	}

	public Date getData_Pesquisa() {
		return data_Pesquisa;
	}

	public void setData_Pesquisa(Date data_Pesquisa) {
		this.data_Pesquisa = data_Pesquisa;
	}

	public String getSituacao_Pesquisa() {
		return situacao_Pesquisa;
	}

	public void setSituacao_Pesquisa(String situacao_Pesquisa) {
		this.situacao_Pesquisa = situacao_Pesquisa;
	}

	public Date getData_proxima_pesquisa() {
		return data_proxima_pesquisa;
	}

	public void setData_proxima_pesquisa(Date data_proxima_pesquisa) {
		this.data_proxima_pesquisa = data_proxima_pesquisa;
	}
}
