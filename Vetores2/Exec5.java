package vetores2;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int[] A = new int[10];
        
        int i;
        
        int elemento;
        
        int j;
        
        
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero inteiro: ");
            A[i] = leia.nextInt();
        }

        
        System.out.println("- Divisores de cada elemento -");
        
        for (i = 0; i < 10; i++) {
            elemento = A[i];
            System.out.print("Elemento " + elemento + ": Divisores: ");
            
           
            j = 1;
            while (j <= elemento) {
                if (elemento % j == 0) {
                    System.out.print(j);
                    
                    
                    if (j < elemento) { 
                        System.out.print(", ");
                    }
                }
                j = j + 1;
            }
            
            System.out.println();
        }
        
        leia.close();
    }
}
