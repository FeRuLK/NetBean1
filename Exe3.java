
package br.edu.ifsc.exel.metodos;

import java.util.Scanner;


public class Exe3 {
    public static void main(String[] args) {
    int maiores = 0;
    maiores = maiores + VerificadorIdade();
    maiores = maiores + VerificadorIdade();
    maiores = maiores + VerificadorIdade();
    maiores = maiores + VerificadorIdade();
    maiores = maiores + VerificadorIdade();
        System.out.println("Maiores de idade: " + maiores);
    }
    
    public static int VerificadorIdade() {
        Scanner in = new Scanner(System.in);
        int idade;
        int idadeOk = 1;
        
        System.out.println("Informe a idade: ");
        idade = in.nextInt();
        if(!(idade >= 1 && idade <= 100)) {
            System.out.println("Idade inválida!");
            idadeOk = 0;
            
        }
        if (idade <= 18) {
            idadeOk = 0;
        }
        return idadeOk;
    }
}
