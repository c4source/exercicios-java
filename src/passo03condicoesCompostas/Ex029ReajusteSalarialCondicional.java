package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex029ReajusteSalarialCondicional {
    public static void main(String[] args) {

        /*
            exercicio 029
            Desenvolva um programa que leia o nome de um funcionário, seu salário,
            quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
            acordo com a tabela a seguir:
            - Até 3 anos de empresa: aumento de 3%
            - entre 3 e 10 anos: aumento de 12.5%
            - 10 anos ou mais: aumento de 20%


         */
        final double TRES_PORCENTO = 0.03;
        final double DOZE_MEIO_PORCENTO = 0.125;
        final double VINTE_PORCENTO = 0.20;


        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Digite seu sálario: ");
        double salario = input.nextDouble();

        System.out.printf("Anos trabalhados: ");
        int anosTrabalhados = input.nextInt();

        if ( anosTrabalhados <= 0) {
            System.out.println("Tempo de empresa inválido");
        }
        else if (anosTrabalhados <= 3) {
            double reajuste = salario + (salario * TRES_PORCENTO);
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salario original R$ %.2f%n", salario);
            System.out.printf("Salario reajustado a 3%% R$ %.2f%n \n", reajuste);
        } else if (anosTrabalhados < 10) {
            double reajuste =  salario + (salario * DOZE_MEIO_PORCENTO);
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salario original R$ %.2f%n", salario);
            System.out.printf("Salario reajustado a 12,%% R$ %.2f%n", reajuste );
        }
        else  {
            double reajuste = salario + (salario * VINTE_PORCENTO) ;
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salario original R$ %.2f%n", salario);
            System.out.printf("Salario reajustado a 20%% R$ %.2f%n", reajuste);
        }
    }
}
