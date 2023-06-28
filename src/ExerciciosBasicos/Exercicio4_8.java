package ExerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 8");

        System.out.println("Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em\n" +
                "Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite \"s\", repetir o\n" +
                "programa.");

        char resp;

        do {
            System.out.print("Digite a temperatura em Clsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}






