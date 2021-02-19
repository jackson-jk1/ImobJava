package ProjetoImob.model.domain;

public class ImovelRural extends ImovelGeral{

	private int id_imovel_R;

	private String numero_Itr;

	private int area_Total;

	private int unidade_Area_Imovel;

	private int area_app;

	private int area_Utilizavel;

	private String tem_curral;

	private String tem_casa_sede;

	private String tem_casa_funcionarios;

	private String tem_represa;

	private String tem_poco_artesiano;

	private String tem_rio;

	public int getId_imovel_R() {
		return id_imovel_R;
	}

	public void setId_imovel_R(int id_imovel_R) {
		this.id_imovel_R = id_imovel_R;
	}

	public String getNumero_Itr() {
		return numero_Itr;
	}

	public void setNumero_Itr(String numero_Itr) {
		this.numero_Itr = numero_Itr;
	}

	public int getArea_Total() {
		return area_Total;
	}

	public void setArea_Total(int area_Total) {
		this.area_Total = area_Total;
	}

	public int getUnidade_Area_Imovel() {
		return unidade_Area_Imovel;
	}

	public void setUnidade_Area_Imovel(int unidade_Area_Imovel) {
		this.unidade_Area_Imovel = unidade_Area_Imovel;
	}

	public int getArea_app() {
		return area_app;
	}

	public void setArea_app(int area_app) {
		this.area_app = area_app;
	}

	public int getArea_Utilizavel() {
		return area_Utilizavel;
	}

	public void setArea_Utilizavel(int area_Utilizavel) {
		this.area_Utilizavel = area_Utilizavel;
	}

	public String getTem_curral() {
		return tem_curral;
	}

	public void setTem_curral(String tem_curral) {
		this.tem_curral = tem_curral;
	}

	public String getTem_casa_sede() {
		return tem_casa_sede;
	}

	public void setTem_casa_sede(String tem_casa_sede) {
		this.tem_casa_sede = tem_casa_sede;
	}

	public String getTem_casa_funcionarios() {
		return tem_casa_funcionarios;
	}

	public void setTem_casa_funcionarios(String tem_casa_funcionarios) {
		this.tem_casa_funcionarios = tem_casa_funcionarios;
	}

	public String getTem_represa() {
		return tem_represa;
	}

	public void setTem_represa(String tem_represa) {
		this.tem_represa = tem_represa;
	}

	public String getTem_poco_artesiano() {
		return tem_poco_artesiano;
	}

	public void setTem_poco_artesiano(String tem_poco_artesiano) {
		this.tem_poco_artesiano = tem_poco_artesiano;
	}

	public String getTem_rio() {
		return tem_rio;
	}

	public void setTem_rio(String tem_rio) {
		this.tem_rio = tem_rio;
	}
}
