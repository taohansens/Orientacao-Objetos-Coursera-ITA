package semana2.pizza;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;

class TestesPìzza {
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	Pizza pizza = new Pizza();
	Pizza pizza2 = new Pizza();
	Pizza pizza3 = new Pizza();

	@AfterEach
	public void reset() {
		pizza.zerarVariaveis();
		pizza2.zerarVariaveis();
		pizza3.zerarVariaveis();
		CarrinhoDeCompras.zerarCarrinho();
}

	@Test
	void testaValorCom2Ing() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Azeitona");
		assertEquals(15, pizza.getPreco());
	}

	@Test
	void testaValorCom3Ing() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Azeitona");
		pizza.adicionaIngrediente("Alho Poro");
		assertEquals(20, pizza.getPreco());
	}

	@Test
	void testaValorCom5Ing() {
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
	void testaCarrinho0Elementos() {
		carrinho.adicionaPizza(pizza);
		assertEquals(0, carrinho.qtdPizzasCarrinho());
	}
	
	@Test
	void testaCarrinhoQtd2Pizzas() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Oregano");
		carrinho.adicionaPizza(pizza);
		
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Cebola");
		carrinho.adicionaPizza(pizza2);
		assertEquals(2, carrinho.qtdPizzasCarrinho());
	}
	
	@Test
	void testaValorCarrinho1Pizza() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Oregano");
		carrinho.adicionaPizza(pizza);
		
		assertEquals(20, carrinho.getTotalPreco());
	}
	
	@Test
	void testaValorCarrinho3Pizzas() {
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Oregano");
		carrinho.adicionaPizza(pizza);
		
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Cebola");
		carrinho.adicionaPizza(pizza2);
		
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Cebola");
		carrinho.adicionaPizza(pizza3);

		assertEquals(50, carrinho.getTotalPreco());
	}
	
}
