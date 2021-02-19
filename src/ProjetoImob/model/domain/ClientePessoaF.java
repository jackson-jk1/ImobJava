package ProjetoImob.model.domain;

public class ClientePessoaF extends  PessoaFisica{

	private int id_clientePF;

	private int id_codigo_clientePF;

	private String status_comprador;

	private String status_vendedor;

	private String status_locador;

	private String status_locatario;

	public int getId_clientePF() {
		return id_clientePF;
	}

	public void setId_clientePF(int id_clientePF) {
		this.id_clientePF = id_clientePF;
	}

	public int getId_codigo_clientePF() {
		return id_codigo_clientePF;
	}

	public void setId_codigo_clientePF(int id_codigo_clientePF) {
		this.id_codigo_clientePF = id_codigo_clientePF;
	}

	public String getStatus_comprador() {
		return status_comprador;
	}

	public void setStatus_comprador(String status_comprador) {
		this.status_comprador = status_comprador;
	}

	public String getStatus_vendedor() {
		return status_vendedor;
	}

	public void setStatus_vendedor(String status_vendedor) {
		this.status_vendedor = status_vendedor;
	}

	public String getStatus_locador() {
		return status_locador;
	}

	public void setStatus_locador(String status_locador) {
		this.status_locador = status_locador;
	}

	public String getStatus_locatario() {
		return status_locatario;
	}

	public void setStatus_locatario(String status_locatario) {
		this.status_locatario = status_locatario;
	}
}
