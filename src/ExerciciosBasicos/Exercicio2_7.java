package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 6");
        System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n" +
                "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n" +
                "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\n" +
                "Se o ponto estiver na origem, escreva a mensagem “Origem”.\n" +
                "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\n" +
                "situação.");

        int valorX;
        int valorY;

        System.out.println("Digite o valores para as cordenadas (X, Y): ");
        valorX = sc.nextInt();
        valorY = sc.nextInt();

        if (valorX == 0 && valorY ==0 ){
            System.out.println("Origem.");
        } else if (valorX > 0 && valorY > 0){
            System.out.println("Q1");
        } else if (valorX > 0 && valorY < 0){
            System.out.println("Q4");
        } else if (valorX < 0 && valorY > 0){
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0){
            System.out.println("Q3");
        }
    }
}
