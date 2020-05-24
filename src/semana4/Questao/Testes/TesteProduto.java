package semana4.Questao.Testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semana4.Questao.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteProduto {
	@Test
	void verificaSeIgual() {
		Produto p = new Produto("caneta", 93939,2.00);
		Produto p1 = new Produto("caneta", 93938,2.50);
		Produto p2 = new Produto("caneta",93939, 4.00);
		assertEquals(p,p1);
	}






	/*	CarroSoma c;
	@BeforeEach
	public void inicializaCarro(){
		c = new CarroSoma("teste",10, 100);
	}

	@Test
	void testCarroParado() {
		assertEquals(0, c.getVelocidade());	
	}

	
	@Test
	void testAcelerar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());	
	}

	@Test
	void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());	
	}
	
	@Test
	void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());	
	}

	@Test
	void testAcelerarAteVelMax() {
		for (int i=0; i<14; i++){
			c.acelerar();
		}
		assertEquals(100, c.getVelocidade());
	}
 */
}