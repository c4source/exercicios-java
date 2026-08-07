package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex33AprovarEmprestimo {
    public static void main(String[] args) {

        /*
            exercicio 34
            Escreva um programa para aprovar ou não o empréstimo bancário para a compra
            de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
            em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
            ela não pode exceder 30% do salário ou então o empréstimo será negado.

         */
        final double TRINTA_PORCENTO = 0.30;


        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o valor da casa: ");
        double valorCasa = input.nextDouble();

        System.out.printf("Digite o seu salario: ");
        double salarioComprador = input.nextDouble();

        System.out.printf("Quantos anos deseja pagar: ");
        int anosApagar = input.nextInt();

        // Calcule o valor da prestação mensal
        // não pode exceder 30% do salário

        //Nao pode execender os 30% do salario.
        // aqui vai o valor dos 30% do salario  ex; salario 2500, 30% disso é 750 reias.

        double trintaPorcentoSalario = (salarioComprador * TRINTA_PORCENTO);

        double TotalParcelaMensal = 12 * anosApagar;

        double valorParcelaMensaldaCasa = valorCasa / TotalParcelaMensal;
        if (valorParcelaMensaldaCasa > trintaPorcentoSalario ) {
            System.out.printf("Valor da parcela: R$ %.2f%n", valorParcelaMensaldaCasa);
            System.out.printf("30%% do salário: R$ %.2f%n", trintaPorcentoSalario);
            System.out.println("Emprestimo Negado!");


        }
        else {
            System.out.printf("Valor da parcela: R$ %.2f%n", valorParcelaMensaldaCasa);
            System.out.printf("30%% do salário: R$ %.2f%n", trintaPorcentoSalario);
            System.out.println("Emprestimo aceito!");

        }
    }
}

// emprestimo = banco empresta dinheiro com juros.
// ex; quero comprar uma casa de 100,000
// se eu tiver um salario que por mes o valor da prestacao  passe de 30% o banco n autoriza.

//ex; casa 100,000,00 reais.
// quero pagar em 15 anos;
// 15 anos são quantos meses? 12x15; 180 meses.
// 180 meses dividio por 100,000,00 reais. da R$ 555,00 reais por mes
// 180 parcelas mensais de 555 reais.

// se o o meu salario for de 2500 reais e o valor da parcela nao poder ultrapassar 30% eu n posso pegar o emprestimo
// 30% de R$ 2500 reais é R$ 750.
// 555 reais é menos que 30%, 555 reais < que 750.
// Entao autorizo o emprestimo
