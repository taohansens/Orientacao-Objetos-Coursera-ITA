package semana6.Excecoes;

public class Principal {
    public static void main(String[] args) throws Exception {
        a(100);
        b(200);
    }

    public static void a(int i) throws Exception {
        System.out.println("executando a() com "+i);
        b(200);
    }

    public static void b(int i) throws Exception{
        System.out.println("executando b() com "+i);
        throw new Exception("mensagem");
    }
}
