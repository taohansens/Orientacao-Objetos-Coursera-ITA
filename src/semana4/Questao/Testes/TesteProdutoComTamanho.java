package semana4.Questao.Testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semana4.Questao.Produto;
import semana4.Questao.ProdutoComTamanho;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteProdutoComTamanho {
	Produto p; Produto p1; Produto p2; Produto p3;Produto p4; Produto p5;

	@BeforeEach
	public void inicializaProdutos(){
		p = new ProdutoComTamanho("caneta", 1010,2.00, 'a');
		p1 = new ProdutoComTamanho("caneta2", 1010,2.00, 'a');
		p2 = new ProdutoComTamanho("caneta3", 1010,2.00, 'b');
		p3 = new ProdutoComTamanho("lapis", 1011,1.00, 'a');
		p4 = new ProdutoComTamanho("borracha", 1021,1.5, 'p');
	}

	@Test
	//Verifica se iguais com mesmo codigo e mesmo tamanho.
	void verificaIguais() {
		assertEquals(p,p1);
	}

	@Test
	//Verifica se sao diferentes com mesmo codigo e tamanho diferente.
	void verificaDiferentes(){
		assertEquals(p,p2);
	}

	@Test
	//Verifica com codigos diferentes e tamanhos iguais
	void verificaDiferentes1(){
		assertEquals(p,p3);
	}

	@Test
	//Verifica com tudo diferente
	void verificaDiferentes2(){
		assertEquals(p,p4);
	}
}