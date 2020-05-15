package Carro;

public class Principal {

	public static void main(String[] args) {		
		
		/*Carro.Carro c1 = new Carro.Carro();
		c1.potencia = 10;
		c1.nome = "Corcel";
		c1.velocidade = 0;
		
		Carro.Carro c2 = new Carro.Carro();
		c2.potencia = 15;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		Carro.Carro c3 = new Carro.Carro();
		c3.potencia = 10;
		c3.nome = "Corcel";
		c3.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		c1.frear();
		c2.frear();
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		*/
		
		Carro f = new Carro(100, 180, "Corsa");
		f.acelerar();
		f.acelerar();
		f.frear();
		f.imprime();
	}

}
