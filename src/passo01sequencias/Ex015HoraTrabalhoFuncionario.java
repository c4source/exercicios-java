package passo01sequencias;

import java.util.Scanner;

public class Ex015HoraTrabalhoFuncionario {
    public static void main(String[] args) {

            /*
                exercicio 015
                Crie um programa que leia o número de dias trabalhados em um mês e mostre o
                salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
                por hora trabalhada.

             */

        Scanner input = new Scanner(System.in);


        System.out.print("Dias trabalhados no mês: ");
        int diasTrabalhados = input.nextInt();

        //CONSTANTES, VALORES FIXOS.
        final int HORA_TRABALHADA_POR_DIA =  8;
        final double VALOR_HORA_POR_DIA = 25.00;

        double salarioTrabalhador = HORA_TRABALHADA_POR_DIA * VALOR_HORA_POR_DIA;

        System.out.printf("Dias trabalhados: %d\n", diasTrabalhados);
        System.out.printf("Sálario: %.2f", salarioTrabalhador);



    }
}
