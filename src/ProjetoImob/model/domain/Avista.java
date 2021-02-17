package ProjetoImob.model.domain;

import java.util.Date;

public class Avista extends Pagamentos{

	private int id_Avista;

	private int id_Codigo_Avista;

	private int id_cliente;

	public int getId_Avista() {
		return id_Avista;
	}

	public void setId_Avista(int id_Avista) {
		this.id_Avista = id_Avista;
	}

	public int getId_Codigo_Avista() {
		return id_Codigo_Avista;
	}

	public void setId_Codigo_Avista(int id_Codigo_Avista) {
		this.id_Codigo_Avista = id_Codigo_Avista;
	}

	@Override
	public int getId_cliente() {
		return id_cliente;
	}

	@Override
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
}
