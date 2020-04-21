package semana2.pizza;

import java.util.*;

public class CarrinhoDeCompras {

	protected List<Pizza> pizzas = new ArrayList<Pizza>();

	public void adicionaPizza(Pizza pizza) {
		if (pizza.getQtdIngredientes() > 0) {
			pizzas.add(pizza);
		} else {
			return;
		}
	}

	public int getTotalPreco() {
		int valorCarrinho = 0;
		for (Pizza item : pizzas) {
			valorCarrinho += item.getPreco();
		}
		return valorCarrinho;
	}
}
