package Aula05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Digite a chave de busca:");
        int chave = scanner.nextInt();
        
        int indice = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                indice = i;
                break;
            }
        }
        
        if (indice != -1) {
            System.out.println("A chave foi encontrada no índice: " + indice);
        } else {
            System.out.println("Chave não encontrada.");
        }
        
        scanner.close();
    }
}

