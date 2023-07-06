package Aula02;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o seu salario: \n");
	       Double A = scan.nextDouble();

           double salario = A * 1.25;

           System.out.println("Novo salario: "+salario);
    }

}
