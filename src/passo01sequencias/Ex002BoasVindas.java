package passo01sequencias;
import java.util.Scanner;

public class Ex002BoasVindas {
    public static void main(String[] args) {


        /*
            exercicio 002
           Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
           vindas para ela:
           Ex:
           Qual é o seu nome? João da Silva
           Olá João da Silva, é um prazer te conhecer!

         */

        Scanner input = new Scanner(System.in) ;

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();


        System.out.println("Olá " + nome + " é um prazer te conhecer");



    }
}
