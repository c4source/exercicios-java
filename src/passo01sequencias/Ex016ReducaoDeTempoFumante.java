package passo01sequencias;

import java.util.Scanner;

public class Ex016ReducaoDeTempoFumante {
    public static void main(String[] args) {

        /*  exercicio 016
            Escreva um programa para calcular a redução do tempo de vida de um
            fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
            já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
            quantos dias de vida um fumante perderá e exiba o total em dias.
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarro fumados por dia: ");
        int diasFumados = input.nextInt();

        System.out.print("Digite quantos anos você já fumou: ");
        int anosFumados = input.nextInt();

        final int MINUTOS_POR_CIGARRO = 10;



    }
}
