package ProjetoImob.model.domain;

public class ClientePessoaJ extends PessoaJuridica{

	private int id_clientePJ;

	private int id_codigo_pessoaPJ;


	private String status_comprador;

	private String status_vendedor;

	private String status_locador;

	private String status_locatario;

	public int getId_clientePJ() {
		return id_clientePJ;
	}

	public void setId_clientePJ(int id_clienteJ) {
		this.id_clientePJ = id_clienteJ;
	}

	public int getId_codigo_pessoaPJ() {
		return id_codigo_pessoaPJ;
	}

	public void setId_codigo_pessoaPJ(int id_codigo_pessoaPJ) {
		this.id_codigo_pessoaPJ = id_codigo_pessoaPJ;
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
