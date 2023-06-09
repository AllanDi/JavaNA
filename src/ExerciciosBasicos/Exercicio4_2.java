package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 2");

        System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão " +
                "lidos em seguida.\n" +
                "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, " +
                "mostrando\n" +
                "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para " +
                "fora do intervalo).");

        int quantidadeVezes = 0;
        int in = 0;
        int out = 0;

        System.out.println("informe a quatidade de vezes que faremos a verificação dentro do intervalo: ");
        quantidadeVezes = sc.nextInt();

        for (int i = 1; i <= quantidadeVezes; i++){
            System.out.println("Iforme o numero para verificar: ");
            int numero = sc.nextInt();
            if(numero >= 10 && numero <= 20) {
                in ++;
            } else {
                out ++;
            }
        }
        System.out.println(in +" in");
        System.out.println(out +" out");
    }
}
