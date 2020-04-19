package IMC;

public class Paciente {
	double peso;
	double altura;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	private double getPeso() {
		return peso;
	}
	
	private double getAltura() {
		return altura;
	}
	
	private double calcularIMC() {
		double imc = getPeso()/(getAltura()*getAltura());
		return imc;
	}
	
	private String diagnostico() {
		double imc = calcularIMC();
		if (imc < 16) {
			return "Baixo peso muito grave";}
		else if (imc >= 16 && imc < 17) {
			return "Baixo peso grave";}
		else if (imc >= 17 && imc <= 18.49) {
			return "Baixo peso";}
		else if (imc >= 18.50 && imc < 25) {
			return "Peso normal";}
		else if (imc >= 25 && imc < 30) {
			return "Sobrepeso";}
		else if (imc >= 30 && imc < 35) {
			return "Obesidade grau I";}
		else if (imc >= 35 && imc < 40) {
			return "Obesidade grau II";}
		else if (imc >= 40) {
			return "Obesidade grau III (Obesidade mórbida";}
		else {
			return "VALOR INVÁLIDO";}
		}

	public void imprime() {
		System.out.println(diagnostico());
		System.out.println("IMC: "+calcularIMC());
}
}
