package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 3");
        System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. " +
                "A seguir, calcule e mostre a diferença do produto\n" +
                "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");

        int valor1;
        int valor2;
        int valor3;
        int valor4;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valor3 = sc.nextInt();

        System.out.print("Digite o quarto valor: ");
        valor4 = sc.nextInt();

        int produto = valor1 * valor2 - valor3 * valor4;

        System.out.print("A produto dos valores é: " + produto);
    }
}
