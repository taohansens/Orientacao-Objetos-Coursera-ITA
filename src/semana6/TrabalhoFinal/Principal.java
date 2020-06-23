package semana6.TrabalhoFinal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String palavra, nivel, n;
        FabricaMecanicaDoJogo m = new FabricaMecanicaDoJogo();
        MecanicaDoJogo mj;

        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("Seja bem vindo ao jogo");
            System.out.println("RandomWords!");
            System.out.println("");
            System.out.println("Voce deve apenas descobrir quais sao as palavaras embaralhadas");
            System.out.println("Qual nivel voce quer jogar:");
            System.out.println("1 - Fácil (3 chances)");
            System.out.println("2 - Hardcore (Morte subita)");
            System.out.println("A pontuação vai depender do tamanho da palavra e do nivel escolhido:");
            System.out.println("Facil: cada letra vale 2 ponto. Dificil: cada letra vale 4 pontos");

            do{
                nivel = sc.nextLine();
                if(!nivel.equals("1") && !nivel.equals("2"))
                    System.out.println("Opcao invalida. Digite novamente");
            }while(!nivel.equals("1") && !nivel.equals("2"));

            if(nivel.equals("2")){
                mj = m.retornoMecanica(2);
                System.out.println("Voce escolheu o nivel dificil. Boa sorte! ");
            }else{
                mj = m.retornoMecanica(1);
                System.out.println("Voce escolheu o nivel facil... Lets Go!");
            }

            do{
                System.out.println("Adivinhe a palavra:");
                System.out.println(mj.getPalavraDepois());
                System.out.println("Digite sua resposta:");
                palavra = sc.nextLine();
                if(mj.verificaPalavra(palavra)){
                    System.out.println("Você acertou!! :)");
                    mj.acerta(mj.getPalavra().length());
                }
                else{
                    System.out.println("Você errou!! :(");
                    System.out.println("A palavra correta era " + mj.getPalavra());
                    mj.morreu();
                    if(mj.getSaude() != 0)
                        System.out.println("Ainda restam: " + mj.getSaude() + " vida(s).");
                }
                mj.novaPalavra();

            }while(mj.getSaude() > 0);

            System.out.println("O jogo acabou!");
            System.out.println("Sua pontuação foi: " + mj.getPontos() + " pontos.");
            System.out.println("");
            System.out.println("Gostaria de jogar novamente:");
            System.out.println("1 - Sim; 2 - Nao");
            do{
                n = sc.nextLine();
                if(!n.equals("1") && !n.equals("2"))
                    System.out.println("Opção invalida, tente novamente.");
            }while(!n.equals("1") && !n.equals("2"));
        }while(n.equals("1"));
        System.out.println("Jogo finalizado!");
        sc.close();
    }

}
