package vetores2;

import java.util.Scanner;

public class Exec10 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);

        int TAM = 10; //constante com valor 10 (máximo)
        int TAMC = 0; 

        int[] A = new int[TAM]; //declaração de vetores
        int[] B = new int[TAM];
        int[] C = new int[TAM]; 

        int i, j, k; //  3 tipos de indices pra cada vetor...
        int existeEmC, existeEmB; //variaveis para valores existentes
        

        
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
        }

        
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° elemento de B: ");
            B[i] = leia.nextInt();
            
        }

        
        for (i = 0; i < TAM; i++) { 
            existeEmB = 0; 

            
            for (j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    existeEmB = 1; //se o número na posição do indice i for o mesmo da posição do indice j significa que aquele valor existem em B
                          
                }
            }

            
            
            if (existeEmB == 0) {
                existeEmC = 0; 

               
                for (k = 0; k < TAMC; k++) {
                    if (A[i] == C[k]) {
                        existeEmC = 1; //se o número na posição do indice i for o mesmo da posição do indice k significa que aquele valor existem em C
                        
                    }
                }

                
                if (existeEmC == 0) {
                    C[TAMC] = A[i];
                    TAMC = TAMC + 1; 
                    
                    
                }
            }
        }

        
        int[] C1 = new int[TAMC];
        
        for (i = 0; i < TAMC; i++) {
            
            C1[i] = C[i]; 
        }

        
        System.out.println("--- Diferenca Vetor C ---");
        
        System.out.print("C = {");
        
        for (i = 0; i < TAMC; i++) {
        	
        	
            System.out.print(C1[i]);
            
            if (i < TAMC - 1) {
                System.out.print(", ");
                
                
            }
        }
        
        
        System.out.println("}");

        leia.close();
    }
}
