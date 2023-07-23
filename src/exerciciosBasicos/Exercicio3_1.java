package exerciciosBasicos;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 1");
        System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida. " +
                "Para cada leitura de senha\n" +
                "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada " +
                "corretamente deve ser\n" +
                "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha " +
                "correta é o valor 2002.");

        int senha = 0;

        while (senha != 2002){
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
            System.out.println("Senha incorreta, tente novamente:");
        }

        System.out.println("Acesso permitido");
        System.out.println("Fim");
    }
}