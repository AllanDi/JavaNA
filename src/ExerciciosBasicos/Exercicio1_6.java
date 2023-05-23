package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = Math.PI;
        double valorA;
        double valorB;
        double valorC;

        System.out.println("Exercicio 6");
        System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. " +
                "Em seguida, calcule e mostre:\n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                "d) a área do quadrado que tem lado B.\n" +
                "e) a área do retângulo que tem lados A e B.");

        System.out.println("Informe valores A: ");
        valorA = sc.nextDouble();

        System.out.println("Informe valores B: ");
        valorB = sc.nextDouble();

        System.out.println("Informe valores C: ");
        valorC = sc.nextDouble();

        double triangulo = (valorA * valorC) / 2;
        double circulo = pi * valorC * valorC;
        double trapezio = ((valorA + valorB) * valorC) / 2;
        double quadrado = valorB * valorB;
        double retangulo = valorA * valorB;

        System.out.printf(" triangulo = %.2f%n", triangulo);
        System.out.printf(" circulo = %.2f%n", circulo);
        System.out.printf(" trapezio = %.2f%n", trapezio);
        System.out.printf(" quadrado = %.2f%n", quadrado);
        System.out.printf(" retangulo = %.2f%n", retangulo);
    }
}

