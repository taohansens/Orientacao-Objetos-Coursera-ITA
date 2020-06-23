package semana6.TrabalhoFinal;

public class MecanicaVidas implements MecanicaDoJogo {

    private int vida, pontos;
    private String palavra;
    private String palavraDepois;

    BancoDePalavras bp = new BancoDePalavras();
    FabricaEmbaralhadores fe = new FabricaEmbaralhadores();

    public MecanicaVidas(){
        this.vida = 3;
        this.pontos = 0;
        novaPalavra();
        setPalavraDepois();
    }

    public boolean verificaPalavra(String palavra){
        if(palavra.equals(getPalavra()))
            return true;
        return false;
    }

    public int getSaude(){
        return this.vida;
    }

    public int getPontos(){
        return this.pontos;
    }

    public void morreu(){
        this.vida--;
    }

    public void acerta(int n){
        this.pontos += n*2;
    }

    public void setPalavraDepois(){
        Embaralhador e = fe.retornaEmbaralhador();
        this.palavraDepois = e.embaralhar(getPalavra());
    }

    public String getPalavra(){
        return this.palavra;
    }

    public void novaPalavra(){
        this.palavra = bp.palavraAleatoria();
        setPalavraDepois();
    }

    public String getPalavraDepois(){
        return this.palavraDepois;
    }
}