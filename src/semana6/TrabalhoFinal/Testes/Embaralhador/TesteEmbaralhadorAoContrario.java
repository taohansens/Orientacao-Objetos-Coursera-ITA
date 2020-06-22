package semana6.TrabalhoFinal.Testes.Embaralhador;
import org.junit.jupiter.api.Test;
import semana6.TrabalhoFinal.EmbaralhadorAoContrario;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TesteEmbaralhadorAoContrario {
	EmbaralhadorAoContrario p = new EmbaralhadorAoContrario();
	String palavra1 = "cachorro";
	String palavra2 = "gato";

	//Testa se a palavra "cachorro" estah sendo invertida
	@Test
	void invertePalavra() {
	String palavraInvertida = p.embaralhar(palavra1);
	assertEquals("orrohcac", palavraInvertida);
	}

	//Testa se a palavra "gato" estah sendo invertida
	@Test
	void invertePalavra2() {
		String palavraInvertida = p.embaralhar(palavra2);
		assertEquals("otag", palavraInvertida);
	}
}