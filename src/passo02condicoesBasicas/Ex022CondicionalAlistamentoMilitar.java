package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex022CondicionalAlistamentoMilitar {
    public static void main(String[] args) {

        /*
          exercicio 022
          Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
          situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
          alistamento. - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
          alistamento.

         */

        Scanner input = new Scanner(System.in);

         final int ANO_ATUAL = 2026;

        System.out.printf("Ano de nascimento: ");
        int anoNascimento = input.nextInt();
        int idade = ANO_ATUAL - anoNascimento;
        if (idade >= 18) {
            int anosPassados = idade - 18;
            System.out.printf("Maior de idade. Idade %d. Serviu há %d anos", idade, anosPassados );
        }
        else {
            int anosQueFaltam = 18 - idade;
            System.out.printf("Menor de idade. Idade %d. Faltam %d anos para realizar o alistamento militar.", idade, anosQueFaltam);
        }


    }
}
