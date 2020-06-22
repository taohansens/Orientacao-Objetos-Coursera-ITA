package semana6.TrabalhoFinal;

import java.util.Random;

public class FabricaEmbaralhadores {

    public int retornaEmbaralhador(){
        Random random = new Random();
        int randomNum = random.nextInt(3) + 1;
            if (randomNum == 1) {
                return 1;}
            else if (randomNum == 2) {
                    return 2;
            }else{
                return 3;
            }
    }
}
