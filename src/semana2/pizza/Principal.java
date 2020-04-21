package semana2.pizza;

public class Principal {
	public static void main(String[] args) {
        
		Pizza vazia = new Pizza();
		//Pizza sem ingredientes, não deve ser adicionada
		//ao carrinho.
		
		Pizza simples = new Pizza();
        simples.adicionaIngrediente("Tomate");
        simples.adicionaIngrediente("Azeitona");
        //Pizza com 2 Ingredientes = R$15.
        
       
        Pizza marguerita = new Pizza();
        marguerita.adicionaIngrediente("Orégano");
        marguerita.adicionaIngrediente("Tomate");
        marguerita.adicionaIngrediente("Presunto");
        //Pizza com 3 Ingredientes = R$20.
        
        
        Pizza especial = new Pizza();
        especial.adicionaIngrediente("Tomate");
        especial.adicionaIngrediente("Queijo");
        especial.adicionaIngrediente("Orégano");
        especial.adicionaIngrediente("Azeitona");
        especial.adicionaIngrediente("Presunto");
        especial.adicionaIngrediente("Palmito");
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        //Adiciona as pizzas ao carrinho.
        carrinho.adicionaPizza(vazia); //não irá ser adicionada 
        carrinho.adicionaPizza(simples);
        carrinho.adicionaPizza(marguerita);
        carrinho.adicionaPizza(especial);
        
        
        //Imprime o valor total do carrinho.
        System.out.println("Valor Total do Carrinho: R$" + carrinho.getTotalPreco());
        //Método que imprime todos os ingredientes
        System.out.println("\nForam utilizados:");
        Pizza.mostraIngredientes();
       
	}
}