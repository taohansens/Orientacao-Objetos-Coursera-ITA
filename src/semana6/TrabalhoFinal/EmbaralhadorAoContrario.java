package semana6.TrabalhoFinal;

public class EmbaralhadorAoContrario implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        String arvalap = new StringBuilder(palavra).reverse().toString();
        return arvalap;
    }

    /* Comentario:
     * Optei por utilizar o StringBuilder.
     * Mas poderia tambem iterar sobre a String.
     */

}
