package semana4.Conta;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TestetContaCorrente{
    @Before
    public void inicializaConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void saqueMaiorSaldo(){
        int valorSacado = cc.sacar(350);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }

    @Test
    public void maiorSaldoLimite(){
        int valorSacado = cc.sacar(280);
        assertEquals(cc.saldo, -80);
        assertEquals(valorSacado, 280);
    }
}