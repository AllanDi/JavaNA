package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 2");
        System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de " +
                "pontos no sistema\n" +
                "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado " +
                "quando pelo\n" +
                "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");

        int cordenadaX = 0;
        int cordenadaY = 0;

        System.out.print("digite as cordenadas X e Y para verificação: ");
        cordenadaX = sc.nextInt();
        cordenadaY = sc.nextInt();

        while (cordenadaX != 0 || cordenadaY != 0){
            if (cordenadaX > 0 && cordenadaY > 0) {
                System.out.println("Primeiro");
            } else if (cordenadaX > 0 && cordenadaY < 0) {
                System.out.println("Segundo");
            } else if (cordenadaX < 0 && cordenadaY > 0) {
                System.out.println("Quarto");
            } else if (cordenadaX < 0 && cordenadaY < 0) {
                System.out.println("Terceiro");
            }
            System.out.print("digite as cordenadas X e Y para verificação: ");
            cordenadaX = sc.nextInt();
            cordenadaY = sc.nextInt();
        }
        System.out.println("Valores inválidos = teste");
    }
}
