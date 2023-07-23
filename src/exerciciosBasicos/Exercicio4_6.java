package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 6");

        System.out.println("Ler um número inteiro N e calcular todos os seus divisores.\n");

        System.out.println("Digite um numero para ser calculado seus divisores: ");
         int numero = sc.nextInt();

         for(int i = 1; i <= numero; i++){

             if(numero % i == 0){
                 System.out.println(i);
             }
         }
    }
}

