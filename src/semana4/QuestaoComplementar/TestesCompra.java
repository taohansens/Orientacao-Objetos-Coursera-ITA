package semana4.QuestaoComplementar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestesCompra {

    Compra c; CompraParcelada c1; CompraParcelada c2; CompraParcelada c5; CompraParcelada c10;

    @BeforeEach
    public void inicializaCompras() {
        //+7% de juros
    c = new Compra(120.00);
    c1 = new CompraParcelada(120,1,0.07);
    c2 = new CompraParcelada(120,2,0.07);
    c5 = new CompraParcelada(120,5,0.08);
    c10 = new CompraParcelada(120,10,0.09);
    }
    @Test
    void testaCompraNormal(){
        assertEquals("120",c.total().toString());
    }
    @Test
    void testaCompraaVistaComJuros(){
        assertEquals("128.40",c1.total().toString());
    }
    @Test
    void testaCompraPar2(){
        assertEquals("137.39",c2.total().toString());
    }
    @Test
    void testaCompraPar5(){
        assertEquals("176.32",c5.total().toString());
    }
    @Test
    void testaCompraPar10(){
        assertEquals("284.08",c10.total().toString());
    }

}
