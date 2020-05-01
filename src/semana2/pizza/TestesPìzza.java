package semana2.pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesPìzza {

	

	
	@Test
	void testaValorPizza2() {
		Pizza simples = new Pizza();
        simples.adicionaIngrediente("Tomate");
        simples.adicionaIngrediente("Azeitona");
        assertEquals(15, simples.getPreco());
	}
	
	@Test
	void testaValorPizza3() {
		Pizza simples = new Pizza();
        simples.adicionaIngrediente("Tomate");
        simples.adicionaIngrediente("Azeitona");
        simples.adicionaIngrediente("Alho Poro");
        assertEquals(20, simples.getPreco());
	}
	
	@Test
	void testaValorPizza5() {
		Pizza simples = new Pizza();
        simples.adicionaIngrediente("Tomate");
        simples.adicionaIngrediente("Azeitona");
        simples.adicionaIngrediente("Alho Poro");
        simples.adicionaIngrediente("Parmesao");
        simples.adicionaIngrediente("Salame");
        simples.adicionaIngrediente("Azeitona");
        assertEquals(20, simples.getPreco());
	}
}
