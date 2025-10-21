package vetores;

import java.util.Scanner;

public class VetorMedia {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        final int TAM = 10;
        int[] a = new int[TAM];
        int soma = 0;
        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
            a[i] = leia.nextInt();
            soma += a[i]; 
        }

        double media = (double) soma / TAM;
        
        System.out.println("A média dos valores é: " + media);
        
        leia.close();
    }
}



