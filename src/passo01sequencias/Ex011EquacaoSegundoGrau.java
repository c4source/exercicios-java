package passo01sequencias;

import java.util.Scanner;
;
public class Ex011EquacaoSegundoGrau {
    public static void main(String[] args) {
        /*
          exercicio 011
          Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
          segundo grau e mostre o valor de Delta.

         */

        // equacao de segundo grau: ax² + bx + c = 0
        //  A = Ax² Coefienciente de a
        //  B = Bx Coeficiente de b
        //  C = C -> Termo indepedente (Constante) valor fixo ex; 2x² + 5x - 3 = 0

        // Antes de resolver uma equacao do segundo grau resolvemos o ( Delta Δ )
        // Formula para achar o Delta; Δ = b² - 4ac

        // Com o delta podemos saber quantas soluções a equação possui.

        // Δ > 0 a equacao possui duas raízes reais diferentes
        // Δ = 0 raíz real ( repetida )
        // Δ < 0 Não possui raízes.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o coefieciente de A: ");
        double a = input.nextDouble();

        System.out.print("Digite o coefienciete de B: " );
        double b = input.nextDouble();

        System.out.print("Digite o coefienciete de C: " );
        double c = input.nextDouble();


        double delta = Math.pow(b, 2) - 4 * (a) * (c);

        System.out.printf("Equação: %.1f x² %.1f x  %.1f = 0  \n", a, b, c);
        System.out.format("Delta Δ = %.2f", delta);


    }
}
