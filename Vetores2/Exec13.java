package vetores2;

import java.util.Scanner;

public class Exec13 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        int[] A = new int[TAM];
        
        int i,idireita;
        int palindromo = 1;

        
        for (i = 0; i < TAM; i++) {
        	
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }
        
        i = 0;
        
        while (i < TAM/2) {
        	idireita = TAM - 1 - i;
        	
        	if (A[i] != A[idireita])	{	//o != serve pra indicar se é diferente
        		palindromo = 0; //mostra que não é caso verdadeiro
        	}
        	i++;
        }
        
        if (palindromo == 1) {
            System.out.println("O vetor A é um palindromo");
            
        } else {
            System.out.println("O vetor A não e um palindromo");
            
        }
        
        

        leia.close();
    }
}
