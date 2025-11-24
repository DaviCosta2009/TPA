package vetores2;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int[] A = new int[10];
        
        int i;
        
        int elemento; //pra armazenar um valor temporariamente
        
        int j;  // vai ser usado para testar cada número como um divisor
        
        
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero inteiro: ");
            A[i] = leia.nextInt();
        }

        
        System.out.println("- Divisores de cada elemento -");
        
        for (i = 0; i < 10; i++) {
            elemento = A[i];
            System.out.print("Elemento " + elemento + " Divisores: ");
            
           
            j = 1;
            while (j <= elemento) {
                if (elemento % j == 0) { //se o resto da divisão por j for 0, então achamos um divisor
                    System.out.print(j);
                    
                    
                    if (j < elemento) {  // só mostra a virgula se não for o ultimo numero da sequencia
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
