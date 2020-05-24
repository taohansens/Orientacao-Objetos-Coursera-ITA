package semana4.Questao.Testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semana4.Questao.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteCarrinhoDeCompras {
	Produto p; 	Produto p1; Produto p2;	Produto p3;
	Produto c1;	Produto c2;	Produto c3;

	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	@BeforeEach
	//Produtos com tamanho e sem tamanho,
	public void inicializaProdutos() {
		p = new ProdutoComTamanho("Caneta", 2020, 4.00, 'p');
		p1 = new ProdutoComTamanho("Caneta Maior", 2020, 8.00, 'g');
		p2 = new Produto("borracha", 2021, 3.5);
		p3 = new Produto("papel", 2122, 20.10);
		c1 = new ProdutoComTamanho("Meia", 2120, 20.00, 'g');
		c2 = new ProdutoComTamanho("Camisa", 2125, 70.50, 'm');
		c3 = new Produto("Chinelo", 2123, 30.00);
	}

	@Test
	void adicionaAoCarrinho() {


	}
}