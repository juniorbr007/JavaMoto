package Aula05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        
        System.out.println("Insira o segundo número: ");
        int segundoNumero = scanner.nextInt();
        
        System.out.println("Insira o terceiro número: ");
        int terceiroNumero = scanner.nextInt();
        
        int[] numeros = {primeiroNumero, segundoNumero, terceiroNumero};
        
        if (isFirstGreater(numeros)) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
        
        scanner.close();
    }
    
    public static boolean isFirstGreater(int[] numeros) {
        int primeiroNumero = numeros[0];
        int segundoNumero = numeros[1];
        int terceiroNumero = numeros[2];
        
        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            return true;
        } else {
            return false;
        }
    }
}