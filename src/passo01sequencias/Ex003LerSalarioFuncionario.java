package passo01sequencias;
import java.util.Scanner;

public class Ex003LerSalarioFuncionario {
    public static void main(String[] args) {

        /*
         exercicios 003
        Crie um programa que leia o nome e o salário de um funcionário, mostrando no
        final uma mensagem.
        Ex:
        Nome do Funcionário: Maria do Carmo
        Salário: 1850,45
        O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

         */


        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Informe o salário: ");
        float salario = input.nextFloat();

        System.out.println("Nome do funcionário: " + nome);
        System.out.format("Salário: %.2f \n", salario);

        // System.out.format(%2f, %s, %d) ou printf().
        // FLOAT %2F
        // INT %d
        // STRING %s








    }
}
