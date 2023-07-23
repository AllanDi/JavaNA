package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 4");
        System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a " +
                "duração do jogo, sabendo que o mesmo pode\n" +
                "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");

        int horaInicial;
        int horaFinal;
        int resultado;

        System.out.println("Informe a hora inicial e a hora final do jogo: ");

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial > horaFinal) {
            resultado = 24 - horaInicial + horaFinal;
        } else {
            resultado = 24 - horaFinal + horaInicial;
        }
        if (resultado == 24){
            resultado = 0;
        }
        System.out.println("O jogo durou "+resultado+" horas.");
    }
}
