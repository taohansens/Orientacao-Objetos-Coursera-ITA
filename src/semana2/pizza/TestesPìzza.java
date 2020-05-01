package semana2.pizza;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;

class TestesPìzza {
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	Pizza pizza = new Pizza();

	@AfterEach
	public void reset() {
		Pizza.zerarVariaveis();
		CarrinhoDeCompras.zerarVariaveis();
}

	@Test
	void testaValorPizza2() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Azeitona");
		assertEquals(15, pizza.getPreco());
	}

	@Test
	void testaValorPizza3() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Azeitona");
		pizza.adicionaIngrediente("Alho Poro");
		assertEquals(20, pizza.getPreco());
	}

	@Test
	void testaValorPizza5() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Azeitona");
		pizza.adicionaIngrediente("Alho Poro");
		pizza.adicionaIngrediente("Parmesao");
		pizza.adicionaIngrediente("Salame");
		pizza.adicionaIngrediente("Azeitona");
		assertEquals(23, pizza.getPreco());
	}
	
	@Test
	void testaQtdIngre() {
		pizza.adicionaIngrediente("Tomate");
		assertEquals(1, pizza.getQtdIngredientes());
	}
	
	@Test
	void testaQtdIngre4() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Oregano");
		assertEquals(4, pizza.getQtdIngredientes());
	}
	
	@Test
	void testaCarrinho() {

		carrinho.adicionaPizza(pizza);
		assertNull(carrinho);
	}
	
}
