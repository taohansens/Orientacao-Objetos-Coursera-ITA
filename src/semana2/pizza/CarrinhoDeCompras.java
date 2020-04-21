package semana2.pizza;

import java.util.*;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<Pizza>();

	protected void adicionaPizza(Pizza pizza) {
		if (pizza.getQtdIngredientes() > 0) {
			pizzas.add(pizza);
		} else {
			return;
		}
	}

	protected int getTotalPreco() {
		int valorCarrinho = 0;
		for (Pizza item : pizzas) {
			valorCarrinho += item.getPreco();
		}
		return valorCarrinho;
	}
}
