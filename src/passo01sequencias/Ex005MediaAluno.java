package passo01sequencias;
import java.util.Scanner;

public class Ex005MediaAluno {
    public static void main(String[] args) {

        /*
            exercicio 005
            Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
            na tela a sua média na disciplina.
            Ex:
            Nota 1: 4.5
            Nota 2: 8.5
            A média entre 4.5 e 8.5 é igual a 6.5

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.format("A média entre %.1f e %.1f é igual a: %.1f", n1, n2, media);






    }
}
