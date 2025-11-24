package treinos;

import java.util.Scanner;

public class vetores {
	
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int[] A = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            A[i] = leia.nextInt();
        }
        
        System.out.println("--- Números Primos ---");
        
        
        for (int j = 0; j < 10; j++) { //o j é usado por causa que pode dar problema 2 loops com o mesmo indice
            
            int n = A[j];             
            int primo = 1;            
            
            
            if (n <= 1) { //ja desclassifica ser primo se ele for menor ou igual a 1
                primo = 0;      
                
            }else { 
                
                for (int i = 2; i < n; i++) {
                    
                    
                    if (n % i == 0) { // se o resto da divisão do número pelo indice for igual a zero não é primo
                        primo = 0;    
                    }
                }
            }
            
            
            if (primo == 1) {  //se for igual a a 1 é primo    
                System.out.print(n + " É primo");
                System.out.println();
            } else { //se for igual a 0 não é primo    
                System.out.print(n + " Não é primo");
                System.out.println();
            }
            
        }
        
        leia.close();
    }
}
