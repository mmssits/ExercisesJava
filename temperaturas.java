/* Proposta: realizar a conversão da temperatura informada em graus Celsius nas seguintes temperaturas: Fahrenheit, Kelvin, Réaumur e Rankine */

import java.util.Scanner;

public class temperaturas {

    public static void main(String[] args) {
        double C, F, K, Re, Ra;

        System.out.println("Informe o valor da temperatura em graus Celsius:");

        // Leitura de Graus Celsius

        Scanner sc = new Scanner(System.in);

        C = sc.nextDouble();

        // Fórmulas de conversão

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        // Impressão das conversões

        System.out.println("A conversão para Fahrenheit é equivalente a:" + F);
        System.out.println("A conversão para Kelvin é equivalente a:" + K);
        System.out.println("A conversão para Réaumur é equivalente a:" + Re);
        System.out.println("A conversão para Rankine é equivalente a:" + Ra);
    }
}

