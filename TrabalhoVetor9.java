package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, valorA = 0, valorB = 0;
        int[] A = new int [5];
        int[] B = new int [5];
        
        System.out.println("Informe 5 números inteiros: ");
        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            
            if (num % 2 == 0) {
                A[valorA] = num;
                valorA++;
            } else {
                B[valorB] = num;
                valorB++;
            }
        }
        
        System.out.println("Os valores do vetor A são: ");
        for (int i = 0; i < valorA; i++) {
            System.out.println(A[i] + " ");
        }
        
        System.out.println("Os valores do vetor B são: ");
        for (int i = 0; i < valorB; i++) {
            System.out.println(B[i] + " ");
        }
    }
    
}
