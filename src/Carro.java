

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	//Construtor
	public Carro(int potencia, int velocidade, String nome) {
		super();
		this.potencia = potencia;
		this.velocidade = velocidade;
		this.nome = nome;
	}
	
	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade *= 0.5;	
	}
	
	void imprime() {
		System.out.println("O carro "+nome+" está a velocidade de "+getVelocidade()+" km/h");
		System.out.println("Potencia = "+potencia);
	}
}