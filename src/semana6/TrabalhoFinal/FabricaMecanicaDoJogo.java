package semana6.TrabalhoFinal;

public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo retornoMecanica(int nivel) {
        if (nivel == 1) {
            return new MecanicaVidas();
        } else {
            return new MecanicaMorteSubita();
        }
    }

}
