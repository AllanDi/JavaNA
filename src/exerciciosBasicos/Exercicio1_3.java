package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
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

        System.out.println("A produto dos valores é:" + produto);

        System.out.println(funcaoCalculaProduto(valor1, valor2, valor3, valor4));;
    }
    public static int funcaoCalculaProduto(int a, int b, int c, int d){
        int valor1 = a;
        int valor2 = b;
        int valor3 = c;
        int valor4 = d;

        int produto = a * b - c * d;

        return produto;
    }
    /*public static void mostraFuncao(x){
        System.out.println("o valor ");
    }*/

}
