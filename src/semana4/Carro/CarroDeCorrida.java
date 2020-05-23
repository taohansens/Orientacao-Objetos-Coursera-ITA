package semana4.Carro;

public abstract class CarroDeCorrida {
    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarroDeCorrida(String nome, int velocidadeMaxima) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    protected abstract void acelerar();

    protected void frear(){
        velocidade = velocidade/2;
    }

    protected int getVelocidade() {
        return velocidade;
    }

    protected String getNome() {
        return nome;
    }
}
