package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex025SegmentosDeReta {
    public static void main(String[] args) {

        /*
             exercicio 025
             Crie um programa que leia o tamanho de três segmentos de reta.
             Analise seus comprimentos e diga se é possível formar um triângulo com essas
             retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
             de cada lado deve ser menor que a soma dos outros lados.

         */

        //(PQ1) - Segmento 1 = representa um lado do triangulo
        //(PQ2) - Segmento 2 = representa segundo lado do triangulo
        //(PQ3) - Segmento 3 = representa um 3 lado de um trangulo

        //a b c

        Scanner input = new Scanner(System.in);

        //Lado a - segmento 1
        System.out.printf("Digite o tamanho do segmento A: ");
        double a = input.nextDouble();

        //Lado b - segmento 2
        System.out.printf("Digite o tamanho do segmento B: ");
        double b = input.nextDouble();

        //Lado c - segmento 3
        System.out.printf("Digite o tamanho do segmento C: ");
        double c = input.nextDouble();

        if ( a < b + c && b < a + c && c < a + b ) {
            System.out.println("Estes 3 segmentos formam um TRIÂNGULO.");
        }
        else {
            System.out.println("Estes 3 segmentos não formam um TRIÂNGULO.");
        }


    }
}
