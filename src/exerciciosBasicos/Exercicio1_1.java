package exerciciosBasicos;

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

        System.out.print("Digite valores para serem calculados: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        int somaValores = valor1 + valor2;

        System.out.println("A soma dos valores sem utilizar função é: " + somaValores);

        mostraFuncao(funcaoSomaValores(valor1, valor2));

    }
    public static int funcaoSomaValores(int x, int y) {

        int numero1 = x;
        int numero2 = y;
        int soma;

        soma = numero1 + numero2;

        return soma;

    }

    public static void mostraFuncao(int valor){
        System.out.println("A soma dos valores calculados usando função é: " + valor);
    }
}
