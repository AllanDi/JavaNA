package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 1");
        System.out.println("Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, " +
                "um valor por linha, inclusive o\n" +
                "X, se for o caso.");

        int numero = 0;

        System.out.print("Digite um numero para ser mostrado apenas os impares: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
