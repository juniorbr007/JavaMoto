package Aula04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadePositivos = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scan.nextInt();

            if (numero > 0) {
                quantidadePositivos++;
            }
        } while (numero != 0);

        System.out.println("A quantidade de números positivos digitados foi: " + quantidadePositivos);
    }
}