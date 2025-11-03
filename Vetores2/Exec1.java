package vetores2;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {

        //Scanner...
        Scanner leia = new Scanner(System.in);

        // Declaração de vetores
        int[] A = new int[20];
        int[] B = new int[20];

        
        int j = 0; //segundo indice...

        
        System.out.println("Por favor, digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + (i+1) + "]: ");
            A[i] = leia.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++; 
            }
        }

        
        // Se o resto da divisão por 2 for diferente de 0 (ou seja, 1), o número é ÍMPAR.
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[j] = A[i];
                j++; 
            }
        }


        System.out.println("\n--- Resultado do vetor B ---");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        
        leia.close();
    }
}
