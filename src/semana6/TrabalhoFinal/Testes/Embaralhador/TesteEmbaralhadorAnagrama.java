package semana6.TrabalhoFinal.Testes.Embaralhador;

import semana6.TrabalhoFinal.EmbaralhadorAnagrama;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteEmbaralhadorAnagrama {
	EmbaralhadorAnagrama p = new EmbaralhadorAnagrama();

	//Testa se a palavra "cachorro" estah sendo invertida
	@Test
	void geraAnagrama() {
		String anagrama = p.embaralhar("gato");
		assertEquals("", anagrama);
	}
}