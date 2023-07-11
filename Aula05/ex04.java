package Aula05;

import java.util.Scanner;

public class ex04 {
     public static void main(String[] args) {
        double[] vetor = new double[5];
        
        preencherVetor(vetor);
        dividir100(vetor);
        
        System.out.println("Valores do vetor divididos por 100:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    
    public static void preencherVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira os valores do vetor (entre 1 e 100):");
        for (int i = 0; i < vetor.length; i++) {
            double valor = scanner.nextDouble();
            vetor[i] = valor;
        }
        
        scanner.close();
    }
    
    public static void dividir100(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] /= 100;
        }
    }
}