// Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

package Aula02;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B , C;
        double media;

        System.out.printf("Digite a primeira nota: \n");
	        A = scan.nextInt();
        System.out.printf("Digite a segunda nota: \n" );
            B = scan.nextInt();
        System.out.printf("Digite a segunda nota: \n");
            C = scan.nextInt();


        System.out.println("Sua primeira nota é :"+A);
        System.out.println("Sua segunda nota é: "+B);
        System.out.println("Sua terceira nota é: "+C);
        
        media = (A+B+C)/3;
        
        System.out.println("Sua media é; "+media);
        
    }
}
