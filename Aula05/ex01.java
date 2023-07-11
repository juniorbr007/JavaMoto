// (1) Faça o design de uma função "maior" que receba dois números [inteiros e positivos] e 
// retorne o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem 
// "Os números são iguais".
package Aula05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o valor de A: ");
        int numero2 = scan.nextInt();
        
        int resultado = maior(numero1, numero2);
        if (resultado == -1) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O maior número é: " + resultado);
        }
    }
    
    public static int maior(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        } else {
            return -1; // Números são iguais
        }
    }
}