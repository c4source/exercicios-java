package passo01sequencias;

import java.util.Scanner;

public class Ex010AreaDaParedePintada {
    public static void main(String[] args) {

        /*
          exercicio 010
          Faça um algoritmo que leia a largura e altura de uma parede, calcule e
          mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
          sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

         */

        // Área = 2,5 × 4
        //A fórmula básica é: Área = Altura × Comprimento

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura da parede: ");
        float largura = input.nextFloat();

        System.out.format("Digite a altura da parede: ");
        float altura = input.nextFloat();

        float area = altura * largura;

        double metrosPorTinta = 2.00;
        double QuantidadeTinta  = area / metrosPorTinta;

        System.out.format("A area da parede a ser pintada é: %.2f\n", area);
        System.out.format("A quantidade de tinta necessária é: %.2fL", QuantidadeTinta);


    }
}
