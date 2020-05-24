package semana4.Questao;

import semana4.Carro.CarroDeCorrida;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    private Map<Produto, Integer> carrinho = new HashMap<>();

    public void adicionaProduto(Produto o, int qtd ) {
        carrinho.put(o,qtd);
    }

    public void removeProduto(Produto o, int qtd){
        carrinho.remove(o,qtd);
    }

    public void calculaCarrinho(){

    }
}
