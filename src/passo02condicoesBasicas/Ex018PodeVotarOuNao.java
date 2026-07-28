package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex018PodeVotarOuNao {
    public static void main(String[] args) {


        /*
            exercicio 018
            Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
            dela e depois mostre se ela pode ou não votar.

         */



        Scanner input = new Scanner(System.in);

        final int ANO_ATUAL = 2026;

        System.out.printf("Digite sua data de nascimento: ");
        int anoNascimento = input.nextInt();

        int idade = ANO_ATUAL - anoNascimento;

        if (idade >= 18) {
            System.out.format("Com %d anos você pode votar!", idade);
        }
        else {
            System.out.format("Com %d anos você NÃO pode votar!", idade);
        }











    }







}
