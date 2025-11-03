package vetores2;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] A = new int[5];

     
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            A[i] = leia.nextInt();
        }

       
        System.out.println("\n--- Tabuadas ---\n");
        for (int elemento : A) {
            System.out.println("Tabuada do " + elemento + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(elemento + " x " + i + " = " + (elemento * i));
            }
            
            System.out.println();
        }

        leia.close();
    }
}
