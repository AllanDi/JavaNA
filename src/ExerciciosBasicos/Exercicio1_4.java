package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 3");
        System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, " +
                "o valor que recebe por hora e calcula o salário desse funcionário. A seguir, " +
                "mostre o número e o salário do funcionário, com duas casas\n" +
                "decimais.");

        int numeroFuncionario;
        double totalHorasTrabalhadas;
        double valorHoraTrabalhada;

        System.out.print("Digite o numero do funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.print("Digite o total de horas trabalhadas: ");
        totalHorasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor da hora trabalhada: ");
        valorHoraTrabalhada = sc.nextDouble();

        double salarioTotal = totalHorasTrabalhadas * valorHoraTrabalhada;

        System.out.printf("O total salarial do funcionario %d é de %.2f.", numeroFuncionario, salarioTotal);
    }
}