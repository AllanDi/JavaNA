package ExerciciosBasicos;

import java.util.Scanner;

public class TesteAulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três numeros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        int higher = max(numero1,numero2,numero3);

        System.out.println(higher);
//
//        Showresult(higher);
        }

    public static int max(int a, int b, int c) {
        int aux;
        if ( a > b && a > c ) {
        aux = a;
        } else if ( b > c ) {
        aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
    public static void String(){
        System.out.println();
    }
}
