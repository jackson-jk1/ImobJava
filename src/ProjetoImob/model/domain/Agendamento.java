package ProjetoImob.model.domain;

import java.util.Date;
import java.sql.Time;

public class Agendamento {

	private int id_Agendamento;

	private int id_Codigo_Agendamento;

	private Date data_Agendamento;

	private Time hora_Agendamento;

	private String anotacoes;

	private String status;

	private String reagendamento;

	private Date data_Reagendamento;

	private Time hora_Reagendamento;

    private int id_cliente;

    private int id_imovel;

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(int id_imovel) {
		this.id_imovel = id_imovel;
	}

	public int getId_Agendamento() {
		return id_Agendamento;
	}

	public void setId_Agendamento(int id_Agendamento) {
		this.id_Agendamento = id_Agendamento;
	}

	public int getId_Codigo_Agendamento() {
		return id_Codigo_Agendamento;
	}

	public void setId_Codigo_Agendamento(int id_Codigo_Agendamento) {
		this.id_Codigo_Agendamento = id_Codigo_Agendamento;
	}

	public Date getData_Agendamento() {
		return data_Agendamento;
	}

	public void setData_Agendamento(Date data_Agendamento) {
		this.data_Agendamento = data_Agendamento;
	}

	public Time getHora_Agendamento() {
		return hora_Agendamento;
	}

	public void setHora_Agendamento(Time hora_Agendamento) {
		this.hora_Agendamento = hora_Agendamento;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReagendamento() {
		return reagendamento;
	}

	public void setReagendamento(String reagendamento) {
		this.reagendamento = reagendamento;
	}

	public Date getData_Reagendamento() {
		return data_Reagendamento;
	}

	public void setData_Reagendamento(Date data_Reagendamento) {
		this.data_Reagendamento = data_Reagendamento;
	}

	public Time getHora_Reagendamento() {
		return hora_Reagendamento;
	}

	public void setHora_Reagendamento(Time hora_Reagendamento) {
		this.hora_Reagendamento = hora_Reagendamento;
	}
}
