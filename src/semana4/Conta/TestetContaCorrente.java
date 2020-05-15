package semana4.Conta;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestetContaCorrente {

    @Test
    public void deposito(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(600);
        assertEquals(600, cc.saldo);
    }

    @Test
    public void saque(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(900);
        cc.sacar(400);
        assertEquals(500, cc.saldo);
    }

    @Test
    public void saqueMaiorSaldo(){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }
}