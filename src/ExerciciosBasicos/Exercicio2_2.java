package ExerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 2");
        System.out.println("Fazer um programa para ler um número inteiro e dizer se " +
                "este número é par ou ímpar.\n");

        int numero;

        System.out.print("Digite um numero para verificar se é par ou impar: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
