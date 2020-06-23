package semana6.TrabalhoFinal.Testes.FabricaEmbaralhadores;

import org.junit.jupiter.api.Test;
import semana6.TrabalhoFinal.Embaralhador;
import semana6.TrabalhoFinal.EmbaralhadorAnagrama;
import semana6.TrabalhoFinal.FabricaEmbaralhadores;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteFabricaEmbaralhadores {
	FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();

	//Verifica se a fabrica estah retornando o Embaralhador 1, 2 ou 3;
	@Test
	void fabricaEmbaralhadores() {
		Embaralhador teste = new EmbaralhadorAnagrama();
		Embaralhador fabricaRetornada = fabrica.retornaEmbaralhador();
		assertEquals(teste.getClass() ,fabricaRetornada.getClass());
	}
}