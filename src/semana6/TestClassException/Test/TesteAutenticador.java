package semana6.TestClassException.Test;

import org.junit.Test;
import org.junit.jupiter.api.*;
import semana6.TestClassException.Autenticador;
import semana6.TestClassException.LoginException;
import semana6.TestClassException.Usuario;

import static org.junit.jupiter.api.Assertions.*;

public class TesteAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("tao","senhadotao");
        assertEquals("tao", u.getLogin());
    }

    @Test(expected = LoginException.class)
    public void loginComFalha() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("tao","1234");
        assertEquals("tao", u.getLogin());
    }

    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("tao", "1234");
            fail();
        }catch (LoginException e) {
            assertEquals("tao",e.getLogin());
        };
    }
}
