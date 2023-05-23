package ExerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 1");
        System.out.println("Fazer um programa para ler um número inteiro, e " +
                "depois dizer se este número é negativo ou não");

        int numero;

        System.out.print("Digite um numero para verificar se é negativo ou positivo: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");
        }
    }
}
