package semana2.crc;

public class Usuario {
	String nomeUsuario;

	public Usuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	String getNomeUsuario() {
		return nomeUsuario;
	}

	protected void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

}
