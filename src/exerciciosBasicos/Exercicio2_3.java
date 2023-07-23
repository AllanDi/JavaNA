package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 3");
        System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma " +
                "mensagem \"Sao Multiplos\" ou \"Nao sao\n" +
                "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: " +
                "os números devem poder ser digitados em\n" +
                "ordem crescente ou decrescente.\n");

        int valorA;
        int valorB;
        int resultado;

        System.out.print("Digite valores A e B para verificar se são multiplos: ");
        valorA = sc.nextInt();
        valorB = sc.nextInt();

        if (valorA > valorB) {
            resultado = valorA % valorB;
        } else {
            resultado = valorB % valorA;
        }
        if (resultado == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
