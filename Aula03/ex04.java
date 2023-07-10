// (4) Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação
// entre eles, se ambos forem iguais. Caso o primeiro seja maior que o segundo, 
// mostre a subtração do primeiro pelo segundo. Caso contrário, mostre a soma entre os dois.


package Aula03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mult, sub, soma;

        System.out.print("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        if(numero1 == numero2){
            mult = numero1 * numero2;
            System.out.print(mult);
        }else if(numero1 > numero2){
            sub = numero1 - numero2;
            System.out.print(sub);
        }else if(numero2 > numero1){
            soma = numero1 + numero2;
            System.out.print(soma);
        }
    }
}
