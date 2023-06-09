package ExerciciosBasicos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 3");
        System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus " +
                "clientes. Escreva\n" +
                "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2." +
                "Gasolina 3.Diesel\n" +
                "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo " +
                "código (até\n" +
                "que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito " +
                "a\n" +
                "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível, " +
                "conforme\n" +
                "exemplo.");

        int codigo = 0;
        int quantidade = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o codigo do combustivel: ");

        while (codigo != 4) {
            codigo = sc.nextInt();
            if(codigo == 1){
                alcool ++;
            }else if (codigo == 2){
                gasolina ++;
            }else if (codigo == 3){
                diesel ++;
            }
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool = "+ alcool);
        System.out.println("Gasolina = "+ gasolina);
        System.out.println("Diesel = "+ diesel);
    }
}
