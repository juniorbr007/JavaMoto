// (4) Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos
// A e B, no qual A deve ser menor que B (supõe-se que o usuário irá respeitar esse enunciado). 
// O algoritmo deve mostrar, na tela, todos os números ímpares compreendidos entre A e B (inclusive).

package Aula04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scan.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scan.nextInt();

        System.out.println("Números ímpares compreendidos entre " + a + " e " + b + ":");

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Pula uma linha na saída
    }
    }