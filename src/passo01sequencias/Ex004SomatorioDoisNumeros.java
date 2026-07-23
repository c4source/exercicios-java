package passo01sequencias;
import java.util.Scanner;
public class Ex004SomatorioDoisNumeros {
    public static void main(String[] args) {

        /*
            exercicio 004
            Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
            entre eles.
            Ex:
            Digite um valor: 8
            Digite outro valor: 5
            A soma entre 8 e 5 é igual a 13.

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = input.nextInt();

        System.out.print("Digite outro valor: ");
        int n2 = input.nextInt();

        int soma = n1 + n2;

        System.out.format("A soma entre %d e %d é igual a: %d", n1, n2, soma);




    }
}
