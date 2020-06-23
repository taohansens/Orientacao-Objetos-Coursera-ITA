package semana6.TrabalhoFinal;

public class MecanicaMorteSubita implements MecanicaDoJogo {
    private int saude, pontos;
    String palavra;
    String palavraDepois;
    BancoDePalavras bp = new BancoDePalavras();
    FabricaEmbaralhadores fe = new FabricaEmbaralhadores();

    public MecanicaMorteSubita() {
        this.saude = 1;
        this.pontos = 0;
        novaPalavra();
        setPalavraDepois();
    }

    public boolean verificaPalavra(String palavra) {
        if (palavra.equals(getPalavra())) {
            return true;
        } else {
            return false;
        }
    }

    public int getSaude() {
        return this.saude;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void morreu() {
        this.saude--;
    }

    public void acerta(int n) {
        this.pontos += n * 4;
    }

    public void setPalavraDepois() {
        Embaralhador e = fe.retornaEmbaralhador();
        this.palavraDepois = e.embaralhar(getPalavra());
    }

    public String getPalavra() {
        return this.palavra;
    }

    public void novaPalavra() {
        this.palavra = bp.palavraAleatoria();
        setPalavraDepois();
    }

    public String getPalavraDepois() {
        return this.palavraDepois;
    }

}
