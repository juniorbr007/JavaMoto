// (3) Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.


package Aula03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        if(numero1 % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impa");
        }
    }
}
