package semana5.FormasDeTratamento;

public class Respeitoso implements FormatadorNome {
    private boolean sexo; //True=Mulher e False=Homem;

    public Respeitoso(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if (sexo)
            return "Sra. " + sobrenome;
        else
            return "Sr. " + sobrenome;
    }
}