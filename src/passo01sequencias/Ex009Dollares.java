package passo01sequencias;

import java.util.Scanner;

public class Ex009Dollares {
    public static void main(String[] args) {

        /*  exercicio 009
            Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
           e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

         */

        Scanner input = new Scanner(System.in);

        System.out.println("=== Compra de Dollares ===");

        System.out.print("Valor em Reais: ");
        float dinheiroReal = input.nextFloat();

        double Dollar = 3.45;

        double Conversao = dinheiroReal / Dollar;

        System.out.format("Com R$ %.2f você pode comprar US$ %.2f ", dinheiroReal, Conversao);




    }
}
