package vetores2;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int[] A = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            A[i] = leia.nextInt();
        }
        
        System.out.println("\n--- Números Primos ---\n");
        
        
        for (int j = 0; j < 10; j++) {
            
            int num = A[j];             
            int Primo = 1;            
            
            
            if (num <= 1) { 
                Primo = 0;            
            } 
            
            else { 
                
                for (int i = 2; i < num; i++) {
                    
                    
                    if (num % i == 0) {
                        Primo = 0;    
                    }
                }
            }
            
            
            if (Primo == 1) { 
                System.out.print(num + " É primo");
                System.out.println();
            } else {
                System.out.print(num + " Não é primo");
                System.out.println();
            }
        }
        
        leia.close();
    }
}
