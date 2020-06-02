package semana4.Questao;

import java.util.Objects;

public class ProdutoComTamanho extends Produto{
    char tamanho;

    public ProdutoComTamanho(String nome, int codigo, double preco, char tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return this.getCodigo()+this.getTamanho();
    }
}
