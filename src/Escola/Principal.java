package Escola;

public class Principal {

	public static void main(String[] args) {
		Aluno tao = new Aluno();
		tao.bim1=70;
		tao.bim2=60;
		tao.bim3=80;
		tao.bim4=70;
		
		System.out.println(tao.media());
		System.out.println(tao.passouDeAno());

	}

}
