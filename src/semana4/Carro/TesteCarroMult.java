package semana4.Carro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteCarroMult {
	CarroDeCorrida c;
	@BeforeEach
	public void inicializaCarro(){
		c = new CarroMult("teste",1.5, 100);
	}

	@Test
	void testCarroParado() {
		assertEquals(0, c.getVelocidade());	
	}

	
	@Test
	void testAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());	
	}

	@Test
	void testAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());
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
}
