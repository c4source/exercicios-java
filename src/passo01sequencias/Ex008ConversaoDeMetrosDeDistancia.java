package passo01sequencias;
import java.util.Scanner;

public class Ex008ConversaoDeMetrosDeDistancia {
    public static void main(String[] args) {

        /*
          exercicio 008
          Desenvolva um programa que leia uma distância em metros e mostre os valores  relativos em outras medidas.
          Ex:
          Digite uma distância em metros: 185.72
          A distância de 85.7m corresponde a:

            0.18572Km                            1857.2dm
            1.8572Hm                             18572.0cm
            18.572Dam                            185720.0mm


     */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double distancia = input.nextDouble();

        double distanciaKm = distancia / 1000;
        double distanciaHm = distancia / 100;
        double distanciaDam = distancia / 10;
        double distanciaDm = distancia * 10;
        double distanciaCm = distancia * 100;
        double distanciaMm = distancia * 1000;

        System.out.format("A distancia de %.2f correponde a: \n", distancia);
        System.out.format("%.5fKm \n", distanciaKm);
        System.out.format("%.4fHm \n", distanciaHm);
        System.out.format("%.3fDam \n", distanciaDam);
        System.out.format("%.3fDm \n",  distanciaDm);
        System.out.format("%.1fCm \n", distanciaCm);
        System.out.format("%.1fMm", distanciaMm);



    }
}
