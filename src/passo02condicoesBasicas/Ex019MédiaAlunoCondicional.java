package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex019MédiaAlunoCondicional {
    public static void main(String[] args) {

        /*
            exercicio 019
            Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
            média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
            não um bom aproveitamento (se ficou acima da média 7.0).
         */


            Scanner input = new Scanner(System.in);

            System.out.print("Nome do aluno: ");
            String nome = input.nextLine();

            System.out.print("Digite a nota 1: ");
            double nota1 = input.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = input.nextDouble();

            double mediaAluno = (nota1 + nota2) / 2;

            System.out.format("A média do aluno(a) %s é %.1f \n", nome, mediaAluno);

            if(mediaAluno >= 7.0) {
                System.out.format("Aluno(a) %s é aprovado com %.1f de média. Bom aproveitamento", nome, mediaAluno);
            } else if (mediaAluno >= 5.0) {
                System.out.format("Aluno(a) %s é aprovado com %.1f de média. Médio aproveitamento", nome, mediaAluno);

            }
            else {
                System.out.format("Aluno %s NÃO foi aprovado com %.2f de média. Mal aproveitamento", nome, mediaAluno);
            }

    }


}
