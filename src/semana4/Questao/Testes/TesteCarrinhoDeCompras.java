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
	//Adiciona o mesmo produto (aumenta quantidades), e calcula preco do carrinho.
	void adicionaAoCarrinho() {
	carrinho.adicionaProduto(p, 1);
	carrinho.adicionaProduto(p, 3);
	assertEquals(16.00, carrinho.calculaCarrinho());
	}

	@Test
	void adicionaAoCarrinhoMesmoCodigTamDif(){
	//Exp. 12 / cod 2020, porem tamanhos diferentes
	carrinho.adicionaProduto(p, 1);
	carrinho.adicionaProduto(p1, 1);
	assertEquals(12,carrinho.calculaCarrinho());
	}

	@Test
	void adicionaAoCarrinhoMesmoCodigTamDifVarios(){
		//cod 2020, porem tamanhos diferentes
		carrinho.adicionaProduto(p, 3);//12
		carrinho.adicionaProduto(p1, 4);//32
		assertEquals(44,carrinho.calculaCarrinho());
	}

	@Test
	void testeRemover(){
		carrinho.adicionaProduto(p, 1);
		carrinho.adicionaProduto(p3, 2);
		carrinho.removeProduto(p,1);
		assertEquals(2,carrinho.qtdDeItens());
	}

	@Test
	void testeRemover2(){
		carrinho.adicionaProduto(p, 4);
		carrinho.adicionaProduto(p3, 4);
		carrinho.removeProduto(p3,4);
		carrinho.removeProduto(p,4);
		assertEquals(0,carrinho.qtdDeItens());
	}

	@Test
	void testeRemoverMaisDoQExiste(){
		//Nao ira remover
		carrinho.adicionaProduto(p, 4);
		carrinho.removeProduto(p,5);
		assertEquals(4,carrinho.qtdDeItens());
	}

	@Test
	void testQtdDeItensnoCarrinho() {
		carrinho.adicionaProduto(p, 4);
		carrinho.adicionaProduto(c1, 2);
		carrinho.adicionaProduto(p3, 4);
		carrinho.adicionaProduto(p2, 2);
		carrinho.adicionaProduto(p2, 1);
		carrinho.adicionaProduto(p, 1);
		assertEquals(14, carrinho.qtdDeItens());
	}

	@Test
	void testQtdDeProdutosCarrinho(){
		carrinho.adicionaProduto(p, 4);
		carrinho.adicionaProduto(c1, 2);
		carrinho.adicionaProduto(p3, 4);
		carrinho.adicionaProduto(p2, 2);
		carrinho.adicionaProduto(p2, 1);
		carrinho.adicionaProduto(p, 1);
		assertEquals(4,carrinho.qtdDeProduto());
	}
}