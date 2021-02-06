package ProjetoImob.model.domain;

import java.sql.Time;
import java.sql.Date;

public class LoginSistema extends PessoaFisica{

	private int id_Login;

	private String usuario;

	private String senha;

	private String permissao;

	private Date data_login;

	private Time time_login;


	public int getId_Login() {
		return id_Login;
	}

	public void setId_Login(int id_Login) {
		this.id_Login = id_Login;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public Date getData_login() {
		return data_login;
	}

	public void setData_login(Date data_login) {
		this.data_login = data_login;
	}

	public Time getTime_login() {
		return time_login;
	}

	public void setTime_login(Time time_login) {
		this.time_login = time_login;
	}
}
