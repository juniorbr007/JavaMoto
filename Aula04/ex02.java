//(2) Desenvolva um algoritmo que receba dois números inteiros positivos A e B. Exiba na tela
// todos os números inteiros compreendidos entre A e B, excluindo os próprios A e B. 
// Suponha que o usuário respeite o enunciado e insira valores válidos para A e B.
package Aula04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scan.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scan.nextInt();

        // Verifica qual é o menor e o maior número entre A e B
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        // Exibe os números compreendidos entre A e B
        for (int i = menor + 1; i < maior; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Pula uma linha na saída
    }
}

