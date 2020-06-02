package semana5.FormasDeTratamento.Testes;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import semana5.FormasDeTratamento.*;

class TesteAutoridade {
    FormatadorNome fn;

    @AfterEach
    void zera() {
        fn = null;
    }

    @Test
    void testeInformal1(){
        fn = new Informal();
        Autoridade Carlos = new Autoridade("Carlos", "Andrade", fn);
        assertEquals("Carlos", Carlos.getTratamento());
    }

    @Test
    void testeInformal2(){
        FormatadorNome fn = new Informal();
        Autoridade Andressa = new Autoridade("Andressa", "Leal", fn);
        assertEquals("Andressa", Andressa.getTratamento());
    }

    @Test
    void testRespeitosoSr(){
        FormatadorNome fn = new Respeitoso(false); //False é masculino
        Autoridade Carlos = new Autoridade("Carlos", "Andrade", fn);
        assertEquals("Sr. Andrade", Carlos.getTratamento());
    }

    @Test
    void testRespeitosoSra(){
        FormatadorNome fn = new Respeitoso(true); //True é feminino.
        Autoridade Andressa = new Autoridade("Andressa", "Leal", fn);
        assertEquals("Sra. Leal", Andressa.getTratamento());
    }

    @Test
    void testComTitulo1(){
        FormatadorNome fn = new ComTitulo("V.Ex.");
        Autoridade Andressa = new Autoridade("Andressa", "Leal", fn);
        assertEquals("V.Ex. Andressa Leal", Andressa.getTratamento());
    }

    @Test
    void testComTitulo2(){
        FormatadorNome fn = new ComTitulo("V.Ex.");
        Autoridade Carlos = new Autoridade("Carlos", "Andrade", fn);
        assertEquals("V.Ex. Carlos Andrade", Carlos.getTratamento());
    }
}
