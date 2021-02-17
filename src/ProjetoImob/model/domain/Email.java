package ProjetoImob.model.domain;

public class Email extends Telefones {

	private int id_Email;

	private int id_Codigo_Email;

	private int tipo_email;

	private String email;

	public int getId_Email() {
		return id_Email;
	}

	public void setId_Email(int id_Email) {
		this.id_Email = id_Email;
	}

	public int getId_Codigo_Email() {
		return id_Codigo_Email;
	}

	public void setId_Codigo_Email(int id_Codigo_Email) {
		this.id_Codigo_Email = id_Codigo_Email;
	}

	public int getTipo_email() {
		return tipo_email;
	}

	public void setTipo_email(int tipo_email) {
		this.tipo_email = tipo_email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
