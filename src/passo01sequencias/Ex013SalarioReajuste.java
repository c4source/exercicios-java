package passo01sequencias;

import java.util.Scanner;

public class Ex013SalarioReajuste {
    public static void main(String[] args) {

        /*
            exercicio 013
            Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
            seu novo salário, com 15% de aumento.

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu sálario para reajuste de 15%: " );
        float salarioBase = input.nextFloat();

        double salarioReajustado = salarioBase + (salarioBase * 0.015);

        System.out.printf("Sálario de R$ %.2f com reajuste de 15%% R$ %.2f",salarioBase, salarioReajustado);


    }
}
