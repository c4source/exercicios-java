package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex027MediaSeAprovado {
    public static void main(String[] args) {


        /*
            exercicio 027
            Crie um programa que leia duas notas de um aluno e calcule a sua média,
            mostrando uma mensagem no final, de acordo com a média atingida:
             - Média até 4.9: REPROVADO
             - Média entre 5.0 e 6.9: RECUPERAÇÃO
             - Média 7.0 ou superior: APROVADO

        */


        Scanner input = new Scanner(System.in);


        System.out.printf("Digite uma nota: ");
        double n1 = input.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double n2 = input.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.printf("Media %.1f APROVADO", media);
        }
        else if (media >= 5) {
            System.out.printf("Media %.1f RECUPERACAO", media);
        }
        else {
            System.out.printf("Media %.1f REPROVADO", media);
        }


    }
}
