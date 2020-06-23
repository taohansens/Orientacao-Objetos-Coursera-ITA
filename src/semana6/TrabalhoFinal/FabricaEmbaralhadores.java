package semana6.TrabalhoFinal;

import java.util.Random;

public class FabricaEmbaralhadores {

    public Embaralhador retornaEmbaralhador() {
        Random random = new Random();
        int randomNum = random.nextInt(3) + 1;
        if (randomNum == 1) {
            return new EmbaralhadorAnagrama();
        } else if (randomNum == 2) {
            return new EmbaralhadorAoContrario();
        } else {
            return new EmbaralhadorAnagrama();
        }
    }
}
