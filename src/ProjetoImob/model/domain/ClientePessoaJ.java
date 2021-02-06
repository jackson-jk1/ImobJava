package ProjetoImob.model.domain;

public class ClientePessoaJ extends PessoaJuridica{

	private int id_clienteJ;

	private int id_codigo_pessoaJ;

	private int attribute198;

	private String status_comprador;

	private String status_vendedor;

	private String status_locador;

	private String status_locatario;

	public int getId_clienteJ() {
		return id_clienteJ;
	}

	public void setId_clienteJ(int id_clienteJ) {
		this.id_clienteJ = id_clienteJ;
	}

	public int getId_codigo_pessoaJ() {
		return id_codigo_pessoaJ;
	}

	public void setId_codigo_pessoaJ(int id_codigo_pessoaJ) {
		this.id_codigo_pessoaJ = id_codigo_pessoaJ;
	}

	public int getAttribute198() {
		return attribute198;
	}

	public void setAttribute198(int attribute198) {
		this.attribute198 = attribute198;
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
