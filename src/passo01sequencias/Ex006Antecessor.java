package passo01sequencias;
import java.util.Scanner;
public class Ex006Antecessor {
    public static void main(String[] args) {

        /*  Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
            sucessor.
            Ex:
            Digite um número: 9
            O antecessor de 9 é 8
            O sucessor de 9 é 10

         */


        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.format("O Antecessor de %d é %d\n", num, antecessor);
        System.out.format("Sucessor de %d é %d", num, sucessor);




    }
}
