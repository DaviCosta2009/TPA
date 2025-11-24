package vetores2;

import java.util.Scanner;

public class Exec9 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        int TAM = 10;
        int TAMC = 0; 
        
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM]; 
        
        
        int i, j, k; //  3 tipos de indices pra cada vetor...
        
        int encontrado; // usa valores de 1 e 0 para ver se tem no vetor B ( 0 e falso e 1 é verdadeira)
        int existeEmC; //evitar numeros duplicados no vetor C

       
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° elemento de A: ");
            A[i] = leia.nextInt();
            
            
        }
        
        
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° elemento de B: ");
            B[i] = leia.nextInt();
            
            
        }

        
        
        for (i = 0; i < TAM; i++) { 
            encontrado = 0; 
            
            //verifica se o valor da posiçao i do vetor A exeiste em b
            for (j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    encontrado = 1; //se existir esta na interseção
                    
                }
            }
            
             // Só continua se o elemento foi encontrado em b
            if (encontrado == 1) {
            	existeEmC = 0; //fala que nao esta em c ainda
                for (k = 0; k < TAMC; k++) { //verifica se ja esta no vetor C evitando copias
                    if (A[i] == C[k]) {
                    	existeEmC = 1; //se existir não adiciona
                        
                    }
                }
                
                 //se não existe em C, adiciona e aumenta o tamanho de c
                if (existeEmC == 0) {
                    C[TAMC] = A[i];
                    TAMC = TAMC + 1;
                }
            }
        }
        
        
        System.out.println("\n--- Intersecao Vetor C ---"); 
        System.out.print("C = {");
        
        //mostra a interseção
        for (i = 0; i < TAMC; i++) {
            System.out.print(C[i]);
            
            if (i < TAMC - 1) {
                System.out.print(", ");
                
            }
            
        }
        System.out.println("}");
        
        leia.close();
        
    }
}
