package exerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 8");
        System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus " +
                "impostos, pois sabem\n" +
                "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da " +
                "população, sem\n" +
                "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\n" +
                "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, " +
                "calcule e\n" +
                "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo\n");

        System.out.println("Renda / Imposto de Renda\n" +
                "de 0.00 a R$ 2000.00 / Isento\n" +
                "de R$ 2000.01 até R$ 3000.00 / 8%\n" +
                "de R$ 3000.01 até R$ 4500.00 / 18%\n" +
                "acima de R$ 4500.00 / 28%\n");

        System.out.println("Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de\n" +
                "salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é\n" +
                "de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com\n" +
                "duas casas decimais.");

        double salario;
        double valorPagar = 0;
        double porcentagemDesconto;

        System.out.print("Imforme o salario atual para se calcular o imposto de renda: ");
        salario = sc.nextDouble();

        if (salario > 0 && salario < 2000) {
            valorPagar = 0;
        } else if (salario > 2000 && salario < 3000) {
            valorPagar = (salario - 2000) * 0.08;
        } else if (salario > 3000 && salario < 4500) {
            valorPagar = ((salario - 3000) * 0.18) + (1000 * 0.08);
        } else if (salario > 4500) {
           valorPagar = ((salario - 4500) * 0.28) + (1000 * 0.08) + (1500 * 0.18);
        }

        System.out.println(valorPagar);
    }
}
