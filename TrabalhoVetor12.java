package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int SomaPos = 0, QtdNeg = 0;
        int [] X = new int [50];
        
        System.out.println("Informe 50 numeros inteiros: ");
        for (int i = 0; i < 50; i++) {
            X[i] = in.nextInt();
            
            if (X[i] >= 0) {
                SomaPos += X[i];
            }
            
            if (X[i] < 0) {
                QtdNeg++;
            }
        }
        System.out.println("A soma dos números positivos é igual a " + SomaPos);
        System.out.println("A quantidade de números negativos é igual a " + QtdNeg);
    }
    
}