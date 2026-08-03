package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex030TipoDeTriangulo {
    public static void main(String[] args) {
        /*
        exercicio 030
        [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
        de triângulo será formado:
        - EQUILÁTERO: todos os lados iguais
        - ISÓSCELES: dois lados iguais
        - ESCALENO: todos os lados diferentes

         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite lado 1: ");
        double l1 = input.nextDouble();

        System.out.printf("Digite o lado 2: ");
        double l2 = input.nextDouble();

        System.out.printf("Digite o lado 3: ");
        double l3 = input.nextDouble();

        // Boolean nomeVariavel = condicao;
        // Guardando o resultado de varias comparacoes  em um boolean

        boolean formaTriangulo = l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2;

        if (formaTriangulo) {

            System.out.println("Os 3 segmentos formam um TRIANGULO");

            //Boleanos recebendo true ou false para comparacoes com operadores
            boolean equilatero = l1 == l2 && l2 == l3;
            boolean escaleno = l1 != l2 && l2 != l3 && l1 != l3;

            if (equilatero) {
                System.out.println("Triangulo EQUILATERO");

            }
            else if (escaleno) {
                System.out.println("Triangulo ESCALENO");
            }
            else {
                System.out.println("Triangulo ISÓSCELES");
            }

        }
        else {
            System.out.println("Não é possível formar um TRIANGULO");
        }

    }
}
