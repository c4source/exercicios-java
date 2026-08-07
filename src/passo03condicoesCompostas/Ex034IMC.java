package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex034IMC {
    public static void main(String[] args) {

        /*
            exercicio 034
            O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
            peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
            indivíduo dentro de certas faixas.

            - abaixo de 18.5: Abaixo do peso
            - entre 18.5 e 25: Peso ideal
            - entre 25 e 30: Sobrepeso
            - entre 30 e 40: Obesidade
            - acima de 40: Obseidade mórbida

            Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
            da altura)

         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.printf("Digite seu peso: ");
        double peso = input.nextDouble();

        double imc =  peso / (altura * altura);

        System.out.printf("IMC: %.2f \n", imc);

        if (imc < 18.5) {

            System.out.println("A baixo do peso");
        }
        else if (imc <= 25) {

            System.out.println("Peso ideal");

        }
        else if (imc <= 30 ) {

            System.out.println("Sobre peso");

        }
        else if ( imc <= 40) {

            System.out.println("Obesidade");
        }
        else {

            System.out.println("Obesidade mórbida.");
        }


    }
}
