package vetores2;

import java.util.Scanner;

public class Exec7 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int TAM = 15;
        
        int[] A = new int[TAM];
        int[] B = new int[TAM]; 
        
        int i;
        int j;
        
        int numero;
        int fatorial;

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero inteiro (Recomendado 0 a 12): "); // é recomendado porque passando de 12 da erro.
            A[i] = leia.nextInt();
        }

        
        System.out.println("-- Fatoriais --");
        for (i = 0; i < TAM; i++) {
            numero = A[i];
            
            
            fatorial = 1; 
            
            if (numero < 0) {
                fatorial = 0; 
            } else {
               
                j = 2;
                while (j <= numero) {
                    fatorial = fatorial * j;
                    j = j + 1;
                }
            }
            
            B[i] = fatorial;
            System.out.println("Fatorial de " + A[i] + " é: " + B[i]);
            

        }
        
        leia.close();
    }
}
