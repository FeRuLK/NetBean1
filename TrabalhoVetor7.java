package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] X = new int[12];
        int [] Z = new int[12];
        
        System.out.println("Digite 12 números inteiros para o vetor X: ");
        for (int i = 0; i < 12; i++) {
            X[i] = in.nextInt();
        }
        
        for (int i = 0; i < 12; i++) {
            if (X[i] % 2 != 0) {
                Z[i] = X[i] * 2;
            } else {
                Z[i] = X[i];
            }
        }
        System.out.println("Os valores do vetor Z são: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(Z[i]);
        }
    }
    
}
