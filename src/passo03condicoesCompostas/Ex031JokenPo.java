package passo03condicoesCompostas;
import java.util.Scanner;

public class Ex031JokenPo {
    public static void main(String[] args) {

        /*
            exercicio 031
            [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

            - regras do jokenPo -

            .pedra ganha de tesoura (quebra)
             tesoro ganha de papel (corta)
             papel ganha de pedra (cobre)
            .Jogadas iguais resultam em empate.

            - 2 jogadores


         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Jogada do jogador 1: ");
        String primeiroJogada = input.nextLine();

        System.out.printf("Jogada do jogador 2: ");
        String segundaJogada = input.nextLine();

        //caso primeira jogada for pedra e segunda tesoura
        //PedraGanhaTesoura = true;
        boolean pedraGanhaTesoura = primeiroJogada.equalsIgnoreCase("Pedra") && segundaJogada.equalsIgnoreCase("Tesoura");
        boolean tesouraGanhaPapel = primeiroJogada.equalsIgnoreCase("Tesoura") && segundaJogada.equalsIgnoreCase("Papel");
        boolean papelGanhaPedra = primeiroJogada.equalsIgnoreCase("Papel") && segundaJogada.equalsIgnoreCase("Pedra");

        //Jogador 1 vence caso pedraGanhaDeTesoura ou TesouraGanhaPapel ou PapelGanhaPedra seja true
        boolean jogador1Vence = pedraGanhaTesoura || tesouraGanhaPapel || papelGanhaPedra;
        //Se a jogada 1 for igual a jogada 2 empatamos.
        boolean empata = primeiroJogada.equalsIgnoreCase(segundaJogada);



       if (empata) {
           System.out.println("Empate");
       }
        else if (jogador1Vence) {
           System.out.println("Jogador 1 venceu");

       }
       else {
           System.out.println("Jogador 2 venceu");
       }

    }
}
