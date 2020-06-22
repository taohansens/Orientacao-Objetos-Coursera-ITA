package semana6.TrabalhoFinal;
import java.util.Random;

public class EmbaralhadorAnagrama implements Embaralhador {


    @Override
    public String embaralhar(String palavra) {
        Random aleatorio = new Random();
        char palavraVetor[] = palavra.toCharArray();
        int tamanhoDaPalavra = palavraVetor.length;
        for (int i = 0; i < tamanhoDaPalavra; i++) {
            int num = aleatorio.nextInt(tamanhoDaPalavra);
            if (num == i) {
                if (i > 0) {
                    num = aleatorio.nextInt(i);
                } else {
                    num = palavraVetor.length - 1;
                }
            }

            palavraVetor[i] ^= palavraVetor[num];
            palavraVetor[num] ^= palavraVetor[i];
            palavraVetor[i] ^= palavraVetor[num];
        }
        palavra = String.copyValueOf(palavraVetor);
        return palavra;
    }
}
