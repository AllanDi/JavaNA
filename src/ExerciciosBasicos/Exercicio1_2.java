package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 2");
        System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da " +
                "área deste círculo com quatro casas decimais.\n" +
                "Fórmula da área: area = π . raio2\n" +
                "Considere o valor de π = 3.14159\n");

        double pi = Math.PI;
        double raio;

        System.out.print("Digite o valor do raio do circulo para se calcular a area: ");
        raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("A soma dos valores é: %.4f", area);
    }
}
