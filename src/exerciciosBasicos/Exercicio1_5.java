package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1;
        int totalPecas1;
        double valorUitario1;

        int codigo2;
        int totalPecas2;
        double valorUitario2;

        double valorTotal;

        System.out.println("Exercicio 5");
        System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, " +
                "o valor unitário de cada peça 1, o\n" +
                "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. " +
                "Calcule e mostre o valor a ser pago.");

        System.out.print("Digite o codigo da peça 1: ");
        codigo1 = sc.nextInt();

        System.out.print("Digite o numero total de peças 1: ");
        totalPecas1 = sc.nextInt();

        System.out.print("Digite o valor unitario da peça 1: ");
        valorUitario1 = sc.nextDouble();

        System.out.print("Digite o codigo da peça 2: ");
        codigo2 = sc.nextInt();

        System.out.print("Digite o numero total de peças 2: ");
        totalPecas2 = sc.nextInt();

        System.out.print("Digite o valor unitario da peça 2: ");
        valorUitario2 = sc.nextDouble();

        valorTotal = ((totalPecas1 * valorUitario1) +( totalPecas2 * valorUitario2));

        System.out.println("O valot total a pagar dos itens "+codigo1+", "+codigo2+" é de:"+valorTotal);
    }
}
