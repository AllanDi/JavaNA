package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 6");
        System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma " +
                "mensagem dizendo em qual dos seguintes intervalos " +
                "([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\n" +
                "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");

        double valor;
        int codigo;
        String produto;
        int quantidade;
        double total;

        System.out.println("Digite o codigo do produto e a quantidade de produtos: ");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1){
            produto = "Cachorro Quente";
            valor = 4.00;
        } else if (codigo == 2) {
            produto = "X-Salada";
            valor = 4.50;
        } else if (codigo == 3) {
            produto = "X-Bacon";
            valor = 5.00;
        } else if (codigo == 4) {
            produto = "Torrada Simples";
            valor = 2.00;
        } else {
            produto = "Refrigerante";
            valor = 1.50;
        }

        total = quantidade * valor;

        System.out.println("O valor total da compra é: "+ total);
    }
}
