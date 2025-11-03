package vetores2;

public class Exec6 { 

    public static void main(String[] args) {

    	
    	final int TAM = 11; 
    	
    	int A[]; 

    	A = new int[TAM];


        int potenciaA = 1; 
        int i;
        
        i = 0;
        while (i < TAM) {
            
            A[i] = potenciaA; 
            
            
            System.out.println("A[" + i + "] = 2^" + i + " = " + A[i]);
            
            
            
            potenciaA = potenciaA * 2; 
            i = i + 1;
        }

    }
}
