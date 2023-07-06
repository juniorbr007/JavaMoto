package Aula02;
import java.util.Scanner;
public class ex04 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular um Triangulo !, informe a base e a altura --");
        System.out.printf("Digite a base do triangulo: ");
            int base = scan.nextInt();
        System.out.printf("Digita a altura do triangulo:");
            int altura = scan.nextInt();

        int area = (base * altura)/2;

        System.out.println("A area do triangulo é: "+area);
        
    }
}
