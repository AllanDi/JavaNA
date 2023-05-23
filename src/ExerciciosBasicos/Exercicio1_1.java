package ExerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 1");
        System.out.println("Faça um programa para ler dois valores inteiros, e depois mostrar na tela " +
                "a soma desses números com uma mensagem explicativa:\n");

        int valor1;
        int valor2;

        System.out.print("Digite o primeiro valor para ser calculado: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor para ser calculado: ");
        valor2 = sc.nextInt();

        int somaValores = valor1 + valor2;

        System.out.println("A soma dos valores é:" + somaValores);
    }
}
