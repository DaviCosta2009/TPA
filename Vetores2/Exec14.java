package vetores2;

import java.util.Scanner;

public class Exec14 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        
        int i;
        

        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }
        
        for (i = 0; i < TAM; i++) {
        	
        	if (A[i] % 2 == 0 ) {
        		B[i] = 1;
        		
        	} else {
        		B[i] = 0;
        	}
        }
        
        
        System.out.println();
        
        for (i = 0; i < TAM; i++) {
            System.out.print(B[i] + " | ");
        }
        
        

        leia.close();
    }
}
