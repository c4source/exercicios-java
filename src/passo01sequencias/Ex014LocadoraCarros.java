package passo01sequencias;

import java.util.Scanner;

public class Ex014LocadoraCarros {
    public static void main(String[] args) {


        /*  exercicio 014
            A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
            um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
            quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
            sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de KM percorridos pelo carro alugado: ");
        int kmCarroAlugado = input.nextInt();

        System.out.print("Quantidade de dias alugado: ");
        float diasCarroAlugado = input.nextFloat();

        double precoTotalPagar = (diasCarroAlugado * 90) + (kmCarroAlugado * 0.20);

        System.out.printf("Total a pagar: R$%.2f", precoTotalPagar);


    }
}
