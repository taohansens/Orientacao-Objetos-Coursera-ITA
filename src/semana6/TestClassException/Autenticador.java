package semana6.TestClassException;

import sun.rmi.runtime.Log;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException {
        if(login.equals("tao")&&senha.equals("senhadotao")){
            return new Usuario(login);
        }
        throw new LoginException("O usuario e a senha não batem", login);
    }
}
