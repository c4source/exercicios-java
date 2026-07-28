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
        int cigarrosFumadosPorDia = input.nextInt();

        System.out.print("Digite quantos anos você já fumou: ");
        int anosFumados = input.nextInt();

        final int MINUTOS_DE_VIDA_PERDIDOS_POR_CIGARRO = 10;
        final int UM_ANO = 365;
        final int MINUTOS_POR_DIA = 1440; // UM DIA TEM 1440 MINUTOS

        //Quantos cigarros fuma por dia?

        // 60 segundos tem 1 minuto
        // 60 minutos tem 1 hora
        // 24 horas tem 1440 minutos
        // 60 minutos * 24 horas =  1440 minutos um dia


        // a cada cigarro eu perco 10 minutos

        // EU FUMO 10 CIGARROS POR DIA. 10 CIGARROS VEZES 40 DIAS = 400 CIGARROS FUMADOS EM 40 dias. cigarro fumado por dia * 24 ( EM MINUTOS )
        // 40 dias e quivale à 24horas * 40 = 960 horas, 960 horas * 60 (minutos) = 56700 minutos fumados ao longo de cinco anos
        // QUANTOS ANOS EU FUMO? EU FUMO  HÁ 5 ANOS, 1.825 DIAS FUMANDO.  10 cigarros fumados por dia por 1825 (5 anos)
        // equivale ha quanto cigarros fumados? = 18.250 cigarros fumados em 5 anos
        // CigarrosFumadosPordia * anosfumados/UmAno

        int quantidadeDeCigarrosFumados = (anosFumados * UM_ANO) * cigarrosFumadosPorDia;
        //int TempoDeVidaPerdido = (quantidadeDeCigarrosFumados * MINUTOS_DE_VIDA_PERDIDOS_POR_CIGARRO)

        System.out.format("Cigarros fumados em %d anos: %d cigarros",anosFumados, quantidadeDeCigarrosFumados );
        //System.out.printf("dias perdidos de vida: %d", diasRestantesDevida);



    }
}
