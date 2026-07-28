package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex017VelocidadeCarro {
    public static void main(String[] args) {


        /*  exercicio 017
            Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
            80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
            o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
        */


        Scanner input = new Scanner(System.in);

        final float TAXA_MULTA = 5.00F;
        final float LIMITE_KM = 80.00F;
        
        System.out.print("Velocidade do carro:  ");
        float kmCarro = input.nextFloat();

        if (kmCarro > LIMITE_KM) {

            float velocidadeExcedida = kmCarro - LIMITE_KM;
            float taxaMulta = velocidadeExcedida * TAXA_MULTA;

            System.out.format("Multado em: R$ %.2f", taxaMulta);

        }
        else{
            System.out.println("Velocidade permitida!");
        }




    }
}
