package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex028CalcTamanhoTerreno {
    public static void main(String[] args) {

        /*

            exercicio 029
            Faça um programa que leia a largura e o comprimento de um terreno
            retangular, calculando e mostrando a sua área em m². O programa também
            devemostrar a classificação desse terreno, de acordo com a lista abaixo:
            - Abaixo de 100m² = TERRENO POPULAR
            - Entre 100m² e 500m² = TERRENO MASTER
            - Acima de 500m² = TERRENO VIP

        */

        Scanner input = new Scanner(System.in);

        System.out.printf("Largura do terreno retangular: ");
        double largura = input.nextDouble();

        System.out.printf("Comprimento do terreno retangular: ");
        double comprimento = input.nextDouble();

        // a = area  b = base (comprimento) h = altura (largura)
        // a = b x h

        double areaRetangulo = comprimento * largura;

        System.out.printf("Area do terreno: %.2fm²\n", areaRetangulo);

        if (areaRetangulo < 100){
            System.out.printf("Terreno de %.2fm² é POPULAR", areaRetangulo);
        }
        else if (areaRetangulo <= 500 ) {
            System.out.printf("Terreno de %.2fm² é MASTER", areaRetangulo);
        }
        else {
            System.out.printf("Terreno de %.2fm² é VIP", areaRetangulo);

        }
    }
}
