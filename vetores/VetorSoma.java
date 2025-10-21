package vetores;

import java.util.*;

public class VetorSoma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], c[], i;
		
		a=new int[TAM];
		b=new int[TAM];
		c=new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = leia.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i] = leia.nextInt();
			c[i] = a[i]+b[i];
		}
	

		System.out.println("valores do Vetor C:");
		
		for(i=0; i<TAM; i++) {
			System.out.println(c[i]+" ");
		}
		
		leia.close();
	}
}


