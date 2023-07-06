//Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
//Dica: use include static java.lang.Math.pow; com a função pow


package Aula02;
import java.util.Scanner;
import static java.lang.Math.pow;

public class ex05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();
        System.out.printf("Digite o segundo numero: ");
            double numero2 = scan.nextDouble();

        if( (numero1 >= 0) && (numero2 >= 0)  ){

            double potencia = pow(numero1, numero2);

            System.out.println("Potencia dos numeros: "+potencia);
        }else{
            System.out.println("Insira numeros >= 0 ");
        }
        
    }
}
