package ProjetoImob.model.domain;

public class ImovelUrbano extends ImovelGeral{

	private int id_Imovel_U;

	private String numero_Iptu;

	private int area_Total;

	private int area_Construida;

	private int quant_banheiros;

	private int quant_dormitorios;

	private int quant_sala;

	private int quant_suite;

	private int quant_garagem_carro;

	private String tem_garagem;

	private String tem_edicula;

	private String tem_churrasquira;

	public int getId_Imovel_U() {
		return id_Imovel_U;
	}

	public void setId_Imovel_U(int id_Imovel_U) {
		this.id_Imovel_U = id_Imovel_U;
	}

	public String getNumero_Iptu() {
		return numero_Iptu;
	}

	public void setNumero_Iptu(String numero_Iptu) {
		this.numero_Iptu = numero_Iptu;
	}

	public int getArea_Total() {
		return area_Total;
	}

	public void setArea_Total(int area_Total) {
		this.area_Total = area_Total;
	}

	public int getArea_Construida() {
		return area_Construida;
	}

	public void setArea_Construida(int area_Construida) {
		this.area_Construida = area_Construida;
	}

	public int getQuant_banheiros() {
		return quant_banheiros;
	}

	public void setQuant_banheiros(int quant_banheiros) {
		this.quant_banheiros = quant_banheiros;
	}

	public int getQuant_dormitorios() {
		return quant_dormitorios;
	}

	public void setQuant_dormitorios(int quant_dormitorios) {
		this.quant_dormitorios = quant_dormitorios;
	}

	public int getQuant_sala() {
		return quant_sala;
	}

	public void setQuant_sala(int quant_sala) {
		this.quant_sala = quant_sala;
	}

	public int getQuant_suite() {
		return quant_suite;
	}

	public void setQuant_suite(int quant_suite) {
		this.quant_suite = quant_suite;
	}

	public int getQuant_garagem_carro() {
		return quant_garagem_carro;
	}

	public void setQuant_garagem_carro(int quant_garagem_carro) {
		this.quant_garagem_carro = quant_garagem_carro;
	}

	public String getTem_garagem() {
		return tem_garagem;
	}

	public void setTem_garagem(String tem_garagem) {
		this.tem_garagem = tem_garagem;
	}

	public String getTem_edicula() {
		return tem_edicula;
	}

	public void setTem_edicula(String tem_edicula) {
		this.tem_edicula = tem_edicula;
	}

	public String getTem_churrasquira() {
		return tem_churrasquira;
	}

	public void setTem_churrasquira(String tem_churrasquira) {
		this.tem_churrasquira = tem_churrasquira;
	}
}
