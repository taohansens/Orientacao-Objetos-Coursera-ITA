package semana6.TrabalhoFinal;

public interface MecanicaDoJogo {

    abstract boolean verificaPalavra(String palavra);

    abstract int getSaude();

    abstract int getPontos();

    abstract void morreu();

    abstract void acerta(int n);

    abstract void setPalavraDepois();

    abstract String getPalavra();

    abstract void novaPalavra();

    abstract String getPalavraDepois();
}
