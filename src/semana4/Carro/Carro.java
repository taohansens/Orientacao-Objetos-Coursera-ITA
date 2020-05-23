package semana4.Carro;

public class Carro {
    private int potencia;
    private int velocidade;
    private int velocidadeMaxima;
    private String nome;

    protected Carro(String nome, int potencia, int velocidadeMaxima) {
        this.potencia = potencia;
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    protected void acelerar(){
        velocidade += potencia;
        if (velocidade > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }
    }

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
