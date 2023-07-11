package Aula05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        parImpar(primeiroNumero);
    }
    
    public static void parImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}







