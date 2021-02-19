package ProjetoImob.model.domain;

import java.sql.Date;
import java.sql.Time;

public class Avisado extends Agendamento {

	private int id_aviso;

	private int id_codigo_aviso;

	private Date data_aviso;

	private int id_cliente;

	private String tipo_aviso;

	private String assunto_aviso;

	private String mensagem_aviso;

	private  String resposta;

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public int getId_aviso() {
		return id_aviso;
	}

	public void setId_aviso(int id_aviso) {
		this.id_aviso = id_aviso;
	}

	public int getId_codigo_aviso() {
		return id_codigo_aviso;
	}

	public void setId_codigo_aviso(int id_codigo_aviso) {
		this.id_codigo_aviso = id_codigo_aviso;
	}

	public Date getData_aviso() {
		return data_aviso;
	}

	public void setData_aviso(Date data_aviso) {
		this.data_aviso = data_aviso;
	}

	@Override
	public int getId_cliente() {
		return id_cliente;
	}

	@Override
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getTipo_aviso() {
		return tipo_aviso;
	}

	public void setTipo_aviso(String tipo_aviso) {
		this.tipo_aviso = tipo_aviso;
	}

	public String getAssunto_aviso() {
		return assunto_aviso;
	}

	public void setAssunto_aviso(String assunto_aviso) {
		this.assunto_aviso = assunto_aviso;
	}

	public String getMensagem_aviso() {
		return mensagem_aviso;
	}

	public void setMensagem_aviso(String mensagem_aviso) {
		this.mensagem_aviso = mensagem_aviso;
	}
}
