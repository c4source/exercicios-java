package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex021CondicionalAnoBissexto {
    public static void main(String[] args) {


        /*
            exercicio 021.
            Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
            BISSEXTO.

         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o ano para ver se é bissexto ou não: ");
        int ano = input.nextInt();

        //Se o resto da divisao de ano / 4 for 0
        //E o resto da divisao de ano / 100 for diferente de 00
        //Ou o resto da divisao de ano / 400 for 0
        //entao o ano é bissexto

        if ((ano % 4 == 0 && ano % 100 != 00 ) || (ano % 400 == 0)) {
            System.out.printf("%d é bissexto\n", ano);
        }
        else {
            System.out.printf("%d não é bissexto\n", ano);
        }


    }
}
