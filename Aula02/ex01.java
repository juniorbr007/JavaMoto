// (1) Faça um programa que receba quatro
// números inteiros, calcule e mostre a soma desses números.

package Aula02;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
		
		int A, B, C, D, soma;

        System.out.printf("Digite o primeiro valor: \n");
	    A = scan.nextInt();
	    System.out.printf("Digite o segundo valor: \n");
	    B = scan.nextInt();
         System.out.printf("Digite o terceiro valor: \n");
	    C = scan.nextInt();
         System.out.printf("Digite o quarto valor: \n");
	    D = scan.nextInt();

        soma = (A + B + C + D);

        System.out.println("Resultado da soma: "+ soma);
}
}
