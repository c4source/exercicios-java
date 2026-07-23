package passo01sequencias;
import java.util.Scanner;
public class Ex007TercaParteDobroNum {
    public static void main(String[] args) {

        /*  exercicio 008
            Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
            sua terça parte.
            Ex:
            Digite um número: 3.5
            O dobro de 3.5 é 7.0
            A terça parte de 3.5 é 1.16666

         */


        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = input.nextDouble();

        double dobro = num * 2;
        double terca = num / 3;

        System.out.format("O dobro de %.1f é %.1f \n", num, dobro);
        System.out.format("A terça parte de %.1f é %.5f", num, terca);



    }
}
