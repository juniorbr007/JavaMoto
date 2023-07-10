
//(5) Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário 
//escolher entre: 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá
// processar dois números inteiros por vez.

package Aula03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha a operação: \n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n");
        int escolha = scan.nextInt();

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        switch (escolha) {
            case 1:
                int soma = numero1 + numero2;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                int subtracao = numero1 - numero2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                int multiplicacao = numero1 * numero2;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = (double) numero1 / numero2;
                    System.out.println("O resultado da divisão é: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}