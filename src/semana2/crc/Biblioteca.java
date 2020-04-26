package semana2.crc;

import java.util.*;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<Livro>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	protected void adicionaUsuario(Usuario u) {
		if (usuarios.size() == 0) {
			usuarios.add(u);
		}else {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getNomeUsuario() != u.getNomeUsuario() ) {
				usuarios.add(u);
			} 
			else {
				System.out.println("Usuario existe");
				continue;
			}
		}
		}
	}
	
	//TODO remover usuario
	protected void removerUsuario(Usuario u) {
	}
	
	protected void adicionaLivro(Livro l) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getCodUnico() != l.getCodUnico()) {
				livros.add(l);
			} else {
				int qtdAtual = livros.get(i).getQtdExemplares();
				livros.get(i).setQtdExemplares(qtdAtual ++);
				System.out.println("Adicionado novo exemplar do livro ("+livros.get(i).getAutor()+")");
			}
		}
	}
	
	
	//TODO remover livro
	protected void removerLivro(Livro l) {
	}
}
