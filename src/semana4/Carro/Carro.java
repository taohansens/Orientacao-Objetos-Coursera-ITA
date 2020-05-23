package semana4.Carro;

public class Carro extends CarroDeCorrida {
    private int potencia;

    protected Carro(String nome, int potencia, int velocidadeMaxima) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    protected void acelerar(){
        velocidade += potencia;
        if (velocidade > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }
    }
}
