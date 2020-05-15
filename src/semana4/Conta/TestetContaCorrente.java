package semana4.Conta;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestetContaCorrente {
    ContaCorrente cc;
    @Before
    public void inicializaConta(){
        cc = new ContaCorrente();
        cc.depositar(200);
    }


    @Test
    public void deposito(){
        assertEquals(200, cc.saldo);
    }

    @Test
    public void saque(){
        cc.sacar(150);
        assertEquals(50, cc.saldo);
    }

    @Test
    public void saqueMaiorSaldo(){
        int valorSacado = cc.sacar(50);
        assertEquals(cc.saldo, 150);
        assertEquals(valorSacado, 50);
    }
}