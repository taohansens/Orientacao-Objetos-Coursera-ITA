package semana6.Excecoes;

public class Principal {
    public static void main(String[] args){
        a(100);
    }

    public static void a(int i){
        System.out.println("executando a() com "+i);
        try {
            b(i);}
        catch (Exception e){
            System.out.println("tratado a excecao: "+e.getMessage());
        }

    }

    public static void b(int i) throws Exception{
        System.out.println("executando b() com "+i);
        throw new Exception("mensagem");
    }
}
