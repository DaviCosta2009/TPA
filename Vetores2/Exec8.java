package vetores2;

import java.util.Scanner;

public class Exec8 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        
        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        
        int i;
        int j; //segundo indice
        
        int soma;
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            
            A[i] = leia.nextInt();
        }

        
        for (i = 0; i < TAM; i++) {
            soma = 0;
            
            // laço para a soma...
            for (j = i; j < TAM; j++) { //usa o j pra nao dar problema com o outro indice
                soma = soma + A[j];
            }
            B[i] = soma; // armazena o resultado no vetor B
        }

        
        System.out.println("-- Vetor A --"); //mostra o vetor A
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.println("A[" + i + "] = " + A[i]);
        }
        
        
        System.out.println("-- Somatorio a partir de i --"); //mostra o vetor B
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.println("B[" + i + "] = " + B[i]);
            
        }
        
        leia.close();
        
    }
}
