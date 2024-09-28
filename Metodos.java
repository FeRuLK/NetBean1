package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class Metodos {
/*
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int countA = 0;
        int countB = 0;

        // Solicita ao usuário que digite 5 números inteiros
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();

            // Verifica se o número é par ou ímpar e o adiciona ao vetor correspondente
            if (num % 2 == 0) {
                A[countA] = num;
                countA++;
            } else {
                B[countB] = num;
                countB++;
            }
        }

        // Exibe o vetor A (contendo os números pares)
        System.out.print("Vetor A (números pares): ");
        for (int i = 0; i < countA; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        // Exibe o vetor B (contendo os números ímpares)
        System.out.print("Vetor B (números ímpares): ");
        for (int i = 0; i < countB; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
