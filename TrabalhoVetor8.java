package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] W = new int [9];
        double [] Y = new double [9];
        
        System.out.println("Digite 9 números inteiros para o vetor W: ");
        for (int i = 0; i < 9; i++) {
            W[i] = in.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                Y[i] = W[i] / 2; 
            } else {
                Y[i] = W[i] * 5;
            }
        }
        System.out.println("Os valores do vetor Y são: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(Y[i]);
        }
    }
    
}
