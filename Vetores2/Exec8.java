package vetores2;

import java.util.Scanner;

public class Exec8 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        
        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        
        int i;
        int j;
        
        int soma;
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            
            A[i] = leia.nextInt();
        }

        
        for (i = 0; i < TAM; i++) {
            soma = 0;
            
            
            for (j = i; j < TAM; j++) {
                soma = soma + A[j];
            }
            B[i] = soma;
        }

        
        System.out.println("--- Vetor A ---");
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.println("A[" + i + "] = " + A[i]);
        }
        
        
        System.out.println("--- Somatorio a partir de i ---");
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.println("B[" + i + "] = " + B[i]);
            
        }
        
        leia.close();
        
    }
}
