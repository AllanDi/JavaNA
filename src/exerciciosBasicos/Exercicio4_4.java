package exerciciosBasicos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 4");

        System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão " +
                "do primeiro pelo segundo. Se o denominador for " +
                "igual a zero, mostrar a mensagem \"divisao impossivel\".");


        System.out.println("Informe a quantidade de testes que deseja realizar: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {

            System.out.println("Informe os numeros que serao calculados: ");
            double primeiroNUmero = sc.nextDouble();
            double segundoNUmero = sc.nextDouble();

            if (segundoNUmero != 0) {
                double resultadoDivisao = primeiroNUmero / segundoNUmero;
                System.out.printf("%.1f%n", resultadoDivisao);
            } else {
                System.out.println("divisao impossivel");
            }

        }
    }
}
