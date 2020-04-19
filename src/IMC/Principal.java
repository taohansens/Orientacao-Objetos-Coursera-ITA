package IMC;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(92.7, 1.85);
		Paciente p2 = new Paciente(60.0, 1.58);
		Paciente p3 = new Paciente(100.7, 1.70);
		
		p1.imprime();
		p2.imprime();
		p3.imprime();
		
	}
}