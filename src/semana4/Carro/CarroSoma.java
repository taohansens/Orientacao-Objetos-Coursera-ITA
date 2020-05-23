package semana4.Carro;

public class CarroSoma extends CarroDeCorrida {
    private int potencia;

    protected CarroSoma(String nome, int potencia, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        this.potencia = potencia;
    }

    protected void acelerar(){
        velocidade += potencia;
        if (velocidade > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }
    }
}
