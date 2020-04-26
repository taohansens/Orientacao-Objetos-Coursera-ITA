package semana2.crc;


public class GUI {

	public void menuPrincipal() {
		System.out.println("\n::: SAB (Sistema de Automacao da Biblioteca :::");
		System.out.println(":::- Menu Principal -:::");
		System.out.println(":1: Usuarios : ");
		System.out.println(":2: Livros: ");
		System.out.println(":3: Sistema de Livros SAB: ");
		System.out.println(":0: Sair do programa :");
	}

	public void menuUsuarios() {
		System.out.println("\n## Menu Usuarios ##");
		System.out.println(":1: Adicionar Usuario :");
		System.out.println(":2: Alterar Usuario :");
		System.out.println(":3: Listar Usuarios :");
		System.out.println(":4: Listar Usuarios com pendencias:");
		System.out.println(":5: Remover Usuario :");
		System.out.println(":0: Voltar ao menu principal :\n");
	}
	public void menuLivros() {
		System.out.println("\n## Menu Livros ##");
		System.out.println(":1: Adicionar Livro :");
		System.out.println(":2: Adicionar mais exemplares do Livro :");
		System.out.println(":3: Remover Livro :");
		System.out.println(":4: Listar catalogo de Livros :");
		System.out.println(":0: Voltar ao menu principal :\n");
	}
	
	public void menuEmprestimos() {
		System.out.println("\n## SAB - Biblioteca ##");
		System.out.println(":1: Emprestar Livro :");
		System.out.println(":2: Devolver Livro :");
		System.out.println(":3: Listar catalogo de Livros :\n");
		System.out.println(":4: Mostrar pendencias de devolucao :\n");
		System.out.println(":5: Mostrar disponiveis para emprestimo :\n");
		System.out.println(":0: Voltar ao menu principal :\n");
	}

}
