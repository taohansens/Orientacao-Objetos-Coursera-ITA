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
}
