package semana2.pizza;

import java.util.*;

class Pizza {

	private List<String> ingPizzas = new ArrayList<String>();

	void adicionaIngrediente(String ingrediente) {
		ingPizzas.add(ingrediente);
		contabilizaIngrediente(ingrediente, 1);
	}

	int getQtdIngredientes() {
		return ingPizzas.size();
	}

	int getPreco() {
		int precoPizza = 0;
		int qtd = getQtdIngredientes();
		int precoParcial = 0;
		if (qtd <= 2) {
			precoParcial = 15;
		} else if (qtd <= 5) {
			precoParcial = 20;
		} else {
			precoParcial = 23;
		}
		precoPizza += precoParcial;
		return precoPizza;
	}

	static void contabilizaIngrediente(String chave, int valor) {
		if (totalPizzas.containsKey(chave)) {
			totalPizzas.put(chave, totalPizzas.get(chave) + 1);
		} else {
			totalPizzas.put(chave, valor);
		}
	}
	
	public static void mostraIngredientes() {
		System.out.println("QTD  Ingrediente");
		for(Map.Entry<String, Integer> totalPizzas : totalPizzas.entrySet()) {
			System.out.println(totalPizzas.getValue() + "  | "+ totalPizzas.getKey());
		}
	}

}