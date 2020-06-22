package semana6.TrabalhoFinal.Testes.FabricaEmbaralhadores;

import org.junit.jupiter.api.Test;
import semana6.TrabalhoFinal.EmbaralhadorAnagrama;
import semana6.TrabalhoFinal.FabricaEmbaralhadores;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteFabricaEmbaralhadores {
	FabricaEmbaralhadores p = new FabricaEmbaralhadores();

	//Testa se está retornando 1 ou 2
	@Test
	void fabricaEmbaralhadores() {
		int numero = p.retornaEmbaralhador();
		assertEquals("2", numero);
	}

	//Testa se está retornando 1 ou 2
	@Test
	void fabricaEmbaralhadores2() {
		int numero = p.retornaEmbaralhador();
		assertEquals("2", numero);
	}

	//Testa se está retornando 1 ou 2
	@Test
	void fabricaEmbaralhadores3() {
		int numero = p.retornaEmbaralhador();
		assertEquals("1", numero);
	}
}