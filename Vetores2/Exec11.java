package vetores2;

import java.util.Scanner;

public class Exec11 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        
        int x;
        int i;
        int encontrado = 0; //mostra se foi encontrado ou nao
        int posicao = -1; // guarda a posição do elemento encontrado e -1 significa "não encontrado"

        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }
        
        
        System.out.print("Digite o elemento X a ser procurado: ");
        
        x = leia.nextInt();


        //se o valor da posiçao do indice for igual a X encontramos o elemento
        for (i = 0; i < TAM; i++) {
        	
            if (A[i] == x) {
            	
                encontrado = 1; //mostra que foi encontrado
                posicao = i; //guarda a posicao
                
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
