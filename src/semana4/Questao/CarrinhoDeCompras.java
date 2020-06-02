package semana4.Questao;

import java.util.HashMap;

public class CarrinhoDeCompras {

    private HashMap<Produto, Integer> carrinho = new HashMap<>();

    public void adicionaProduto(Produto o, int qtd ) {
        if (carrinho.containsKey(o)) {
            int qtdNova = carrinho.get(o)+qtd;
            carrinho.put(o,qtdNova);
        }
        else {
        carrinho.put(o,qtd);
        }
    }

    public boolean removeProduto(Produto produto, int qtdRemover){
        if (carrinho.containsKey(produto)) {
            int qtdAtual = carrinho.get(produto);

            if (qtdRemover < qtdAtual){
                int temp = qtdAtual-qtdRemover;
                carrinho.put(produto,temp);
                return true;
            }
            else if (qtdRemover == qtdAtual) carrinho.remove(produto); return true;
        } else {
            return false;
        }

    }

    public double calculaCarrinho(){
        double valorCarrinho = 0;
        for (Produto p : carrinho.keySet()) {
            valorCarrinho += p.getPreco()*carrinho.get(p);
        }
        return valorCarrinho;
    }

    public double qtdDeProduto(){
        return carrinho.size();
    }

    public double qtdDeItens(){
        int qtdDeItem =0;
        for (Produto p : carrinho.keySet()) {
            qtdDeItem += carrinho.get(p);
        }
        return qtdDeItem;
    }

    }
