package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ValorPar = 0, ValorImpar = 0;
        int [] A = new int [10];
        
        System.out.println("Informe 10 valores inteiros: ");
        for (int i = 0; i < 10; i++) {
            A[i] = in.nextInt();
            
            if (A[i] % 2 == 0) {
                ValorPar++;
            } else {
                ValorImpar++;
            }
        }
        
        System.out.println("No vetor A existem " + ValorPar + " números pares e " + ValorImpar + " números ímpares.");
    }
    
}
