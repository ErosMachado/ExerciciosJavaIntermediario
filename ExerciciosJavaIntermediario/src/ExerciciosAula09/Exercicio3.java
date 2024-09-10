package ExerciciosAula09;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro maior que 0: ");
        int n = scanner.nextInt();
        
        
        double[] vetor = new double[n];
        Random random = new Random();
        
        double min = 0.0;   // Limite inferior
        double max = 100.0; // Limite superior

        for (int i = 0; i < n; i++) {
            vetor[i] = min + (random.nextDouble() * (max - min));  
        }
        
        System.out.println("Números gerados:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }

	
}
