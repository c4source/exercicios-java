package passo02condicoesBasicas;

import java.util.Scanner;

public class Ex024PrecoPassagemPorDistancia {
    public static void main(String[] args) {


    /*
        exercicio 025
        Faça um algoritmo que pergunte a distância que um passageiro deseja
        percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
        viagens até 200Km e R$0.45 para viagens mais longas.

     */
        final double TAXA_ATE_DUZENTOSKM = 0.50;
        final double TAXA_ACIMA_DE_DUZENTOS_KM = 0.45;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a distância que deseja percorrer: "); //100 km
        int kmDesejado = input.nextInt();

        //taxaAteDuzentosKm = km desejado * 0.50 =  50 reais

        if (kmDesejado <= 200) {
            double precoPassagem = kmDesejado * TAXA_ATE_DUZENTOSKM;

            System.out.printf("Valor por km: R$ %.2f até 200 Km \n", TAXA_ATE_DUZENTOSKM);
            System.out.printf("Taxa pelos %d Km's é de R$ %.2f", kmDesejado, precoPassagem);

        } else {
            double precoPassagem = kmDesejado * TAXA_ACIMA_DE_DUZENTOS_KM;

            System.out.printf("Valor por km: R$ %.2f a cima de 200Km de distância \n", TAXA_ACIMA_DE_DUZENTOS_KM);
            System.out.printf("Taxa pelos %d Kms desejados é de R$ %.2f",kmDesejado,precoPassagem);


        }





    }







}
