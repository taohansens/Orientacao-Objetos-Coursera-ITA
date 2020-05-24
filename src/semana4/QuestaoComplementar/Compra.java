package semana4.QuestaoComplementar;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Compra {
    double valor;

    protected Compra(double valor) {
        this.valor = valor;
    }

    protected BigDecimal total() {
        double valorDaCompra = this.valor;
        BigDecimal valorFormat = new BigDecimal(valorDaCompra);
        return valorFormat;
    }
}

class CompraParcelada extends Compra {
    private int qtdParcelas;
    private double juros;

    protected CompraParcelada(double valor, int qtdParcelas, double juros) {
        super(valor);
        this.qtdParcelas = qtdParcelas;
        this.juros = juros;
    }

    @Override
    protected BigDecimal total(){
        double valorTotal = this.valor *(Math.pow((1+this.juros),this.qtdParcelas));
        BigDecimal valorFormat = new BigDecimal(valorTotal).setScale(2, RoundingMode.HALF_EVEN);
        return valorFormat;
    }
}

