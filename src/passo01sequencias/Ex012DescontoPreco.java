package passo01sequencias;
import java.util.Scanner;


public class Ex012DescontoPreco {
    public static void main(String[] args) {


        /*  exercicio 012
            Crie um programa que leia o preço de um produto, calcule e mostre o seu
            PREÇO PROMOCIONAL, com 5% de desconto.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoNormalProduto = input.nextDouble();

        double prePromocional = precoNormalProduto - (precoNormalProduto * 0.05);

        //USE PRINTF dois %% no texto
        System.out.printf("Produto de R$ %.2f com 5%% de desconto: %.2f",precoNormalProduto, prePromocional);




    }
}
