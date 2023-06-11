package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 3");

        System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. " +
                "Cada caso de teste consiste\n" +
                "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um " +
                "destes\n" +
                "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o " +
                "terceiro valor tem peso 5.");

        int casosTeste = 0;
        System.out.println("Digite a quantidade de testes desejados: ");
        casosTeste = sc.nextInt();

        for (int i = 1; i <= casosTeste; i++) {

            double primeiroNumero = 0;
            double segundoNumero = 0;
            double terceiroNumero = 0;
            System.out.println("Informe os numeros: ");
            primeiroNumero = sc.nextDouble();
            segundoNumero = sc.nextDouble();
            terceiroNumero = sc.nextDouble();

            double calculoMediaPonderada = ((primeiroNumero * 2) + (segundoNumero * 3) + (terceiroNumero * 5)) / (2+3+5);
            System.out.println(calculoMediaPonderada);
        }
    }
}
