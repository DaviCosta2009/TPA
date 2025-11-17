package vetores2;

import java.util.Scanner;

public class Exec11 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        
        int x;
        int i;
        int encontrado = 0;
        int posicao = -1;

        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }
        
        
        System.out.print("Digite o elemento X a ser procurado: ");
        
        x = leia.nextInt();

        
        for (i = 0; i < TAM; i++) {
        	
            if (A[i] == x) {
            	
                encontrado = 1;
                posicao = i;
                
            }
        }

        
        System.out.println();
        
        
        if (encontrado == 1) {
            
        	System.out.println("Elemento " + x + " encontrado na posicao " + posicao);
        
        } else {
            
        	System.out.println("Elemento " + x + " não encontrado no vetor A.");
        	
        }
        
        leia.close();
    }
}
