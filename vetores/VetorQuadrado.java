package vetores;

import java.util.*;

public class VetorQuadrado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor A");
			a[i] = leia.nextInt();
			
			b[i] = a[i]*a[i];
			
		}
		
		System.out.print("O quadrado dos numeros do vetor A é:");
		
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		
		leia.close();

	}

}
