// (2) Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir 
// "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os 
// outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".

package Aula03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}