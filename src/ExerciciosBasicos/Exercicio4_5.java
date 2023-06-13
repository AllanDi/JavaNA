package ExerciciosBasicos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 5");

        System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de " +
                "N = N * (N-1) * (N-2) * (N-3) * ... * 1.\n" +
                "Lembrando que, por definição, fatorial de 0 é 1.");

        double guarda = 0;
        System.out.println("Informe o numero para se calcular o fatorial:  ");
        double numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {

            double fatorial = numero * (numero -1);

            guarda = guarda + fatorial;
        }
        System.out.println(guarda);
    }
}
