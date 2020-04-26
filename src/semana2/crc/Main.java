package semana2.crc;

import java.util.Scanner;

public class Main {
	static Biblioteca sab = new Biblioteca();
	static GUI exibe = new GUI();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		do {
			exibe.menuPrincipal();
			int escolha = coletarOpcaoDesejada();
			switch (escolha) {
			case 1:
				exibe.menuUsuarios();
					escolha = coletarOpcaoDesejada();
					switch (escolha) {
					case 1:
						Usuario novoUsuario = criarUsuario();
						sab.adicionaUsuario(novoUsuario);
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 0:
						break;
					}
					break;
			case 2:
				exibe.menuLivros();
				escolha = coletarOpcaoDesejada();
				switch (escolha) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					break;
				}
				break;
			default:
				break;
			}
		} while (true);
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}
	
	private static Usuario criarUsuario() {
		System.out.print("Digite o nome do usuario: ");
		String username = sc.nextLine();

		return new Usuario(username);
	}
}
