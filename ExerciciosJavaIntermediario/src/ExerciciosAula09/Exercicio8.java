package ExerciciosAula09;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int i;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro positivo: ");
            int n = scan.nextInt();
            char[] caractereNovo = new char[n];

            for (i = 0; i < n; i++) {
                System.out.println("Digite um caractere qualquer: ");
                caractereNovo[i] = scan.next().charAt(0); 
            }

         
            for (i = 0; i < n / 2; i++) {
                char temp = caractereNovo[i];
                caractereNovo[i] = caractereNovo[n - 1 - i];
                caractereNovo[n - 1 - i] = temp;
            }

            System.out.println("Vetor invertido:");
            for (char c : caractereNovo) {
                System.out.print(c + " ");
            }
            System.out.println(); 
        }
    }
}
