package ExerciciosAula08;
import java.util.Random;

public class Exercicio6 {

    public static void main(String[] args) {
        Random rand = new Random();
        int numPares = 0, numImpares = 0, numPrimos = 0, num = 0;
        boolean primo;

        for (int i = 0; i < 100; i++) {
            num = rand.nextInt(101); 
            
            if (num % 2 == 0) {
                numPares = numPares+1;
            } else {
                numImpares++;
            }
            
            for (int k = 2; i <= num; i++) { 
            	 primo = true; 
            	for (int j = 2; j < i; j++) { 
            		if (i % j == 0) { 
            			primo = false; 
            			break; 
            		} 
            	}
            }
           
            if (primo=true) {
                numPrimos++;
            }
        
        }
        System.out.println("Pares: " + numPares);
        System.out.println("Ímpares: " + numImpares);
        System.out.println("Primos: " + numPrimos);
    

    }
}
