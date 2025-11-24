package vetores2;

import java.util.Scanner;

public class Exec4 {
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

        
        System.out.println("- Pares de 0 ate o elemento -");
        for (i = 0; i < 10; i++) {
            elemento = A[i];
            System.out.print("Elemento " + elemento + ": Pares: ");
            
            
            j = 0; // j começa em 0 porque vamos contar pares
            
            while (j <= elemento) {  // sempre que j for menor ou igual ao elemento vamos mostrar os pares
                
                System.out.print(j); //mostra o valor atual 
                
                //só vai mostrar a vírgula se nao for o último número da sequência
                if (j + 2 <= elemento) {
                    System.out.print(", ");
                }
                j = j + 2; // adiciona de 2 em 2 pra pegar somente números pares
            }
            System.out.println(); 
        }
        
        leia.close();
    }
}
