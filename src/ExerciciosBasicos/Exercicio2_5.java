package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 5");
        System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item e a " +
                "quantidade deste item. A\n" +
                "seguir, calcule e mostre o valor da conta a pagar.\n\n" +
                "1 Cachorro Quente R$ 4.00\n" +
                "2 X-salada R$ 4.50\n" +
                "3 X-Bacon R$ 5.00\n" +
                "4 Torrada simples R$ 2.00\n" +
                "5 Refrigerante R$ 1.50");

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
