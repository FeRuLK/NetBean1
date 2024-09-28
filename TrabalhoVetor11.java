package br.edu.ifsc.exel.metodos;

import java.util.Scanner;

public class TrabalhoVetor11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ValorImpar = 0;
        int [] A = new int [10];
        
        System.out.println("Informe 10 valores inteiros para o vetor A: ");
        for (int i = 0; i < 10; i++) {
            A[i] = in.nextInt();
            
            if (A[i] % 2 != 0) {
                ValorImpar++;
            }
        }
        System.out.println("O total de números ímpares é " + ValorImpar + " e o percentual do valor total "
                + "de números ímpares em relação à quantidade total de elementos armazenados no Vetor é " + (ValorImpar/10) * 100 + "%");
    }
    
}
