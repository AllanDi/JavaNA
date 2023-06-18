package ExerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 7");

        System.out.println("Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar " +
                "na tela N linhas,\n" +
                "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o " +
                "cubo do valor, conforme\n" +
                "exemplo.\n");

        System.out.println("Digite o numero para ser calculado: ");
        int numero = sc.nextInt();;

        for(int i = 1; i <= numero; i++ ){
            int quadrado = i * i;
            int cubo = quadrado * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

    }
}

