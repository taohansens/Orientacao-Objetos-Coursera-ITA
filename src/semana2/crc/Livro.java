package semana2.crc;

public class Livro {
	private String titulo;
	private String autor;
	private int codUnico;
	private int qtdExemplares;
	private boolean emprestado;

	public Livro(int codUnico, String nome, String autor) {
		this.codUnico = codUnico;
		this.titulo = nome;
		this.autor = autor;
		this.qtdExemplares = 1;
		this.emprestado = false;
	}

	protected String getNome() {
		return titulo;
	}

	protected void setNome(String nome) {
		this.titulo = nome;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected int getCodUnico() {
		return codUnico;
	}

	protected void setCodUnico(int codUnico) {
		this.codUnico = codUnico;
	}

	protected int getQtdExemplares() {
		return qtdExemplares;
	}

	protected void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}

	protected boolean isEmprestado() {
		return emprestado;
	}

	protected void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}	
}
