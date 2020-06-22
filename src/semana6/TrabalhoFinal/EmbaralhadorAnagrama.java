package semana6.TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class EmbaralhadorAnagrama implements Embaralhador {

    private List<char[]> anagramas = new ArrayList();

    @Override
    public String embaralhar(String palavra) {

        char[] palavraVetor = transformaEmVetor(palavra);
        geraAnagramas(palavraVetor, 0);
        converteVetorEmString();
        return "";
    }

    protected char[] transformaEmVetor(String palavra){
        char vetor[];
        vetor = new char[palavra.length()];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = palavra.charAt(i);
        }
        return vetor;
    }

    protected void geraAnagramas(char vetor[], int num){
        int i;
        if (num == vetor.length-1)
            anagramas.add(vetor);
        else {
            geraAnagramas(vetor, num + 1);
            i = num + 1;
            while (i < vetor.length) {
                trocaDasPosicoes(vetor, num, i);
                geraAnagramas(vetor, num + 1);
                trocaDasPosicoes(vetor, num, i);
                i = i + 1;
            }
        }
    }

    protected void trocaDasPosicoes(char[] vetor, int num, int i) {
        char aux;
        aux = vetor[i];
        vetor[i] = vetor[num];
        vetor[num] = aux;
    }

    protected void converteVetorEmString(){
        for (int i = 0; i < anagramas.get(i).length; i++) {
            for (int k=0; k <anagramas.get(i).length; i++){
                System.out.print(anagramas.get(i)[k] + " ");
            }
        }

    }
}
