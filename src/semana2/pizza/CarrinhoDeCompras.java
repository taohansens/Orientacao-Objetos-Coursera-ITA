package semana2.pizza;

import java.util.*;

public class CarrinhoDeCompras {

	private static List<Pizza> pizzas = new ArrayList<Pizza>();

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

	protected int qtdPizzasCarrinho() {
		return pizzas.size();
	}
	
	public static void zerarCarrinho() {
		pizzas.clear();
	}
	
	public void listIngCarrinho() {
		for (Pizza item : pizzas) {
			System.out.println("ING "+item.getQtdIngredientes()+"\nPreco "+item.getPreco());
		}
	}
}
