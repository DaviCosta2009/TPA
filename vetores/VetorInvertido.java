package vetores;

import java.util.*;

public class VetorInvertido {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor A");
			a[i] = leia.nextInt();
			
		}

		
		for (i = 0; i < TAM; i++) {
			b[i] = a[TAM - 1 - i];
		}
		
		System.out.print("O vetor B é: ");
		
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		
		leia.close();

	}
	
	

}
