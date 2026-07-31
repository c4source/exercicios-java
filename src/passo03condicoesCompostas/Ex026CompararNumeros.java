package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex026CompararNumeros {
    public static void main(String[] args) {

        /*
            exercicio 027
            Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
            na tela uma das mensagens abaixo:
            - O primeiro valor é o maior
            - O segundo valor é o maior
            - Não existe valor maior, os dois são iguais


        */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite primeiro numero: ");
        int primeiroValor = input.nextInt();

        System.out.printf("Digite o segundo numero: ");
        int segundoValor = input.nextInt();

        if ( primeiroValor > segundoValor) {
            System.out.printf("O primeiro valor %d é o maior \n", primeiroValor);

        }
        else if (segundoValor > primeiroValor) {
            System.out.printf("O segundo valor %d é o maior ", segundoValor);
        }
        else {
            System.out.println("Nao existe valor maior os dois são iguais");
        }

    }

}
