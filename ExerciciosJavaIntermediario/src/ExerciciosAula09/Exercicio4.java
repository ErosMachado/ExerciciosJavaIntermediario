package ExerciciosAula09;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de alunos: ");
        int n = scanner.nextInt();
        
        
        double[] notas = new double[n];
        double soma = 0;
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }
        
      
        double media = soma / n;
        System.out.printf("A m�dia da turma �: %.2f\n", media);
        
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int igualAMedia = 0;
        
      
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else {
                igualAMedia++;
            }
        }
        
        
        System.out.println("Notas acima da m�dia: " + acimaDaMedia);
        System.out.println("Notas abaixo da m�dia: " + abaixoDaMedia);
        System.out.println("Notas iguais � m�dia: " + igualAMedia);
        
        scanner.close();
	}
}
