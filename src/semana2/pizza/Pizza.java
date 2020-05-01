package semana2.pizza;

import java.util.*;

class Pizza {
	
	private static HashMap<String, Integer> totalPizzas = new HashMap<String, Integer>();
	private List<String> ingPizzas = new ArrayList<String>();

	protected void adicionaIngrediente(String ingrediente) {
		ingPizzas.add(ingrediente);
		contabilizaIngrediente(ingrediente, 1);
	}

	protected int getQtdIngredientes() {
		return ingPizzas.size();
	}
	
	protected void zeraIngredientes() {
		ingPizzas.clear();
	}

	protected int getPreco() {
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

	private static void contabilizaIngrediente(String chave, int valor) {
		if (totalPizzas.containsKey(chave)) {
			totalPizzas.put(chave, totalPizzas.get(chave) + 1);
		} else {
			totalPizzas.put(chave, valor);
		}
	}
	
	protected static void mostraIngredientes() {
		System.out.println("QTD  Ingrediente");
		for(Map.Entry<String, Integer> totalPizzas : totalPizzas.entrySet()) {
			System.out.println(totalPizzas.getValue() + "  | "+ totalPizzas.getKey());
		}
	}
	
	protected void zerarVariaveis() {
		totalPizzas.clear();
		zeraIngredientes();
	}

}