package semana4.Questao.Testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semana4.Questao.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteProduto {
	Produto p; Produto p1; Produto p2; Produto p3;

	@BeforeEach
	public void inicializaProdutos(){
		p = new Produto("caneta", 2020,2.00);
		p1 = new Produto("lapis", 2020,1.00); //mesmo codigo, para testes;
		p2 = new Produto("borracha", 2021,1.5);
		p3 = new Produto("papel", 2122,0.50);
	}
	@Test
	//Verifica se iguais com mesmo codigo.
	void verificaIguais() {
		assertEquals(p,p1);
	}

	@Test
	//Diferentes
	void verificaDiferentes(){
		assertEquals(p2,p3);
	}

	@Test
	//Diferentes
	void verificaDiferentes1(){
		assertEquals(p,p3);
	}
}