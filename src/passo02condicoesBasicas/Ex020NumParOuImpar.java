package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex020NumParOuImpar {
    public static void main(String[] args) {
        /*
            exercicio 020
            Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
            ÍMPAR.

         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.format("%d é par", numero);
        }
        else {
            System.out.format("%d é impar ", numero);
        }

    }
}
