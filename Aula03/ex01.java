// (1) Faça um programa que receba dois números e mostre o maior deles. 
// Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".



package Aula03;
import java.util.Scanner;
import static java.lang.Math.pow;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();
        System.out.printf("Digite o segundo numero: ");
            double numero2 = scan.nextDouble();

        if( numero1> numero2 ){
           System.out.println("O maior numero e: "+numero1);
        }else if( numero2 > numero1){
             System.out.println("O maior numero e: "+numero2);
        }else if (numero1 == numero2)
             System.out.println("Os números sao iguais. "+numero1+" é igual a "+numero2);
    }
}
