// (5) Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não. 
// A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

package Aula04;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scan.nextInt();

        boolean ehPrimo = true;

        if (n <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }
}



