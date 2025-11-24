package vetores2;

import java.util.Scanner;

public class Exec15 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        
        int i;
        

        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }
        
        System.out.println();
        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de B: ");
            B[i] = leia.nextInt();
            
        }
        
        System.out.println();
      
        
        for (i = 0; i < TAM; i++) { 
        	
        	if (A[i] > B[i] ) {// se o valor do indice A for maior que o de B, C recebe 1
        		
        		C[i] = 1;
        		
        	} else if (A[i] == B[i]) {// se o valor do indice A for igual o de B, C recebe 0
        		C[i] = 0;
        		
        	} else {// se o valor do indice A for menor que o de B, C recebe -1
        		C[i] = -1;
        	}
        }
        
        
        System.out.println();
        for (i = 0; i < TAM; i++) {
            System.out.print(C[i] + " | ");
        }
        
        

        leia.close();
    }
}
