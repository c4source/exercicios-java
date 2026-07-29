package passo02condicoesBasicas;


import java.util.Scanner;

public class Ex023DescontoPromocao {
    public static void main(String[] args) {


        /*
            exercicio 023
            Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
            para todos, mas especialmente para mulheres. Faça um programa que leia nome,
            sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
            que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto
         */
        final double CINCO_PORCENTO = 0.05;
        final double TREZE_PORCENTO = 0.13;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Digite seu sexo: ");
        String sexo = input.nextLine();

        System.out.printf("Digite o valor da sua compra: ");
        double valorCompra = input.nextDouble();

        //sexo.equalsIgnoreCase compara o texto ignorando se letras maiuculas e minusculas.
        //Use .equals quando precisar verificar o que foi escrito pelo usuario.
        if (sexo.equalsIgnoreCase("Feminino")){
            double porcentagemTrezePorcento = valorCompra * TREZE_PORCENTO;
            double desconto13Porcento = valorCompra -  porcentagemTrezePorcento;
            System.out.printf("Parabéns, %s você acaba de ganhar um DESCONTO!!!\n", nome);
            System.out.printf("Valor sem desconto: R$ %.2f\n", valorCompra);
            System.out.printf("Valor com desconto de 13%%: R$ %.2f", desconto13Porcento);
        }
        else if (sexo.equalsIgnoreCase("Masculino")){
            double porcentagemCincoPorcento = valorCompra * CINCO_PORCENTO;
            double descontoCincoPorcento = valorCompra - porcentagemCincoPorcento;
            System.out.printf("Parabéns, %s você acaba de ganhar um DESCONTO!!\n", nome);
            System.out.printf("Valor sem desconto: R$ %.2f\n", valorCompra);
            System.out.printf("Valor com desconto de 5%%: R$ %.2f", descontoCincoPorcento);
        }
        else{
            System.out.printf("Sexo inválido");
        }


    }
}
